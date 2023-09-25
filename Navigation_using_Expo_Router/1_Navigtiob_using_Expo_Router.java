To create an Expo project with file-based navigation using Expo Router, you can follow these steps:

1. **Install Expo CLI**: First, you need to install the Expo CLI to create a new Expo project. If you haven't installed it yet, you can install it using the following command:

```bash
npm install -g expo-cli
```

2. **Create a new Expo project**: Once you've installed Expo CLI, you can create a new project using the following command:

```bash
expo init my-expo-project
```

Replace `my-expo-project` with the name of your project. This command will create a new directory with the name of your project and install all the necessary dependencies to get the project up and running locally [Source 3](https://docs.expo.dev/tutorial/create-your-first-app/).

3. **Install Expo Router**: After creating your project, you need to install Expo Router. Navigate into your project directory and install Expo Router using the following command:

```bash
npm install expo-router
```

Make sure that the version of Expo Router you're installing is compatible with the Expo SDK version your project is using [Source 23](https://docs.expo.dev/routing/installation/).

4. **Create Pages with Expo Router**: With Expo Router, when a file is created in the `app` directory, it automatically becomes a route in the app. For example, if you create a file `app/[user].js`, it matches dynamic paths like `/expo` or `/evanbacon` [Source 8](https://docs.expo.dev/routing/create-pages/).

5. **Move Between Screens**: Expo Router provides a `<Link/>` component or `useRouter` hook to navigate between screens. Here's an example of how to use the `<Link/>` component to navigate to a different screen when a button is clicked:

```jsx
import { Link } from 'expo-router';

<Link href="/otherScreen">Go to Other Screen</Link>
```

In this example, when the text "Go to Other Screen" is clicked, the app navigates to the `/otherScreen` route [Source 21](https://dev.to/idoevergreen/routing-in-expo-expo-router-5a6e).

Remember, the new navigation system in Expo is called Expo Router. It's a file-based router for React Native and web applications, allowing you to manage navigation between screens in your app using file-based routing [Source 4](https://docs.expo.dev/routing/introduction/).






