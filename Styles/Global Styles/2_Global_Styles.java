In React Native, you can use global styles to avoid repetition of styles across different components. Global styles are useful for defining common styles that are used in multiple places in your application, such as colors, fonts, margins, and padding. Here's how you can use global styles in your React Native application:

**Step 1: Create a Global Styles File**

First, create a new file to hold your global styles. You can name it `GlobalStyles.js` and place it in a directory where you want to keep your styles, such as `src/styles/`:

```
/src
|—— /styles
    |—— GlobalStyles.js
```

In your `GlobalStyles.js` file, define your global styles using StyleSheet. For example:

```jsx
import { StyleSheet } from 'react-native';

export default StyleSheet.create({
  container: {
    flex: 1,
    padding: 10,
    backgroundColor: '#fff',
  },
  title: {
    fontSize: 24,
    fontWeight: 'bold',
  },
  subtitle: {
    fontSize: 18,
    color: 'gray',
  },
  // ... more styles
});
```

[Source 1](https://dev.to/zhaluza/global-styling-in-react-native-1640)

**Step 2: Use Global Styles in Your Components**

Import the global styles file in your component and use the styles as needed:

```jsx
import React from 'react';
import { View, Text } from 'react-native';
import styles from '../styles/GlobalStyles';

const MyComponent = () => (
  <View style={styles.container}>
    <Text style={styles.title}>Title</Text>
    <Text style={styles.subtitle}>Subtitle</Text>
  </View>
);

export default MyComponent;
```

In this example, the `container`, `title`, and `subtitle` styles are defined in the global styles file and used in the `MyComponent` component.

Remember, using global styles can help you keep your code DRY (Don't Repeat Yourself) and make your code more maintainable. If you need to change a style that's used in multiple places, you only need to change it in one place - the global styles file [Source 1](https://dev.to/zhaluza/global-styling-in-react-native-1640).

For more complex applications, you might want to consider using a theme or a library such as `styled-components` or `react-native-use-styles` to manage your styles [Source 9](https://www.digitalocean.com/community/tutorials/react-styling-react-native), [Source 12](https://github.com/rootstrap/react-native-use-styles).



..
