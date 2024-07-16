# Product List App

## Introduction
The Product List App is an Android application that fetches and displays a list of products from the [DummyJSON API](https://dummyjson.com/products). The app follows the MVVM (Model-View-ViewModel) architectural pattern and utilizes various Google Android Architecture Components, such as LiveData, ViewModel, and Repository patterns. It also incorporates Hilt for dependency injection and clean architecture principles.

## Features
- Displays a list of products in a RecyclerView
- Each product item shows the product image, title, price, and rating
- Supports both portrait and landscape orientations

## Tech Stack
- **Language**: Kotlin
- **Architecture**: MVVM
- **UI Components**: Android Jetpack (LiveData, ViewModel, RecyclerView)
- **Dependency Injection**: Hilt
- **Networking**: Retrofit
- **Image Loading**: Glide
- **Unit Testing**: JUnit, Mockito

## Project Structure
The project follows a clean architecture approach with the following layers:

1. **Presentation Layer**: Contains the UI components, such as Activities, Fragments, and ViewModels.
2. **Domain Layer**: Defines the business logic and use cases, and contains the models.
3. **Data Layer**: Responsible for data retrieval and manipulation, including the Repository and remote/local data sources.



## Usage
 The app will display a list of products fetched from the DummyJSON API.


## Screenshots
![image_1](https://github.com/user-attachments/assets/b16a9425-5d6f-4df3-83ec-c74d22a8d7b9)
![image_2](https://github.com/user-attachments/assets/041e484c-0300-47d6-b8cd-c73c31687383)
![image_3](https://github.com/user-attachments/assets/d233fd09-b9f1-49bb-9aec-e52436d571fc)

