React Native apps built with Expo are known to be quite large in size, due to the fact that they include the entire Expo SDK. This allows for a smooth development experience with access to many APIs out of the box, but it does result in larger app binaries, regardless of which parts of the SDK your app actually uses[^0^][^4^][^8^][^10^].

If the size of your Expo app is a concern, there are a few strategies you can use to reduce it:

1. **Build an Android App Bundle (AAB) instead of an APK**: 
   - When you run `expo build:android`, you can specify `-t app-bundle` to build an AAB instead of an APK[^0^]. 
   - Android App Bundles are a new Android app publishing format that includes all your app's compiled code and resources, but defers APK generation and signing to Google Play. 
   - Google Play uses your app bundle to generate and serve optimized APKs for each device configuration, so only the code and resources that are needed for a specific device are downloaded to run your app[^12^].
   - This can significantly reduce the size of your app as installed on a user's device[^0^][^12^].

2. **Migrate to a bare React Native project**:
   - If you don't need the entire Expo SDK, you can eject from the managed workflow and move to a bare React Native project[^4^].
   - This allows you to include only the packages that your app actually uses, which can significantly reduce the size of your app[^4^].
   - However, this approach requires more setup and maintenance, as you'll need to manage the native Android and iOS projects yourself[^4^].

3. **Optimize your assets**:
   - Large image and audio files can significantly increase the size of your app[^6^].
   - You can reduce the size of these assets by compressing them, reducing their resolution, or moving them to a server and loading them dynamically[^6^].

Remember that while these strategies can help reduce the size of your app, they also come with trade-offs. Building an AAB requires users to download your app from the Google Play Store, migrating to a bare React Native project requires more maintenance, and optimizing your assets can potentially reduce their quality[^0^][^4^][^6^][^12^].



  
