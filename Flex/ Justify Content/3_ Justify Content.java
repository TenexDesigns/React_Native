In React Native, the `flex` property is used to specify how components should grow or shrink to fill the available space in their container. A component with a larger flex value will take up more space compared to a component with a smaller flex value [Source 0](https://reactnative.dev/docs/flexbox).

```jsx
import React from 'react';
import { View } from 'react-native';

const FlexExample = () => (
  <View style={{ flexDirection: 'row' }}>
    <View style={{ flex: 1, backgroundColor: 'red' }} />
    <View style={{ flex: 2, backgroundColor: 'darkorange' }} />
    <View style={{ flex: 3, backgroundColor: 'green' }} />
  </View>
);

export default FlexExample;
```

In this example, the red, darkorange, and green views are all children in the container view. The red view uses `flex: 1`, the darkorange view uses `flex: 2`, and the green view uses `flex: 3`. This means that the red view will take up 1/6 of the total space, the darkorange view will take up 2/6 of the space, and the green view will take up 3/6 of the space [Source 0](https://reactnative.dev/docs/flexbox).

`flexDirection` in React Native is used to specify the primary axis along which the children components are placed in the container. The default value for `flexDirection` in React Native is `column`, which is different from the default `row` value in CSS. The possible values for `flexDirection` are `row`, `column`, `row-reverse`, and `column-reverse` [Source 1](https://www.techiediaries.com/react-native-tutorial/flexbox-layouts-flex-flexdirection/).

```jsx
import React from 'react';
import { View } from 'react-native';

const FlexDirectionExample = () => (
  <View style={{ flexDirection: 'row' }}>
    <View style={{ width: 50, height: 50, backgroundColor: 'red' }} />
    <View style={{ width: 50, height: 50, backgroundColor: 'blue' }} />
  </View>
);

export default FlexDirectionExample;
```

In this example, the flexDirection is set to `row`, which means the red and blue views are laid out from left to right [Source 11](https://moeen.hashnode.dev/flex-your-layouts-a-comprehensive-guide-to-flexbox-in-react-native-with-code-snippets).

`justifyContent` is used to align children along the primary axis of their container. The possible values for `justifyContent` are `flex-start`, `flex-end`, `center`, `space-between`, `space-around`, and `space-evenly` [Source 2](https://blog.logrocket.com/using-flexbox-react-native/).

```jsx
import React from 'react';
import { View } from 'react-native';

const JustifyContentExample = () => (
  <View style={{ flex: 1, justifyContent: 'center' }}>
    <View style={{ width: 50, height: 50, backgroundColor: 'red' }} />
    <View style={{ width: 50, height: 50, backgroundColor: 'blue' }} />
  </View>
);

export default JustifyContentExample;
```

In this example, `justifyContent` is set to `center`, which means the red and blue views are centered along the main axis of the container [Source 2](https://blog.logrocket.com/using-flexbox-react-native/).


