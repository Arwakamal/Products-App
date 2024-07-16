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
Here are some screenshots of the implemented design:

<div style="display: flex; justify-content: center;">
    <img src="[https://example.com/image1.jpg](https://github.com/user-attachments/assets/6eca1b9b-c00b-4295-87a5-7b5b759c628)" alt="Image 1" style="margin-right: 10px;">
    <img src="[https://example.com/image2.jpg](https://github.com/user-attachments/assets/d95e6501-b277-462f-8284-035892b026f)" alt="Image 2" style="margin-right: 10px;">
    <img src="[https://example.com/image3.jpg](https://github.com/user-attachments/assets/09fbf772-c2b3-4997-9608-9d30807f5300)" alt="Image 3">
</div>

