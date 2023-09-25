
To use custom fonts in React Native, you can follow these steps:

Download the font files that you want to use.
Create a new folder in the root directory of your React Native project called assets/fonts.
Copy the font files that you downloaded into the assets/fonts folder.
Add the following code to your app.json file:
JSON
{
  "expo": {
    "assets": [
      "assets/fonts/*"
    ]
  }
}
Use code with caution. Learn more
In your React Native code, import the ExpoFont component from expo-font.
Call the useFont hook to load the custom font.
Use the fontFamily prop of the Text component to apply the custom font to the text.
Here is an example of how to use custom fonts in React Native:

JavaScript
import React, { useState, useEffect } from 'react';
import { Text, View } from 'react-native';
import { ExpoFont } from 'expo-font';

const App = () => {
  const [fontLoaded, setFontLoaded] = useState(false);

  useEffect(() => {
    ExpoFont.loadAsync({
      'my-font': require('./assets/fonts/my-font.ttf'),
    }).then(() => {
      setFontLoaded(true);
    });
  }, []);

  if (!fontLoaded) {
    return <Text>Loading font...</Text>;
  }

  return (
    <View>
      <Text fontFamily="my-font">This is my custom font!</Text>
    </View>
  );
};

export default App;
Use code with caution. Learn more
This code will load the custom font my-font.ttf and then apply it to the text in the Text component.

You can also use custom fonts in React Native with the TextStyle component. To do this, you need to create a new TextStyle object and set the fontFamily prop to the name of the custom font.

Here is an example of how to use custom fonts in React Native with the TextStyle component:

JavaScript
import React from 'react';
import { Text, View } from 'react-native';
import { StyleSheet } from 'react-native';

const styles = StyleSheet.create({
  myFontTextStyle: {
    fontFamily: 'my-font',
  },
});

const App = () => {
  return (
    <View>
      <Text style={styles.myFontTextStyle}>This is my custom font!</Text>
    </View>
  );
};

export default App;
Use code with caution. Learn more
This code will apply the custom font my-font.ttf to the text in the Text component.

I hope this helps!

Sources
github.com/glueckler/popcycle


  
