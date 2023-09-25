Stack is one of the most common layouts used in React Native apps. It creates a stack of screens, where the user can navigate between them by swiping left or right.

To use Stack in Expo Router, you first need to create a layout route using the Stack component. This component wraps the native Stack Navigator from React Navigation.

Here is an example of a simple Stack layout route:

JavaScript
import { Stack } from 'expo-router';

export default function Layout() {
  return <Stack />;
}
Use code with caution. Learn more
Once you have created the layout route, you can use it in your app by adding it to the _layout.js file in the root directory of your app.

For example, if you have a file structure like this:

app
├── _layout.js
├── Home.js
└── Details.js
You can add the Stack layout route to the _layout.js file like this:

JavaScript
import { Stack } from 'expo-router';

export default function Layout() {
  return <Stack />;
}
Use code with caution. Learn more
This will create a Stack layout in your app, with two screens: Home and Details.

You can navigate between the screens in the Stack layout using the Link component. For example, to navigate from the Home screen to the Details screen, you would add the following code to the Home screen:

JavaScript
import { Link } from 'expo-router';

export default function Home() {
  return (
    <View>
      <Link href="/details">Go to Details</Link>
    </View>
  );
}
Use code with caution. Learn more
When the user clicks on the Link, they will be navigated to the Details screen.

You can also use the Stack layout route to configure the header bar for all of the screens in the Stack. To do this, you can use the screenOptions prop.

For example, to set the background color of the header bar to red for all of the screens in the Stack, you would add the following code to the Stack layout route:

JavaScript
import { Stack } from 'expo-router';

export default function Layout() {
  return (
    <Stack
      screenOptions={{
        headerStyle: { backgroundColor: 'red' },
      }}
    />
  );
}
Use code with caution. Learn more
You can also use the screenOptions prop to configure the header bar for individual screens in the Stack. To do this, you can use the options prop on the Stack.Screen component.

For example, to set the title of the header bar to "My Home" for the Home screen, you would add the following code to the Home screen:

JavaScript
import { Stack } from 'expo-router';

export default function Home() {
  return (
    <Stack.Screen
      name="Home"
      options={{
        title: 'My Home',
      }}
    />
  );
}
Use code with caution. Learn more
Stack is a powerful and flexible layout that can be used to create a variety of user interfaces in React Native. It is easy to use and configure, and it is supported by Expo Router.



  
