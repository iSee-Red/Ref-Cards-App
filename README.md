# Ref-Cards-App

[![CI](https://github.com/iSee-Red/Ref-Cards-App/workflows/CI/badge.svg)](https://github.com/iSee-Red/Ref-Cards-App/actions/workflows/ci.yml)

An Android application built with Kotlin that displays yellow and red cards like those used by referees in football/soccer matches.

## Features

- 🟨 **Show Yellow Card**: Display a bright yellow warning card
- 🟥 **Show Red Card**: Display a red dismissal card  
- 🔄 **Reset**: Clear the card display
- 📱 Simple and intuitive interface
- 🎨 Material Design with dark theme

## Screenshots

See [UI_MOCKUP.md](UI_MOCKUP.md) for UI design mockups.

## Tech Stack

- **Language**: Kotlin
- **UI Framework**: Android XML Layouts with ConstraintLayout
- **Minimum SDK**: Android 7.0 (API 24)
- **Target SDK**: Android 14 (API 34)
- **Libraries**: AndroidX, Material Components

## Getting Started

See [BUILD.md](BUILD.md) for detailed build instructions.

### Quick Start

1. Clone the repository
2. Open in Android Studio
3. Sync Gradle files
4. Run on emulator or device

## Project Structure

```
Ref-Cards-App/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/refcardsapp/
│   │   │   └── MainActivity.kt
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── activity_main.xml
│   │   │   ├── values/
│   │   │   │   ├── strings.xml
│   │   │   │   └── themes.xml
│   │   │   └── drawable/
│   │   └── AndroidManifest.xml
│   └── build.gradle
├── build.gradle
└── settings.gradle
```

## How It Works

The app uses a simple activity-based architecture:

1. **MainActivity**: Contains the main logic for showing/hiding cards
2. **activity_main.xml**: Defines the UI layout with buttons and card display area
3. **Card Display**: A View that changes color (yellow/red) when buttons are tapped
4. **Card Text**: A TextView that displays "YELLOW CARD" or "RED CARD"

When you tap a button:
- The card display View becomes visible
- Its background color is set to yellow or red
- The text is updated to show the appropriate card type
- The reset button clears the display

## License

Open source project.
 
