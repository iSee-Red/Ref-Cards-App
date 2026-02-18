# UI Mockup - Ref Cards App

## App Screens

### Initial State (No Card Displayed)
```
┌─────────────────────────────────┐
│                                 │
│                                 │
│                                 │
│                                 │
│                                 │
│                                 │
│                                 │
│                                 │
│     ┏━━━━━━━━━━━━━━━━━━━━━┓     │
│     ┃  Show Yellow Card   ┃     │
│     ┗━━━━━━━━━━━━━━━━━━━━━┛     │
│                                 │
│     ┏━━━━━━━━━━━━━━━━━━━━━┓     │
│     ┃   Show Red Card     ┃     │
│     ┗━━━━━━━━━━━━━━━━━━━━━┛     │
│                                 │
│     ┏━━━━━━━━━━━━━━━━━━━━━┓     │
│     ┃       Reset         ┃     │
│     ┗━━━━━━━━━━━━━━━━━━━━━┛     │
│                                 │
└─────────────────────────────────┘
```

### Yellow Card Displayed
```
┌─────────────────────────────────┐
│                                 │
│       ┏━━━━━━━━━━━━━━━━━┓       │
│       ┃                 ┃       │
│       ┃                 ┃       │
│       ┃                 ┃       │
│       ┃  YELLOW CARD    ┃       │
│       ┃                 ┃       │
│       ┃                 ┃       │
│       ┗━━━━━━━━━━━━━━━━━┛       │
│          (Yellow Color)          │
│                                 │
│     ┏━━━━━━━━━━━━━━━━━━━━━┓     │
│     ┃  Show Yellow Card   ┃     │
│     ┗━━━━━━━━━━━━━━━━━━━━━┛     │
│                                 │
│     ┏━━━━━━━━━━━━━━━━━━━━━┓     │
│     ┃   Show Red Card     ┃     │
│     ┗━━━━━━━━━━━━━━━━━━━━━┛     │
│                                 │
│     ┏━━━━━━━━━━━━━━━━━━━━━┓     │
│     ┃       Reset         ┃     │
│     ┗━━━━━━━━━━━━━━━━━━━━━┛     │
└─────────────────────────────────┘
```

### Red Card Displayed
```
┌─────────────────────────────────┐
│                                 │
│       ┏━━━━━━━━━━━━━━━━━┓       │
│       ┃                 ┃       │
│       ┃                 ┃       │
│       ┃                 ┃       │
│       ┃   RED CARD      ┃       │
│       ┃                 ┃       │
│       ┃                 ┃       │
│       ┗━━━━━━━━━━━━━━━━━┛       │
│           (Red Color)            │
│                                 │
│     ┏━━━━━━━━━━━━━━━━━━━━━┓     │
│     ┃  Show Yellow Card   ┃     │
│     ┗━━━━━━━━━━━━━━━━━━━━━┛     │
│                                 │
│     ┏━━━━━━━━━━━━━━━━━━━━━┓     │
│     ┃   Show Red Card     ┃     │
│     ┗━━━━━━━━━━━━━━━━━━━━━┛     │
│                                 │
│     ┏━━━━━━━━━━━━━━━━━━━━━┓     │
│     ┃       Reset         ┃     │
│     ┗━━━━━━━━━━━━━━━━━━━━━┛     │
└─────────────────────────────────┘
```

## Color Scheme

- **Background**: Dark gray (#1A1A1A)
- **Yellow Card**: Bright yellow (#FFC107) with black text
- **Red Card**: Red (#F44336) with white text
- **Yellow Button**: Yellow background (#FFC107) with black text
- **Red Button**: Red background (#F44336) with white text
- **Reset Button**: Gray background (#9E9E9E) with white text

## Features

1. **Tap Yellow Card Button**: Shows a yellow card (250x350dp) in the center
2. **Tap Red Card Button**: Shows a red card (250x350dp) in the center
3. **Tap Reset**: Hides the card display
4. Cards display centered text with their card color label
