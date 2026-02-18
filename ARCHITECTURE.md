# App Architecture - Ref Cards

## Component Diagram

```
┌─────────────────────────────────────────────────────────────┐
│                     Ref Cards Android App                   │
└─────────────────────────────────────────────────────────────┘
                              │
                              │
                              ▼
┌─────────────────────────────────────────────────────────────┐
│                      MainActivity.kt                         │
│  ┌────────────────────────────────────────────────────────┐ │
│  │  Properties:                                           │ │
│  │  - cardDisplay: View                                   │ │
│  │  - cardText: TextView                                  │ │
│  │  - yellowCardButton: Button                            │ │
│  │  - redCardButton: Button                               │ │
│  │  - resetButton: Button                                 │ │
│  └────────────────────────────────────────────────────────┘ │
│  ┌────────────────────────────────────────────────────────┐ │
│  │  Methods:                                              │ │
│  │  + onCreate(savedInstanceState: Bundle?)              │ │
│  │  - showYellowCard()                                    │ │
│  │  - showRedCard()                                       │ │
│  │  - resetCard()                                         │ │
│  └────────────────────────────────────────────────────────┘ │
└─────────────────────────────────────────────────────────────┘
                              │
                              │ inflates
                              ▼
┌─────────────────────────────────────────────────────────────┐
│                   activity_main.xml                          │
│  ┌────────────────────────────────────────────────────────┐ │
│  │  Layout: ConstraintLayout                             │ │
│  │  ┌──────────────────────────────────────────────────┐ │ │
│  │  │  View (id: cardDisplay)                          │ │ │
│  │  │  - Size: 250x350dp                               │ │ │
│  │  │  - Background: Yellow or Red                     │ │ │
│  │  │  - Visibility: INVISIBLE (initial)               │ │ │
│  │  └──────────────────────────────────────────────────┘ │ │
│  │  ┌──────────────────────────────────────────────────┐ │ │
│  │  │  TextView (id: cardText)                         │ │ │
│  │  │  - Text: "YELLOW CARD" or "RED CARD"            │ │ │
│  │  │  - Centered on cardDisplay                       │ │ │
│  │  │  - Visibility: INVISIBLE (initial)               │ │ │
│  │  └──────────────────────────────────────────────────┘ │ │
│  │  ┌──────────────────────────────────────────────────┐ │ │
│  │  │  LinearLayout (id: buttonsContainer)             │ │ │
│  │  │  ┌────────────────────────────────────────────┐  │ │ │
│  │  │  │  Button (id: yellowCardButton)            │  │ │ │
│  │  │  │  Background: Yellow (#FFC107)             │  │ │ │
│  │  │  └────────────────────────────────────────────┘  │ │ │
│  │  │  ┌────────────────────────────────────────────┐  │ │ │
│  │  │  │  Button (id: redCardButton)               │  │ │ │
│  │  │  │  Background: Red (#F44336)                │  │ │ │
│  │  │  └────────────────────────────────────────────┘  │ │ │
│  │  │  ┌────────────────────────────────────────────┐  │ │ │
│  │  │  │  Button (id: resetButton)                 │  │ │ │
│  │  │  │  Background: Gray (#9E9E9E)               │  │ │ │
│  │  │  └────────────────────────────────────────────┘  │ │ │
│  │  └──────────────────────────────────────────────────┘ │ │
│  └────────────────────────────────────────────────────────┘ │
└─────────────────────────────────────────────────────────────┘
```

## Flow Diagram

```
┌─────────────┐
│  App Start  │
└──────┬──────┘
       │
       ▼
┌─────────────────────────────────┐
│  MainActivity.onCreate()        │
│  - Inflate layout               │
│  - Find views by ID             │
│  - Set click listeners          │
└──────┬──────────────────────────┘
       │
       ▼
┌─────────────────────────────────┐
│  Initial State                  │
│  - Card hidden                  │
│  - Buttons visible              │
└─────────────────────────────────┘
       │
       │ User Action
       │
       ├──────────────────┬──────────────────┬─────────────────┐
       │                  │                  │                 │
       ▼                  ▼                  ▼                 ▼
┌──────────────┐   ┌──────────────┐   ┌──────────────┐   ┌────────┐
│ Tap Yellow   │   │  Tap Red     │   │  Tap Reset   │   │  Exit  │
│   Button     │   │   Button     │   │   Button     │   └────────┘
└──────┬───────┘   └──────┬───────┘   └──────┬───────┘
       │                  │                  │
       ▼                  ▼                  ▼
┌──────────────┐   ┌──────────────┐   ┌──────────────┐
│showYellowCard│   │ showRedCard  │   │  resetCard   │
│  - Set bg    │   │  - Set bg    │   │  - Hide card │
│    yellow    │   │    red       │   │  - Hide text │
│  - Set text  │   │  - Set text  │   └──────┬───────┘
│    black     │   │    white     │          │
│  - Show card │   │  - Show card │          │
└──────┬───────┘   └──────┬───────┘          │
       │                  │                  │
       └──────────────────┴──────────────────┘
                          │
                          ▼
                  ┌───────────────┐
                  │  Card Display │
                  │    Updated    │
                  └───────────────┘
```

## Data Flow

```
User Input (Button Click)
         ↓
Event Listener (setOnClickListener)
         ↓
Handler Function (showYellowCard/showRedCard/resetCard)
         ↓
View Updates (setBackgroundColor, setText, setVisibility)
         ↓
Screen Render (Android Framework)
         ↓
Visual Output (Card Displayed)
```

## Key Design Patterns

1. **Single Activity Pattern**: One activity handles all UI interactions
2. **View Binding**: Views are bound in onCreate() and reused
3. **Event Handling**: OnClickListener pattern for user interactions
4. **State Management**: Simple visibility and color state management
5. **Separation of Concerns**: Layout (XML) separate from logic (Kotlin)

## Technology Stack

```
┌─────────────────────────────────────────┐
│           Application Layer             │
│  (MainActivity.kt - Business Logic)     │
└───────────────┬─────────────────────────┘
                │
┌───────────────▼─────────────────────────┐
│           Framework Layer               │
│  (AndroidX, AppCompat, Material)        │
└───────────────┬─────────────────────────┘
                │
┌───────────────▼─────────────────────────┐
│           Platform Layer                │
│  (Android OS, Kotlin Runtime)           │
└───────────────┬─────────────────────────┘
                │
┌───────────────▼─────────────────────────┐
│           Hardware Layer                │
│  (Device Display, Touch Input)          │
└─────────────────────────────────────────┘
```

## Build System

```
Gradle (Build Tool)
    │
    ├── Project Level (build.gradle)
    │   ├── Buildscript dependencies
    │   └── Plugin versions
    │
    ├── App Level (app/build.gradle)
    │   ├── Android plugin
    │   ├── Kotlin plugin
    │   ├── Compile/Target SDK
    │   └── Dependencies
    │
    └── Settings (settings.gradle)
        ├── Plugin management
        └── Dependency resolution
```
