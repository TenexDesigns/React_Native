Here are some tips on how to reduce the app size of your Expo React Native app:

**Assets:**

* **Optimize and compress your images.** Use a tool like TinyPNG or ImageOptim to reduce the size of your images without sacrificing quality.
* **Use web-friendly image formats.** JPEG and PNG are the most common web-friendly image formats. Avoid using formats like BMP and TIFF, as they are much larger in size.
* **Lazy load your images.** Lazy loading allows you to load images only when they are needed. This can reduce the initial size of your app and improve its performance.
* **Dynamically load your assets.** If you have a large number of assets, consider dynamically loading them when they are needed. This can also reduce the initial size of your app and improve its performance.

**Unused code:**

* **Use tree shaking and code splitting.** Tree shaking removes unused code from your app bundle, while code splitting allows you to split your code into multiple bundles, which can be loaded on demand. This can reduce the overall size of your app.
* **Avoid importing and bundling unnecessary modules.** Only import and bundle the modules that you need. You can use a tool like Webpack Bundle Analyzer to identify unused modules.

**Minification and compression:**

* **Enable code minification and compression when building your app.** Minification reduces the size of your JavaScript code by removing whitespace and renaming variables, while compression further reduces the bundle size.

**Here are some additional tips:**

* **Use a smaller font library.** Font libraries can add a lot of weight to your app bundle. Consider using a smaller font library, such as Google Fonts.
* **Remove unused dependencies.** Use a tool like Yarn or npm to identify unused dependencies.
* **Use a smaller build system.** Metro is the default build system for Expo React Native apps. However, there are other build systems, such as Webpack, that may be smaller and faster.

By following these tips, you can reduce the size of your Expo React Native app and make it faster to load and run.
