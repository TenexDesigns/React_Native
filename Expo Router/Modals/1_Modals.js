Help me understand modal, how and where it is used in expor router with code samples "Modals

Learn how to use modals in Expo Router.



Modals are a common pattern in mobile apps. They are a way to present a new screen on top of the current screen. They are often used for things like creating a new account, or for a user to select an option from a list.



You can implement a modal by creating a root layout route that renders certain routes as modals.



app



_layout.js



home.js



modal.js

The layout route app/_layout.js can present components as modals. Add a new route called modal that is used to render modals:



app/_layout.js

Copy

import { Stack } from 'expo-router';

export default function Layout() {

  return (

    <Stack>

      <Stack.Screen

        name="home"

        options={{

          // Hide the header for all other routes.

          headerShown: false,

        }}

      />

      <Stack.Screen

        name="modal"

        options={{

          // Set the presentation mode to modal for our modal route.

          presentation: 'modal',

        }}

      />

    </Stack>

  );

}



app/home.js

Copy

import { View, Text } from 'react-native';

import { Link } from 'expo-router';

export default function Home() {

  return (

    <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>

      <Text>Home Screen</Text>

      <Link href="/modal">Present modal</Link>

    </View>

  );

}

Now create a modal that adds a back button when the modal has lost its previous context and must be presented as a standalone page.



app/modal.js

Copy

import { View } from 'react-native';

import { Link, router } from 'expo-router';

import { StatusBar } from 'expo-status-bar';

export default function Modal() {

  // If the page was reloaded or navigated to directly, then the modal should be presented as

  // a full screen page. You may need to change the UI to account for this.

  const isPresented = router.canGoBack();

  return (

    <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>

      {/* Use `../` as a simple way to navigate to the root. This is not analogous to "goBack". */}

      {!isPresented && <Link href="../">Dismiss</Link>}

      {/* Native modals have dark backgrounds on iOS, set the status bar to light content. */}

      <StatusBar style="light" />

    </View>

  );

}"
