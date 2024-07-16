# Product List App

## Introduction
The Product List App is an Android application that fetches and displays a list of products from the [DummyJSON API](https://dummyjson.com/products). The app follows the MVVM (Model-View-ViewModel) architectural pattern and utilizes various Google Android Architecture Components, such as LiveData, ViewModel, and Repository patterns. It also incorporates Hilt for dependency injection and clean architecture principles.

## Features
- Displays a list of products in a RecyclerView
- Each product item shows the product image, title, price, and rating
- Clicking on a product item navigates to a details screen
- Details screen shows additional product information, such as description, category, brand, availability status, and reviews
- Implements search functionality to filter the product list
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

## Installation
1. Clone the repository: `git clone https://github.com/your-username/product-list-app.git`
2. Open the project in Android Studio.
3. Build and run the app on an emulator or a physical device.

## Usage
1. The app will display a list of products fetched from the DummyJSON API.
2. You can tap on a product item to see its details.
3. The search functionality allows you to filter the product list by entering a search query.

## Screenshots
Here are some screenshots of the implemented design:

![image_1](https://github.com/user-attachments/assets/6eca1b9b-c00b-4295-87a5-7b5b759c6281)

![image_2](https://github.com/user-attachments/assets/d95e6501-b277-462f-8284-035892b026fd)

![image_3](https://github.com/user-attachments/assets/09fbf772-c2b3-4997-9608-9d30807f5300)


## Contributions
Contributions to the project are welcome. If you find any issues or have suggestions for improvements, please feel free to create an issue or submit a pull request.


