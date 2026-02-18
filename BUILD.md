# Ref Cards Android App

An Android application built with Kotlin that displays yellow and red cards similar to those used in football/soccer.

## Features

- **Show Yellow Card**: Display a bright yellow card on the screen
- **Show Red Card**: Display a red card on the screen
- **Reset**: Clear the card display

## Technical Details

- **Language**: Kotlin
- **Minimum SDK**: Android 7.0 (API 24)
- **Target SDK**: Android 14 (API 34)
- **Architecture**: Single Activity with Material Design Components

## Building the App

### Prerequisites

- Android Studio Arctic Fox or later
- Android SDK 34
- Kotlin 1.9.0 or later
- Gradle 8.0 or later

### Build Instructions

1. Clone the repository
2. Open the project in Android Studio
3. Sync Gradle files
4. Run the app on an emulator or physical device

Or from the command line:

```bash
./gradlew assembleDebug
```

## Usage

1. Launch the app on your Android device
2. Tap "Show Yellow Card" to display a yellow card
3. Tap "Show Red Card" to display a red card
4. Tap "Reset" to clear the card display

## Project Structure

```
app/
├── src/main/
│   ├── java/com/example/refcardsapp/
│   │   └── MainActivity.kt          # Main activity with card logic
│   ├── res/
│   │   ├── layout/
│   │   │   └── activity_main.xml    # UI layout
│   │   ├── values/
│   │   │   ├── strings.xml          # String resources
│   │   │   └── themes.xml           # App theme
│   │   └── drawable/                # App icons
│   └── AndroidManifest.xml          # App manifest
└── build.gradle                     # App-level build configuration
```

## License

This project is open source.
