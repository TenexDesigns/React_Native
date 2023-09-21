To determine the orientation mode (landscape or portrait) in a React Native application, you can use the `useWindowDimensions` hook provided by the `react-native-use-dimensions` package. This hook allows you to access the dimensions of the screen or window and determine the orientation based on the width and height values.

Here's an example of how to use the `useWindowDimensions` hook to determine the orientation mode:

```javascript
import React from "react";
import { Text } from "react-native";
import useDimensions, {
  useScreenDimensions,
  useWindowDimensions,
} from "react-native-use-dimensions";

const OrientationExample = () => {
  const { height, width } = useWindowDimensions();
  const isLandscape = width > height;

  return (
    <Text>
      {width}x{height}
      Orientation: {isLandscape ? "Landscape" : "Portrait"}
    </Text>
  );
};
```

In this example, we import the `useWindowDimensions` hook from the `react-native-use-dimensions` package. We then use it to get the `height` and `width` of the window. By comparing the `width` and `height` values, we can determine whether the device is in landscape or portrait mode. Finally, we render a `Text` component that displays the dimensions and the orientation mode.

This hook can be used in functional components to dynamically adjust the UI based on the orientation mode. You can also use the `useScreenDimensions` hook to specifically get the dimensions of the screen.

As for the applications of landscape and portrait mode, here are a few use cases:

- **Responsive UI**: Depending on the orientation mode, you can adjust the layout and styling of your components to provide a better user experience. For example, you might want to display a single column layout in portrait mode and switch to a multi-column layout in landscape mode.

- **Media Playback**: When playing videos or displaying images, you can optimize the player or viewer based on the orientation mode. For instance, you might want to display the video in full screen in landscape mode and restrict the size in portrait mode.

- **Gaming**: In gaming applications, you can adjust the controls and gameplay based on the orientation mode. For example, you might want to display virtual buttons on the screen in portrait mode and switch to a tilt or swipe-based control system in landscape mode.

These are just a few examples, and the applications of landscape and portrait mode depend on the specific requirements of your application.

Sources:
- [React Native Hooks](https://github.com/react-native-community/hooks)
- [React Native Use Dimensions](https://github.com/dawsonbooth/react-native-use-dimensions)
