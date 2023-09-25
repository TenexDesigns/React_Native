help me understand error handling in rxpo router with cod samples ""Error handling

Learn how to handle unmatched routes and errors in your app when using Expo Router.



This guide specifies how to handle unmatched routes and errors in your app when using Expo Router.



Unmatched routes

An example of unmatched routes displayed on all platforms.

Native apps don't have a server so there are technically no 404s. However, if you're implementing a router universally, then it makes sense to handle missing routes. This is done automatically for each app, but you can also customize it.





Copy



import { Unmatched } from 'expo-router';

export default Unmatched;

This will render the default Unmatched. You can export any component you want to render instead. We recommend having a link to / so users can navigate back to the home screen.



Error handling

Expo Router enables fine-tuned error handling to enable a more opinionated data-loading strategy in the future.



Using ErrorBoundary in Expo Router to catch errors in a route component.

You can export a nested ErrorBoundary component from any route to intercept and format component-level errors using React Error Boundaries:





Copy



import { View, Text } from 'react-native';

export function ErrorBoundary(props: ErrorBoundaryProps) {

 return (

  <View style={{ flex: 1, backgroundColor: "red" }}>

   <Text>{props.error.message}</Text>

   <Text onPress={props.retry}>Try Again?</Text>

  </View>

 );

}

export default function Page() { ... }

When you export an ErrorBoundary the route will be wrapped with a React Error Boundary effectively:





Copy



function Route({ ErrorBoundary, Component }) {

 return (

  <Try catch={ErrorBoundary}>

   <Component />

  </Try>

 );

}

When ErrorBoundary is not present, the error will be thrown to the nearest parent's ErrorBoundary.



API

ErrorBoundaryProps

Each ErrorBoundary is passed the following props:



error: Error — The error that was thrown.

retry: () => Promise<void> — A function that will rerender the route component.

ErrorBoundary

You can also use the default ErrorBoundary component for a quick UI:





Copy



// Re-export the default UI

export { ErrorBoundary } from 'expo-router';

Work in progress

React Native LogBox needs to be presented less aggressively to develop with errors. Currently, it shows for console.error and console.warn. However, it should ideally only show for uncaught errors.



Ask a question on the forums""
