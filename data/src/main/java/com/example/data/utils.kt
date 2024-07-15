package com.example.data

import com.example.data.api.model.Response
import com.example.domain.common.InternetConnectionError
import com.example.domain.common.Resource
import com.example.domain.common.ServerError
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import java.util.concurrent.TimeoutException

suspend fun <T> executeApi(apiCall: suspend () -> T): T {
    try {
        val response = apiCall.invoke()
        return response
    } catch (ex: HttpException) {
        if (ex.code() in 400..600) {
            val serverResponse = ex.response()?.errorBody()?.string()
            val response = Gson().fromJson(serverResponse, Response::class.java)
            throw ServerError(
                response.message,
                response.statusMsg,
                httpEx = ex,
            )
        }
        throw ex
    } catch (ex: IOException) {
        throw InternetConnectionError(ex)
    } catch (ex: TimeoutException) {
        throw InternetConnectionError(ex)
    } catch (ex: Exception) {
        throw ex
    }
}

suspend fun <T> toFlow(getData: suspend () -> T): Flow<Resource<T>> =
    flow {
        emit(Resource.Loading)
        val response = getData.invoke()
        emit(Resource.Success(response))
    }.flowOn(Dispatchers.IO)
        .catch { ex ->
            when (ex) {
                is ServerError -> {
                    emit(Resource.ServerFail(ex))
                }

                is InternetConnectionError -> {
                    emit(Resource.Fail(ex))
                }

                else -> emit(Resource.Fail(ex))
            }
        }
