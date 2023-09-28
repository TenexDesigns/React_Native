Reducing the app size by optimizing assets, eliminating unused code, and enabling minification and compression involves several steps. Below, I'll outline how to perform these tasks for a typical React Native project:

### 1. Optimize Assets:

#### Images:

1. **Image Compression:** Use tools like ImageOptim, TinyPNG, or Squoosh to compress your images before adding them to your project.

2. **Image Formats:** Use modern image formats like WebP, which offer better compression and quality compared to older formats like PNG or JPEG.

3. **Lazy Loading:** Implement lazy loading for images that are not immediately visible on the screen. Libraries like `react-lazyload` can help with this.

#### Videos and Audio:

1. **Video and Audio Compression:** Compress video and audio files to reduce their size while maintaining acceptable quality.

2. **Streaming:** For large media files, consider streaming content from a server rather than bundling it with the app. This can be done using various media streaming libraries.

### 2. Eliminate Unused Code:

#### Tree Shaking:

1. **Webpack Tree Shaking:** If you're using Webpack for your React Native project, Webpack's tree shaking feature will automatically eliminate unused code during the build process.

2. **ESLint and Code Analysis:** Use ESLint and static code analysis tools to identify and remove dead code, unused imports, and functions from your codebase.

### 3. Minification and Compression:

#### JavaScript Minification:

1. **Babel Minify Plugin:** If you're using Babel for your JavaScript transpilation, you can use the `babel-minify` plugin to minify your code. Install it and add it to your Babel configuration.

   ```bash
   npm install babel-minify --save-dev
   ```

   In your `.babelrc` or `babel.config.js`, add:

   ```json
   {
     "plugins": ["babel-minify"]
   }
   ```

2. **Enable Minification in Bundler:** If you're using a bundler like Metro, make sure that minification is enabled in your bundler's configuration.

#### Compression:

1. **Enable Compression for Assets:** When building your app, make sure that assets (JavaScript bundles, images, etc.) are compressed. Most bundlers, like Metro for React Native, have compression options enabled by default.

   For example, if you're using Metro, you can create a production build with compression using:

   ```bash
   react-native bundle --platform android --dev false --entry-file index.js --bundle-output android/app/src/main/assets/index.android.bundle --assets-dest android/app/src/main/res --compress true --reset-cache true
   ```

   Adjust the command for your specific project structure and requirements.

2. **Enable GZIP or Brotli:** If you're serving assets from a server, make sure that GZIP or Brotli compression is enabled on your server to reduce data transfer size.

By following these steps, you can significantly reduce the size of your React Native app. Keep in mind that asset optimization, code elimination, and minification should be part of your regular development and build processes to maintain a compact app size.
