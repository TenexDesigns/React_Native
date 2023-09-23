React Native provides several built-in components for creating forms and handling input. These include:

- `TextInput`: This component is used to receive text input from the user. It can be customized to accept strings, numbers, and passwords. You can also use it with the `placeholder` prop to provide hints to the user, and with the `onChangeText` prop to capture data every time the input's value changes [[Source 4](https://blog.logrocket.com/complete-guide-textinput-react-native/)].

```jsx
<TextInput
  style={styles.input}
  placeholder="John Doe"
  onChangeText={(value) => setName(value)}
/>
```

- `Switch`, `Picker`, `Slider`: These are other input components provided by React Native for different types of input [[Source 0](https://blog.logrocket.com/building-react-native-forms-with-ui-components/)].

In addition to the built-in components, there are several third-party libraries that can be used to extend the functionality of forms and input handling in React Native:

- `Formik`: This library provides extra components for form validation and refined form submission options [[Source 0](https://blog.logrocket.com/building-react-native-forms-with-ui-components/)].

- `react-native-elements`: This library provides an `Input` component that's a wrapper around the `TextInput` component. The `Input` component can be used with the `onChangeText` prop just like `TextInput` [[Source 11](https://stackoverflow.com/questions/59746685/how-to-get-input-value-from-react-native-element)].

```jsx
import { Input } from 'react-native-elements';

<Input
  onChangeText={text => onChangeText(text)}
  value={value}
/>
```

- `react-hook-form`: This library provides a `register` function that can be used to register an input used in a form of any type. It also provides a way to define and display validation errors [[Source 12](https://www.thisdot.co/blog/how-to-create-reusable-form-components-with-react-hook-forms-and-typescript/)].

```jsx
<Input name={name} {...props} {...(register && register(name, rules))} />
```

- `react-native-gifted-chat`: This library provides a pre-developed customizable chat component that includes a text input for typing messages [[Source 14](https://blog.logrocket.com/react-native-component-libraries/)].

- `react-native-paper`: This library offers a wide range of customizable components, including text inputs, which you can theme and extend to suit your needs [[Source 17](https://flatlogic.com/blog/top-react-native-ui-components-libraries/)].



