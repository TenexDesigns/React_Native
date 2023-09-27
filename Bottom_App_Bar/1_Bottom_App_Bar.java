The AppBar component from the `@react-native-material/core` library should stick to the bottom of the screen when you set the `variant` prop to `"bottom"` and apply the correct styles. However, if it's not sticking to the bottom as expected, it might be due to the structure of your other components.

The AppBar component should be a sibling to your main content component, and they should both be inside a parent component with `flex: 1` style. This parent component should also use `justifyContent: 'space-between'` to push the AppBar to the bottom.

Here's an example:

```jsx
import React from "react";
import { View, ScrollView } from "react-native";
import { AppBar, IconButton } from "@react-native-material/core";
import Icon from "@expo/vector-icons/MaterialCommunityIcons";

const App = () => (
  <View style={{ flex: 1, justifyContent: 'space-between' }}>
    <ScrollView>
      {/* Your main content goes here */}
    </ScrollView>
    <AppBar
      variant="bottom"
      leading={props => (
        <IconButton icon={props => <Icon name="menu" {...props} />} {...props} />
      )}
      trailing={props => (
        <IconButton
          icon={props => <Icon name="magnify" {...props} />}
          {...props}
        />
      )}
    />
  </View>
);

export default App;
```

In this example, the `ScrollView` component represents your main content. As the user scrolls, the AppBar stays fixed at the bottom of the screen. The `justifyContent: 'space-between'` style on the parent `View` component pushes the AppBar to the bottom.








  
