In Expo, you can configure and display a splash screen by making use of the `app.json` configuration file. Here's how you can apply a splash screen to an Expo React Native app:

**Step 1: Prepare Your Splash Screen Image:**

Prepare an image for your splash screen. The recommended size for the splash screen image is 1242x2688 pixels (portrait) for iOS and 1080x1920 pixels (portrait) for Android. Save this image in a suitable location in your project directory.

**Step 2: Configure `app.json`:**

Open your `app.json` configuration file, which is typically located at the root of your Expo project, and add or modify the `"splash"` field to specify the path to your splash screen image. Here's an example configuration:

```json
{
  "expo": {
    "name": "Your Expo App",
    "slug": "your-expo-app",
    "version": "1.0.0",
    "orientation": "portrait",
    "splash": {
      "image": "./assets/splash.png", // Path to your splash screen image
      "resizeMode": "contain",
      "backgroundColor": "#ffffff"
    },
    // ...other configuration options...
  }
}
```

In this example:

- `"image"` points to the path of your splash screen image relative to the project root. Adjust the path to match your image's location.

- `"resizeMode"` specifies how the image should be resized to fit the screen. You can use `"contain"` or `"cover"` based on your design preferences.

- `"backgroundColor"` sets the background color behind the splash screen image. Replace `#ffffff` with your desired background color.

**Step 3: Build and Start Your Expo App:**

After configuring `app.json`, save the file, and run your Expo app using the following command:

```bash
expo start
```

Your app will now display the specified splash screen image when it is launched. The splash screen will automatically disappear once your app is fully loaded.

Expo takes care of generating the necessary assets and configurations for both iOS and Android based on the settings in `app.json`.

Please ensure that you replace `"./assets/splash.png"` with the correct path to your splash screen image file. Additionally, you can further customize the appearance and behavior of your splash screen by adjusting the options in the `"splash"` field in `app.json`.








  
