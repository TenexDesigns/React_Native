The [Image](https://reactnative.dev/docs/image) component in React Native is used to display different types of images including network images, static resources, temporary local images, and images from local disk such as the camera roll. 

Here is a simple example of using the Image component:

```javascript
import React from 'react';
import { Image } from 'react-native';

const App = () => {
  return (
    <Image
      style={{width: 50, height: 50}}
      source={{uri: 'https://reactnative.dev/img/tiny_logo.png'}}
    />
  );
};

export default App;
```

In the code above, the Image component is imported from 'react-native'. An image from the web is displayed by providing the URL to the `source` prop of the Image component. The `style` prop is used to set the width and height of the image.

There are several properties associated with the Image component:

- `source`: This is the source of the image. It can be a local file or a network resource. For network and data images, you need to manually specify the dimensions of your image [Source 2](https://blog.logrocket.com/displaying-images-with-the-react-native-image-component/).

- `style`: This is used to apply specific styles to the image. It can be used to set the width, height, and other style properties of the image.

- `resizeMode`: This determines how to resize the image when the frame doesn't match the raw image dimensions. It defaults to `cover`. Other options are `contain`, `stretch`, `repeat`, and `center` [Source 10](https://www.makeuseof.com/react-native-images/).

- `onLoad`: This event is called when the image is loaded successfully.

- `onError`: This event is called when there's an error loading the image [Source 10](https://www.makeuseof.com/react-native-images/).

- `accessible` and `accessibilityLabel`: These properties are used for accessibility. `accessible` when set to true, indicates the image is an accessibility element. `accessibilityLabel` provides a text description of the image for screen reader users [Source 2](https://blog.logrocket.com/displaying-images-with-the-react-native-image-component/).

For GIF and WebP support on Android, you will need to add some optional modules in `android/app/build.gradle` [Source 2](https://blog.logrocket.com/displaying-images-with-the-react-native-image-component/).

You can also use the `ImageBackground` component to display background images, similar to using background images in CSS [Source 4](https://www.positronx.io/react-native-image-component-tutorial-with-examples/).

```javascript
import React from 'react';
import { ImageBackground, StyleSheet, Text, View } from 'react-native';

const App = () => (
  <View style={styles.container}>
    <ImageBackground source={...} style={styles.image}>
      <Text style={styles.text}>Inside</Text>
    </ImageBackground>
  </View>
);

const styles = StyleSheet.create({
  container: {
    flex: 1,
    flexDirection: 'column',
  },
  image: {
    flex: 1,
    resizeMode: 'cover',
    justifyContent: 'center',
  },
  text: {
    color: 'white',
    fontSize: 42,
    lineHeight: 84,
    fontWeight: 'bold',
    textAlign: 'center',
    backgroundColor: '#000000a0',
  },
});

export default App;
```

In the code above, the `ImageBackground` component is used to display a background image. The `source` prop is used to set the image, and the `style` prop is used to set the styles for the image. The Text component inside the `ImageBackground` component will be displayed on top of the image.
























  
