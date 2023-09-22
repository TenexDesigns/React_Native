The `Image` component in React Native is used for displaying various types of images, including network images, static resources, temporary local images, and images from local disk storage. Here's a breakdown of the important areas and props related to the `Image` component, along with some code samples:
You have to set the height and with of all images for them t be dislayed well.



1. **Basic Usage:**

   You can use the `Image` component to display images from various sources. Here's a basic example:

   ```jsx
   import React from 'react';
   import { Image } from 'react-native';

   const BasicImageExample = () => {
     return (
       <Image
         source={{ uri: 'https://example.com/image.jpg' }}
         style={{ width: 200, height: 200 }}
       />
     );
   };

   export default BasicImageExample;
   ```

   In this example, we display an image from a remote URL using the `source` prop.

2. **Image Styling:**

   You can apply styles to the `Image` component just like any other React Native component. Here's an example:

   ```jsx
   import React from 'react';
   import { Image, StyleSheet } from 'react-native';

   const ImageStylingExample = () => {
     return (
       <Image
         source={{ uri: 'https://example.com/image.jpg' }}
         style={styles.image}
       />
     );
   };

   const styles = StyleSheet.create({
     image: {
       width: 200,
       height: 200,
       borderRadius: 10,
     },
   });

   export default ImageStylingExample;
   ```

   In this example, we apply styles to the `Image` component to give it a rounded appearance.

3. **Handling Image Loading and Errors:**

   You can use props like `onLoad`, `onError`, and `loadingIndicatorSource` to handle image loading events and errors. Here's an example:

   ```jsx
   import React from 'react';
   import { Image } from 'react-native';

   const ImageLoadErrorExample = () => {
     const handleLoad = () => {
       console.log('Image loaded successfully');
     };

     const handleError = () => {
       console.log('Error loading image');
     };

     return (
       <Image
         source={{ uri: 'https://example.com/nonexistent-image.jpg' }}
         onLoad={handleLoad}
         onError={handleError}
       />
     );
   };

   export default ImageLoadErrorExample;
   ```

   In this example, we use the `onLoad` and `onError` props to handle image loading events.

4. **Image Resize and Aspect Ratio:**

   You can control how the image resizes within its container using the `resizeMode` prop. Common options are `cover`, `contain`, `stretch`, `repeat`, and `center`. Here's an example:

   ```jsx
   import React from 'react';
   import { Image } from 'react-native';

   const ResizeModeExample = () => {
     return (
       <Image
         source={{ uri: 'https://example.com/image.jpg' }}
         style={{ width: 200, height: 200 }}
         resizeMode="cover"
       />
     );
   };

   export default ResizeModeExample;
   ```

   In this example, we use `resizeMode="cover"` to scale the image while maintaining its aspect ratio to cover the container.

5. **Local Images and Static Resources:**

   You can also use local images and static resources with the `Image` component. Here's an example:

   ```jsx
   import React from 'react';
   import { Image } from 'react-native';

   const LocalImageExample = () => {
     return (
       <Image
         source={require('./assets/local-image.png')}
         style={{ width: 200, height: 200 }}
       />
     );
   };

   export default LocalImageExample;
   ```

   In this example, we use the `require` function to load a local image.

6. **Cache Control for Images:**

   The `source` prop can contain multiple remote URLs and additional properties like `cache` to control caching. However, this feature might depend on the library or component you're using for image loading.

7. **Image Prefetching:**

   React Native provides a method called `Image.prefetch` that allows you to prefetch remote images for later use. It can help improve image loading performance.

8. **Image Sizing and Dimensions:**

   You can specify the dimensions of the image using the `width` and `height` props, or you can use the `getSize` method to retrieve the image's dimensions before rendering.

These are some of the important aspects of using the `Image` component in React Native. Depending on your specific use case, you may need to use additional props or techniques for advanced functionality.
















  For GIF and WebP support on Android, you will need to add some optional modules in android/app/build.gradle blog.logrocket.com.

You can also use the ImageBackground component to display background images, similar to using background images in CSS positronx.io.

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
In the code above, the ImageBackground component is used to display a background image. The source prop is used to set the image, and the style prop is used to set the styles for the image. The Text component inside the ImageBackground component will be displayed on top of the image.







  




  
