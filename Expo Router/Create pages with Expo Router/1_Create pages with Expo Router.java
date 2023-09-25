Steps

1.npx create-expo-app@latest books --example with-router

2.npx expo install expo-router react-native-safe-area-context react-native-screens expo-linking expo-constants expo-status-bar react-native-gesture-handler





Expo Router simplifies the process of creating pages/routes in your React Native project by following a file-based routing convention. Each file you create in your app directory automatically becomes a route in your application. Let's go through the steps to create pages with Expo Router using code samples:






  
**Step 1: Create the App Directory**

Create an `app` directory in your project where you will place your route files. For example, if you want to create a home page, you can create an `index.js` file inside the `app` directory.







  
**Step 2: Define a Page**

To define a page, you need to export a React component as the default export from your route file. The file should use one of the supported extensions like `.js`, `.jsx`, `.tsx`, or `.ts`. Here's an example of creating a simple home page:

```javascript
// app/index.js
import React from 'react';
import { Text } from 'react-native';

export default function Page() {
  return <Text>Home page</Text>;
}
```

In this example, we've created a basic React component that displays the text "Home page."










  
**Step 3: Route Matching**

The file's location in your project directory determines the route it matches. Here are some examples of route matching:

- `app/index.js` matches the root route `/`.
- `app/home.js` matches the route `/home`.
- `app/settings/index.js` matches the route `/settings`.
- `app/[user].js` matches dynamic paths like `/expo` or `/evanbacon`.

Files named `index.js` match the parent directory and do not add a path segment. For instance, `app/settings/index.js` matches `/settings` in the app.















  
**Step 4: Dynamic Routes**

You can create dynamic routes by using square brackets `[]` in your file names. These dynamic routes match any unmatched path at a given segment level. For example:

- `app/blog/[slug].js` matches `/blog/123`.
- `app/blog/[...rest].js` matches `/blog/123/settings`.

It's important to note that routes with higher specificity (more segments) will be matched before a dynamic route. For example, `/blog/bacon` will match `blog/bacon.js` before `blog/[id].js`.

You can also use the rest syntax (`[...id]`) to match multiple slugs in a single route. For example:

- `app/blog/[...id].js` matches `/blog/123/settings`.

Dynamic segments are accessible as search parameters in the page component. You can use the `useLocalSearchParams` hook to access these parameters:

```javascript
// app/blog/[slug].js
import { useLocalSearchParams } from 'expo-router';
import { Text } from 'react-native';

export default function Page() {
  const { slug } = useLocalSearchParams();

  return <Text>Blog post: {slug}</Text>;
}
```

In this example, the `slug` parameter is extracted from the route, and the page displays "Blog post: 123" when the URL is `/blog/123`.

That's the basic process of creating pages with Expo Router using the file-based routing convention. You can create as many route files as needed to build out your app's navigation structure, and each file corresponds to a specific route.

  














