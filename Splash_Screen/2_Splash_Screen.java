To apply a splash screen in an Expo React Native app, you can follow these steps:

1. Create a splash screen image: Design a splash screen image that you want to display when the app starts. The image should be in the appropriate size and format for different screen densities.

2. Add the splash screen image to your project: Place the splash screen image in the root directory of your Expo project. Name the image file `splash.png`.

3. Configure the splash screen in the `app.json` file:
   - Open the `app.json` file in the root directory of your Expo project.
   - Add the following code inside the `expo` object:

   ```json
   "splash": {
     "image": "./splash.png",
     "resizeMode": "contain",
     "backgroundColor": "#ffffff"
   }
   ```

   - Replace `./splash.png` with the path to your splash screen image file.
   - Optionally, you can customize the `resizeMode` and `backgroundColor` properties to fit your requirements.

4. Build and run your Expo app: Run the Expo development server using the `expo start` command. Your app should now display the splash screen when it starts up.

Expo will automatically handle the splash screen configuration for both Android and iOS platforms based on the `app.json` file.

Note: The splash screen configuration in Expo is limited compared to a bare React Native app. If you need more advanced customization options, you may consider ejecting your Expo project to a bare React Native project.

Here's an example of how the `app.json` file may look after configuring the splash screen:

```json
{
  "expo": {
    "name": "Your App Name",
    "slug": "your-app-slug",
    "version": "1.0.0",
    "splash": {
      "image": "./splash.png",
      "resizeMode": "contain",
      "backgroundColor": "#ffffff"
    },
    "platforms": ["ios", "android"],
    "ios": {
      // iOS specific configuration
    },
    "android": {
      // Android specific configuration
    },
    // Other app configuration
  }
}
```

Make sure to replace `"Your App Name"` and `"your-app-slug"` with your actual app name and slug.

After following these steps, your Expo React Native app should display the splash screen when it starts up.

Let me know if you need further assistance or have any other questions!
