The Expo CLI provides access to a wide range of React Native components and APIs, including:

**Components**

* **Core components:** These are the basic building blocks of React Native apps, such as `<View>`, `<Text>`, `<TextInput>`, `<ScrollView>`, and `<Image>`.
* **Expo SDK components:** These are provided by the Expo SDK and provide access to device and system functionality, such as the camera, GPS, and accelerometer.

**APIs**

* **Core APIs:** These provide access to the core functionality of React Native, such as navigation, networking, and storage.
* **Expo SDK APIs:** These provide access to the functionality of the Expo SDK, such as the camera, GPS, and accelerometer.

**How to use them**

To use a component or API in your Expo app, you first need to import it into your JavaScript code. For example, to import the `Text` component, you would use the following code:

```javascript
import { Text } from 'react-native';
```

Once you have imported a component or API, you can use it in your code like any other JavaScript object. For example, to render a `Text` component, you would use the following code:

```javascript
const App = () => {
  return (
    <View>
      <Text>Hello, world!</Text>
    </View>
  );
};
```

To use an Expo SDK component or API, you first need to install the corresponding package from the Expo SDK. For example, to install the `Camera` package, you would use the following command:

```
npx expo install expo-camera
```

Once you have installed the package, you can import it into your JavaScript code and use it like any other React Native component or API. For example, to render a `Camera` component, you would use the following code:

```javascript
import { Camera } from 'expo-camera';

const App = () => {
  return (
    <View>
      <Camera />
    </View>
  );
};
```

**Here are some examples of how to use common Expo CLI components and APIs:**

* **Buttons:** To render a button, you can use the `<Button>` component. The `<Button>` component takes a number of props, including `title`, `onPress`, and `disabled`. The `title` prop is the text that will be displayed on the button. The `onPress` prop is a function that will be called when the button is pressed. The `disabled` prop is a boolean value that determines whether the button is disabled.
* **Text:** To render text, you can use the `<Text>` component. The `<Text>` component takes a number of props, including `children`, `style`, and `accessibilityLabel`. The `children` prop is the text that will be rendered. The `style` prop is an object that contains CSS properties for the text. The `accessibilityLabel` prop is a string that describes the text for accessibility purposes.
* **Navigation:** To navigate between different screens in your app, you can use the `useNavigation` hook. The `useNavigation` hook returns an object that contains navigation functions, such as `navigate()` and `goBack()`.
* **Networking:** To make network requests, you can use the `fetch()` function. The `fetch()` function takes a URL as its argument and returns a promise that resolves to a response object.
* **Storage:** To store data on the user's device, you can use the `AsyncStorage` API. The `AsyncStorage` API provides a number of methods for storing and retrieving data, such as `setItem()`, `getItem()`, and `removeItem()`.

For more information on Expo CLI components and APIs, please refer to the Expo documentation: https://docs.expo.dev/.

