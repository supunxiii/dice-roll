## Overview

This is a dice roll score tracker developed as an Android mobile application. Dice Roll is a simple, engaging app that simulates rolling two dice, displays the results visually, and keeps track of the current roll score and running total. The application demonstrates core Android development practices with a splash screen, custom fonts, and a clean ConstraintLayout-based interface.

![Android](https://img.shields.io/badge/Android-3DDC84?style=flat-square&logo=android&logoColor=white)
![Java 8](https://img.shields.io/badge/Java-8-007396?style=flat-square&logo=java&logoColor=white)
![Android SDK 33](https://img.shields.io/badge/Android%20SDK-33-3DDC84?style=flat-square&logo=android&logoColor=white)
![Gradle 8.0](https://img.shields.io/badge/Gradle-8.0-02303A?style=flat-square&logo=gradle&logoColor=white)
![Android Gradle Plugin 8.0.1](https://img.shields.io/badge/Android%20Gradle%20Plugin-8.0.1-02303A?style=flat-square&logo=gradle&logoColor=white)
![Material Components 1.5.0](https://img.shields.io/badge/Material%20Components-1.5.0-757575?style=flat-square&logo=material-design&logoColor=white)

## Features

The Dice Roll Android application offers the following features:

1. **Two-Dice Roll Simulation**

   - Randomised roll for a black die and a red die
   - Visual updates with matching dice face images
   - Score calculated per roll based on both dice

2. **Score and Total Tracking**

   - Current roll score displayed in real time
   - Running total accumulates across rolls
   - Reset button clears both dice and score values

3. **Splash Screen Experience**

   - Fullscreen splash screen on launch
   - Branded title and app graphic
   - Automatic transition to the main screen after 5 seconds

4. **Custom UI Styling**

   - ConstraintLayout for responsive positioning
   - Custom fonts (Press Start 2P, Archivo, Faster One, Syne)
   - Themed backgrounds, button shapes, and colour accents

5. **Lightweight Core Logic**

   - Simple Java-based random number handling
   - Minimal dependencies for fast build times
   - Clean activity flow between splash and main screen

## Technologies Used

- **Java 8**: Primary programming language for Android development
  - Source and target compatibility set to Java 8
  - Object-oriented structure for activities and UI logic
- **Android SDK 33**: Android development framework
  - Compile SDK: API Level 33 (Android 13)
  - Minimum SDK: API Level 30 (Android 11)
  - Target SDK: API Level 33 (Android 13)
- **Gradle 8.0**: Build automation and dependency management
  - Gradle Wrapper distribution version 8.0
- **Android Gradle Plugin 8.0.1**: Android build tooling
- **AndroidX Libraries**:
  - AppCompat 1.6.1: Backward compatibility support
  - Material Components 1.5.0: Material Design UI components
  - ConstraintLayout 2.1.4: Advanced layout management
- **Testing Frameworks**:
  - JUnit 4.13.2: Unit testing framework
  - JUnit 4.12: Android instrumentation testing dependency
  - AndroidX Test Ext JUnit 1.1.5: Android instrumentation testing
  - Espresso Core 3.5.1: UI testing automation

## Project Specifications

- **Platform**: Android Mobile Application
- **Programming Language**: Java
- **Minimum Android Version**: Android 11 (API 30)
- **Target Android Version**: Android 13 (API 33)
- **Application ID**: com.example.diceroll
- **Version**: 1.0 (Version Code: 1)
- **Build System**: Gradle with Android plugins
- **Architecture**: Two-activity flow (Splash and Main)

## User Interfaces

### UIs

![Dice Roll UI](https://github.com/supunxiii/supunxiii/blob/7653f59dcf38771e7791a1cc0795c9d6b4cdcd3c/user-interfaces/dice-roll/dice-roll-ui-1.png)

## Getting Started

To run the Dice Roll Android application locally, follow these steps:

1. **Prerequisites**:

   - Install [Android Studio](https://developer.android.com/studio) (Electric Eel or later recommended)
   - Ensure Java Development Kit (JDK) 8 or higher is installed
   - Set up an Android Virtual Device (AVD) or connect a physical Android device

2. Clone the repository:

   ```shell
   git clone https://github.com/supunxiii/dice-roll.git
   ```

3. Navigate to the project directory:

   ```shell
   cd dice-roll
   ```

4. Open the project in Android Studio:

   - Launch Android Studio
   - Select "Open an Existing Project"
   - Navigate to the cloned repository directory
   - Click "OK" to open the project

5. Sync the project with Gradle:

   - Android Studio should automatically prompt to sync
   - If not, click "File" → "Sync Project with Gradle Files"
   - Wait for the sync to complete

6. Run the application:

   - Select your target device (emulator or physical device)
   - Click the "Run" button (green play icon) or press `Shift + F10`
   - The application will build and install on your selected device

7. Alternative: Build from command line:

   ```shell
   # On macOS/Linux
   ./gradlew assembleDebug

   # On Windows
   gradlew.bat assembleDebug
   ```

   The APK will be generated in `app/build/outputs/apk/debug/`

## Project Structure

```
dice-roll/
├── .gradle/                                     # Gradle cache and build files
├── .idea/                                       # Android Studio IDE configurations
├── app/                                         # Main application module
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/diceroll/
│   │   │   │   ├── MainActivity.java            # Dice roll UI and scoring logic
│   │   │   │   └── Splash_Activity.java         # Splash screen activity
│   │   │   ├── res/
│   │   │   │   ├── drawable/                    # Dice images, backgrounds, shapes
│   │   │   │   ├── font/                        # Custom fonts
│   │   │   │   ├── layout/                      # Activity layouts
│   │   │   │   ├── mipmap-*/                    # App icons
│   │   │   │   ├── values/                      # Colours, strings, themes
│   │   │   │   ├── values-night/                # Night theme
│   │   │   │   └── xml/                         # Backup and data extraction rules
│   │   │   └── AndroidManifest.xml              # App manifest
│   │   ├── androidTest/                         # Instrumented tests
│   │   └── test/                                # Unit tests
│   ├── build.gradle                             # App-level build config
│   └── proguard-rules.pro                       # ProGuard rules
├── gradle/                                      # Gradle wrapper files
│   └── wrapper/
├── build.gradle                                 # Project-level build config
├── gradle.properties                            # Gradle properties
├── gradlew                                      # Gradle wrapper script (Unix)
├── gradlew.bat                                  # Gradle wrapper script (Windows)
├── settings.gradle                              # Project settings
└── README.md                                    # This file
```

## Development Guidelines

### Building the Application

To build the project in different configurations:

```shell
# Debug build
./gradlew assembleDebug

# Release build (requires signing configuration)
./gradlew assembleRelease

# Clean and rebuild
./gradlew clean assembleDebug
```

### Running Tests

```shell
# Run unit tests
./gradlew test

# Run instrumented tests (requires connected device/emulator)
./gradlew connectedAndroidTest

# Run all tests
./gradlew testDebug connectedAndroidTest
```

## Contributors

This project was developed by:

- **Supun Wijesooriya** - Developer

## Contributing

Contributions to the Dice Roll application are welcome! If you would like to contribute, please follow these steps:

1. Fork the repository.

2. Create a new branch:

   ```shell
   git checkout -b feature/your-feature-name
   ```

3. Make your changes and commit them:

   ```shell
   git commit -m "Add your commit message"
   ```

4. Push your changes to your forked repository:

   ```shell
   git push origin feature/your-feature-name
   ```

5. Open a pull request to the main repository, describing your changes and the purpose of the pull request.

## Important Notes

- This application requires **Android 11 (API 30) or higher** to run
- The application is optimised for mobile devices running Android 11–13
- Splash screen displays for 5 seconds before the main screen loads
- Dice images and backgrounds are stored in drawable resources for easy customisation
- Uses ConstraintLayout for responsive positioning and consistent spacing
- ProGuard rules are included for code optimisation in release builds

## Future Enhancements

Potential improvements for future versions:

- Dice roll animation and sound effects
- Haptic feedback on roll and reset actions
- Configurable number of dice and sides
- Custom themes and colour schemes
- Statistics screen for roll history
- Persistence for total score across sessions
- Optional quick roll gestures
- Accessibility improvements for larger text and contrast

## Contact

For any inquiries or feedback, please contact the developer:

- **Supun Wijesooriya**: [GitHub Profile](https://github.com/supunxiii)
- **Project Repository**: [dice-roll](https://github.com/supunxiii/dice-roll)

---

**Note:** This is a beginner-friendly programme designed to understand Android native application development. The project covers fundamental concepts including activity lifecycle management, simple randomised game logic, ConstraintLayout-based UI design, resource management (drawables, strings, themes), Material Design components, custom fonts, and AndroidX library integration. This application serves as a practical example of building a small interactive game with score tracking.
