Expo Router is a file-based routing library for React Native applications built with Expo. It allows you to manage navigation between screens in your app, allowing users to move seamlessly between different parts of your app's UI, using the same components on multiple platforms (Android, iOS, and web).

How to use Expo Router

To use Expo Router, you can follow these steps:

Install the Expo Router library:
npm install expo-router
Create a new file called App.js in the root of your project directory. This file will contain the entry point for your app.

Import the useNavigation hook from react-router-native:

JavaScript
import React from 'react';
import { useNavigation } from 'react-router-native';
Use code with caution. Learn more
Create a function called App that returns the root component of your app:
JavaScript
const App = () => {
  const navigation = useNavigation();

  return (
    <View>
      <Button onPress={() => navigation.navigate('HomeScreen')}>
        Go to Home Screen
      </Button>
    </View>
  );
};

export default App;
Use code with caution. Learn more
Create a new file called HomeScreen.js in the src/screens directory. This file will contain the component for your Home screen.

Import the useRoute hook from react-router-native:

JavaScript
import React from 'react';
import { useRoute } from 'react-router-native';
Use code with caution. Learn more
Create a function called HomeScreen that returns the component for your Home screen:
JavaScript
const HomeScreen = () => {
  const route = useRoute();

  return (
    <View>
      <Text>Hello, {route.params.name}!</Text>
    </View>
  );
};

export default HomeScreen;
Use code with caution. Learn more
Run your app using the following command:
expo start
Your app should now be running, and you should be able to navigate to the Home screen by clicking on the button in the App component.

Important information and areas about Expo Router

Here are some important things to know about Expo Router:

Expo Router is a file-based router, which means that each screen in your app is represented by a file in the src/screens directory.
Expo Router is a native router, which means that it uses the native navigation APIs on each platform.
Expo Router supports deep linking, which means that users can navigate to specific screens in your app by clicking on links in other apps or on the web.
Expo Router is optimized for performance, and it works well with large apps.
Code sample

Here is a more complete code sample of a React Native app that uses Expo Router:

JavaScript
import React from 'react';
import { useNavigation } from 'react-router-native';

const App = () => {
  const navigation = useNavigation();

  return (
    <View>
      <Button onPress={() => navigation.navigate('HomeScreen')}>
        Go to Home Screen
      </Button>
      <Button onPress={() => navigation.navigate('AboutScreen')}>
        Go to About Screen
      </Button>
    </View>
  );
};

export default App;
Use code with caution. Learn more
JavaScript
import React from 'react';
import { useRoute } from 'react-router-native';

const HomeScreen = () => {
  const route = useRoute();

  return (
    <View>
      <Text>Hello, {route.params.name}!</Text>
    </View>
  );
};

export default HomeScreen;
Use code with caution. Learn more
JavaScript
import React from 'react';

const AboutScreen = () => {
  return (
    <View>
      <Text>This is the About Screen.</Text>
    </View>
  );
};

export default AboutScreen;
Use code with caution. Learn more
This code sample shows how to create a simple React Native app with two screens, a Home screen and an About screen. The Home screen displays a greeting to the user, and the About screen displays a simple message.

To navigate to the About screen, the user can click on the "Go to About Screen" button in the App component.

Conclusion

Expo Router is a powerful routing library for React Native applications built with Expo. It is easy to use, and it provides a number of features that make it ideal for building large and complex apps.

Sources




  
