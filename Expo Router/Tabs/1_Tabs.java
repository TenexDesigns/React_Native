Help me understand Tbas naviagtion in expo router  with code samples in react native "Learn how to use the Tabs layout in Expo Router.

The Tabs layout in Expo Router wraps the Bottom Tabs from React Navigation.

Expo Router adds href screen option which can only be used with screen options that are an object (for example, screenOptions={{ href: "/path" }}) and cannot be used simultaneously with tabBarButton.

Hiding a tab
Sometimes you want a route to exist but not show up in the tab bar, you can pass href: null to disable the button:


Copy

import { Tabs } from 'expo-router/tabs';
export default function AppLayout() {
  return (
    <Tabs>
      <Tabs.Screen
        // Name of the route to hide.
        name="index"
        options={{
          // This tab will no longer show up in the tab bar.
          href: null,
        }}
      />
    </Tabs>
  );
}
Dynamic routes
You may want to use a dynamic route in your tab bar (for example, a profile tab). For this case, you'll want the button to always link to a specific href.


Copy

import { Tabs } from 'expo-router/tabs';
export default function AppLayout() {
  return (
    <Tabs>
      <Tabs.Screen
        // Name of the dynamic route.
        name="[user]"
        options={{
          // Ensure the tab always links to the same href.
          href: '/evanbacon',
          // OR you can use the Href object:
          href: {
            pathname: '/[user]',
            params: {
              user: 'evanbacon',
            },
          },
        }}
      />
    </Tabs>
  );
}"
