# Quick Start Guide - Ref Cards App

## For Developers

### Prerequisites
```bash
- Android Studio Arctic Fox or later
- JDK 8 or later
- Android SDK 34
- Gradle 8.0+
```

### Clone and Run
```bash
# Clone the repository
git clone https://github.com/iSee-Red/Ref-Cards-App.git
cd Ref-Cards-App

# Open in Android Studio
# File -> Open -> Select the Ref-Cards-App directory

# Sync Gradle
# Android Studio will prompt to sync, click "Sync Now"

# Run the app
# Click the green play button or press Shift+F10
```

### Command Line Build
```bash
# Navigate to project directory
cd Ref-Cards-App

# Make gradlew executable (Linux/Mac)
chmod +x gradlew

# Build debug APK
./gradlew assembleDebug

# Install on connected device
./gradlew installDebug

# Build release APK (requires signing config)
./gradlew assembleRelease
```

## For Users

### How to Use the App

1. **Launch the App**
   - Tap the "Ref Cards" icon on your device

2. **Show a Yellow Card**
   - Tap the yellow "Show Yellow Card" button
   - A large yellow card appears in the center of the screen
   - Perfect for warning players!

3. **Show a Red Card**
   - Tap the red "Show Red Card" button
   - A large red card appears in the center of the screen
   - Time to send someone off!

4. **Reset the Display**
   - Tap the gray "Reset" button
   - The card disappears
   - Ready for the next decision

### Use Cases

- **Amateur Referees**: Practice showing cards with the proper motion
- **Coaches**: Teach players about yellow and red cards
- **Game Organizers**: Use when physical cards are unavailable
- **Kids**: Learn about football rules in a fun way
- **Party Games**: Add referee drama to casual matches

### Tips

- **Keep Screen On**: Enable "Stay Awake" in Developer Options for matches
- **Brightness**: Max out screen brightness for outdoor visibility
- **Quick Access**: Add to home screen for fast access during games
- **Practice**: Get comfortable with the button layout before using in a match

## Troubleshooting

### App Won't Build
```bash
# Clean the project
./gradlew clean

# Rebuild
./gradlew build

# Check Android SDK is installed
echo $ANDROID_HOME
```

### Gradle Sync Issues
```bash
# In Android Studio:
# File -> Invalidate Caches / Restart
# Then: Tools -> Android -> Sync Project with Gradle Files
```

### Run Issues
- Ensure USB debugging is enabled on device
- Check device is authorized (adb devices)
- Verify Android version is 7.0 or higher

## Support

For issues or questions:
1. Check the [README.md](README.md) for detailed information
2. Review [BUILD.md](BUILD.md) for build instructions
3. Check [UI_MOCKUP.md](UI_MOCKUP.md) for UI design details

## License

Open source - free to use, modify, and distribute.
