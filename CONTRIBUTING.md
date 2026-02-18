# Contributing to Ref Cards App

Thank you for your interest in contributing to the Ref Cards App! This document provides guidelines and instructions for contributing.

## Table of Contents

- [Code of Conduct](#code-of-conduct)
- [Getting Started](#getting-started)
- [Development Setup](#development-setup)
- [Making Changes](#making-changes)
- [Code Style Guidelines](#code-style-guidelines)
- [Commit Messages](#commit-messages)
- [Pull Request Process](#pull-request-process)
- [Testing](#testing)

## Code of Conduct

Please be respectful and constructive in all interactions. We're all here to make this project better.

## Getting Started

1. Fork the repository
2. Clone your fork: `git clone https://github.com/YOUR_USERNAME/Ref-Cards-App.git`
3. Add upstream remote: `git remote add upstream https://github.com/iSee-Red/Ref-Cards-App.git`

## Development Setup

### Prerequisites

- Android Studio Arctic Fox or newer
- JDK 17
- Android SDK with API 34
- Git

### Setup Steps

1. Open Android Studio
2. Select "Open an existing project"
3. Navigate to the cloned repository
4. Wait for Gradle sync to complete
5. Run the app on an emulator or device

See [BUILD.md](BUILD.md) for detailed build instructions.

## Making Changes

1. Create a new branch from `master`:
   ```bash
   git checkout -b feature/your-feature-name
   ```

2. Make your changes following the code style guidelines

3. Test your changes thoroughly

4. Commit your changes with clear commit messages

5. Push to your fork:
   ```bash
   git push origin feature/your-feature-name
   ```

6. Create a Pull Request

## Code Style Guidelines

### Kotlin

- Follow [Kotlin Coding Conventions](https://kotlinlang.org/docs/coding-conventions.html)
- Use 4 spaces for indentation
- Maximum line length: 120 characters
- Use meaningful variable and function names
- Add KDoc comments for public APIs

### XML Layouts

- Use 2 spaces for indentation
- Follow Material Design guidelines
- Use descriptive IDs for views
- Keep layouts simple and maintainable

### Resources

- Use lowercase with underscores for resource names
- Group similar resources together
- Add comments for complex resources

## Commit Messages

Follow these guidelines for commit messages:

- Use present tense ("Add feature" not "Added feature")
- Use imperative mood ("Move cursor to..." not "Moves cursor to...")
- Limit first line to 72 characters
- Reference issues and pull requests when relevant

Examples:
```
Add yellow card animation
Fix crash on card reset
Update dependencies to latest versions
```

## Pull Request Process

1. **Before Creating a PR:**
   - Ensure all tests pass
   - Update documentation if needed
   - Add tests for new features
   - Run lint checks: `./gradlew lint`

2. **Creating the PR:**
   - Use the PR template
   - Provide a clear description of changes
   - Link related issues
   - Add screenshots for UI changes

3. **Review Process:**
   - Address reviewer feedback promptly
   - Keep the PR focused and small
   - Squash commits if requested

4. **After Approval:**
   - PR will be merged by maintainers
   - Delete your branch after merge

## Testing

### Running Tests

```bash
# Run unit tests
./gradlew test

# Run instrumentation tests
./gradlew connectedAndroidTest

# Run all tests
./gradlew testDebugUnitTest connectedAndroidTest
```

### Writing Tests

- Write unit tests for business logic
- Write instrumentation tests for UI
- Aim for meaningful test coverage
- Use descriptive test names

### Test Structure

```kotlin
@Test
fun methodName_condition_expectedResult() {
    // Arrange
    // Act
    // Assert
}
```

## Questions?

If you have questions or need help:
- Open an issue for bugs or feature requests
- Check existing issues and pull requests
- Review the project documentation

Thank you for contributing! 🎉
