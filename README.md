# Ref-Cards-App

[![CI](https://github.com/iSee-Red/Ref-Cards-App/actions/workflows/ci.yml/badge.svg)](https://github.com/iSee-Red/Ref-Cards-App/actions/workflows/ci.yml)
[![License](https://img.shields.io/badge/license-Open%20Source-blue.svg)](LICENSE)
[![Android](https://img.shields.io/badge/platform-Android-green.svg)](https://www.android.com/)
[![API](https://img.shields.io/badge/API-24%2B-brightgreen.svg)](https://android-arsenal.com/api?level=24)

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

1. Clone the repository:
   ```bash
   git clone https://github.com/iSee-Red/Ref-Cards-App.git
   cd Ref-Cards-App
   ```

2. Open in Android Studio

3. Sync Gradle files

4. Run on emulator or device:
   ```bash
   ./gradlew assembleDebug
   ```

### Running Tests

```bash
# Run unit tests
./gradlew test

# Run lint checks
./gradlew lint

# Build release APK
./gradlew assembleRelease
```

## CI/CD Status

This project uses GitHub Actions for continuous integration and deployment:

- **CI Workflow**: Automatically builds, tests, and runs lint checks on every push and pull request
- **Release Workflow**: Automates the creation of releases with APK artifacts
- **Dependency Review**: Scans for vulnerable dependencies on pull requests

View the [Actions tab](https://github.com/iSee-Red/Ref-Cards-App/actions) for build status and history.

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

## Contributing

We welcome contributions! Please see [CONTRIBUTING.md](CONTRIBUTING.md) for details on:
- Code style guidelines
- Development setup
- Pull request process
- Testing requirements

## Security

For security concerns, please review our [Security Policy](.github/SECURITY.md).

## Changelog

See [CHANGELOG.md](CHANGELOG.md) for a list of changes in each version.

## License

Open source project.
 
