# Release Process

## Creating a New Release

### Method 1: Manual Workflow Dispatch

1. Go to Actions tab in GitHub
2. Select "Release" workflow
3. Click "Run workflow"
4. Enter the version number (e.g., v1.0.0)
5. Click "Run workflow" button
6. Wait for the workflow to complete
7. Check the Releases page for the new release with APK

### Method 2: Git Tag

1. Update version in `app/build.gradle`:
   - Increment `versionCode`
   - Update `versionName`
2. Commit changes
3. Create and push a tag:
   ```bash
   git tag v1.0.0
   git push origin v1.0.0
   ```
4. The workflow will automatically trigger and create the release

## Version Numbering

Follow semantic versioning (MAJOR.MINOR.PATCH):
- MAJOR: Breaking changes
- MINOR: New features (backwards compatible)
- PATCH: Bug fixes

Examples: v1.0.0, v1.1.0, v1.1.1

## APK Signing (Optional)

For production releases, you should sign the APK:

1. Generate a keystore
2. Add keystore to repository secrets
3. Configure signing in build.gradle
4. Update workflow to use signing credentials

## Testing Before Release

Before creating a release:
1. Test the app thoroughly on multiple devices/emulators
2. Verify all features work correctly
3. Check for crashes or bugs
4. Update changelog/release notes
