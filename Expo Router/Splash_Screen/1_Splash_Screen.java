Help me understand splash screen with code samples and other areas covered here with code samples "Appearance elements
Learn how to use a splash screen, fonts and images in your app that is using Expo Router.

There are three major elements that you can use to customize the appearance of your app:

Fonts
Images
Splash screen
Fonts
Expo Router extends the expo-splash-screen API to prevent white flash. Use it in conjunction with expo-font to keep the splash screen visible while fonts are loading:


Copy

import { Text, View } from 'react-native';
import {
  SplashScreen,
  // This example uses a basic Layout component, but you can use any Layout.
  Slot,
} from 'expo-router';

import { useFonts, Inter_500Medium } from '@expo-google-fonts/inter';

SplashScreen.preventAutoHideAsync();

export default function Layout() {
  const [fontsLoaded, fontError] = useFonts({
    Inter_500Medium,
  });

  useEffect(() => {
    if (fontsLoaded || fontError) {
      // Hide the splash screen after the fonts have loaded (or an error was returned) and the UI is ready.
      SplashScreen.hideAsync();
    }
  }, [fontsLoaded, fontError]);

  // Prevent rendering until the font has loaded or an error was returned
  if (!fontsLoaded && !fontError) {
    return null;
  }

  // Render the children routes now that all the assets are loaded.
  return <Slot />;
}
In SDK 50 and above, Expo Router's static rendering provides automatic static optimization for font loading on web. This enables best-practices for working with fonts in the browser.

Images
We recommend you use Expo Image for the best cross-platform experience:

Icon
Expo Image API reference
For more information on how to install and use expo-image, see its API documentation.

Splash screen
Splash screens are required on native platforms. Expo Router automatically orchestrates the native splash screen to keep it visible until the first route is rendered, this applies to any route that the user deep links into. To enable this functionality, install expo-splash-screen in your project.

The default behavior is to hide the splash screen when the first route is rendered, this is optimal for the majority of routes. For some routes, you may want to prolong the splash screen until additional data or asset loading has concluded. This can be achieved with the SplashScreen module from expo-router. If SplashScreen.preventAutoHideAsync is called before the splash screen is hidden, then the splash screen will remain visible until the SplashScreen.hideAsync() function has been invoked.


Copy

import { SplashScreen } from 'expo-router';

SplashScreen.preventAutoHideAsync();

export default function App() {
  const [isReady, setReady] = React.useState(false);
  React.useEffect(() => {
    // Perform some sort of async data or asset fetching.
    setTimeout(() => {
      // When all loading is setup, unmount the splash screen component.
      SplashScreen.hideAsync();
      setReady(true);
    }, 1000);
  }, []);

  return <Text>My App</Text>;
}
React Navigation themes
React Navigation navigators <Stack>, <Drawer>, and <Tabs> use a shared appearance provider. In React Navigation, you set the theme for the entire app using the <NavigationContainer /> component. Expo Router manages the root container so that you can set the theme using the ThemeProvider directly.


Copy

import { ThemeProvider, DarkTheme, DefaultTheme, useTheme } from '@react-navigation/native';

import { Slot } from 'expo-router';

export default function RootLayout() {
  return (
    <ThemeProvider value={DarkTheme}>
      <Slot />
    </ThemeProvider>
  );
}
You can use this technique at any layer of the app to set the theme for a specific layout. The current theme can be accessed with useTheme from @react-navigation/native."
