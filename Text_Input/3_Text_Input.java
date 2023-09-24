`TextInput` is a foundational component in React Native that allows text input into your app via a keyboard. It has several configurable props that provide various features, such as auto-correction, auto-capitalization, placeholder text, and different keyboard types. It comes with events such as `onChangeText`, `onSubmitEditing`, and `onFocus` that you can subscribe to.

Here's a basic example of how to use `TextInput` in React Native:

```jsx
import React, { useState } from 'react';
import { TextInput, View, Text } from 'react-native';

const App = () => {
  const [value, setValue] = useState('');

  return (
    <View>
      <TextInput
        style={{ height: 40, borderColor: 'gray', borderWidth: 1 }}
        onChangeText={text => setValue(text)}
        value={value}
      />
      <Text>
        You entered: {value}
      </Text>
    </View>
  );
};

export default App;
```

In this example, we create a `TextInput` component with a `height` of `40` and a `borderColor` of `gray`. We subscribe to the `onChangeText` event to update the state `value` every time the text changes. The entered text is then displayed below the text input field.

Some of the props available with `TextInput` are:

- `allowFontScaling`: Specifies whether fonts should scale to respect Text Size accessibility settings. The default is true.
- `autoCapitalize`: Tells `TextInput` to automatically capitalize certain characters.
- `autoComplete`: Specifies autocomplete hints for the system, so it can provide autofill.
- `autoCorrect`: If false, disables auto-correct. The default value is true.
- `autoFocus`: If true, focuses the input on `componentDidMount`. The default value is false.
- `blurOnSubmit`: If true, the text field will blur when submitted. The default value is true for single-line fields and false for multiline fields.
- `caretHidden`: If true, caret is hidden. The default value is false.

Please note that some props are only available with `multiline={true/false}`. Additionally, border styles that apply to only one side of the element (e.g., borderBottomColor, borderLeftWidth, etc.) will not be applied if `multiline=true`. To achieve the same effect, you can wrap your `TextInput` in a View. 

Also, note that on Android performing text selection in an input can change the app's `windowSoftInputMode` param to `adjustResize`. This may cause issues with components that have `position: 'absolute'` while the keyboard is active. To avoid this behavior either specify `windowSoftInputMode` in `AndroidManifest.xml` or control this param programmatically with native code [Source 0](https://developer.android.com/guide/topics/manifest/activity-element.html).


