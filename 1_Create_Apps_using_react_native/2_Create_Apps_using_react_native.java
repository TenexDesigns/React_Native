To get started with building apps using vanilla React Native, you'll need to set up your development environment and create a new React Native project. Here are the steps to get started:

1. Set Up Your Development Environment:
Before you can build React Native apps, you need to set up your development environment. Follow the official React Native documentation for installation instructions based on your operating system:

React Native Getting Started
Ensure you have Node.js, npm (Node Package Manager), and Yarn installed. You'll also need Android Studio for Android development and Xcode for iOS development if you're targeting both platforms.

2. Create a New React Native Project:
Once your development environment is set up, you can create a new React Native project using the following commands. Replace MyApp with the name you want for your project:

bash
Copy code
npx react-native init MyApp
This command initializes a new React Native project called MyApp.

3. Navigate to Your Project Directory:
Change into your project directory using the cd command:

bash
Copy code
cd MyApp
4. Start the Development Server:
To start the development server, run the following command:

bash
Copy code
npx react-native start
This command launches the Metro Bundler, which serves your JavaScript code.

5. Build and Run Your App on Android:
To build and run your app on an Android emulator or physical device, use the following command:

bash
Copy code
npx react-native run-android
Ensure you have an Android emulator set up and running, or connect a physical Android device via USB debugging.

6. Build and Run Your App on iOS (macOS only):
To build and run your app on the iOS Simulator or a physical iOS device, use the following command:

bash
Copy code
npx react-native run-ios
This command will open the iOS Simulator or, if a physical iOS device is connected, install the app on the device.

7. Start Coding Your App:
With your development server running and your app on the emulator or device, you can start coding your React Native app. Open the project in your preferred code editor and make changes to the files in the src directory.

8. Hot Reloading:
React Native supports hot reloading, which means you can see the changes you make to your code without having to restart the entire app. Simply save your changes, and they will automatically appear on the emulator or device.

9. Debugging:
Use the built-in developer tools for debugging your app. You can access the developer menu on your emulator/device to enable debugging, view logs, and more.

That's it!
