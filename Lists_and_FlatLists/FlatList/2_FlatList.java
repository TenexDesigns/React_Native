

1

2

3

4

5

6
FlatList is a performant interface for rendering basic, flat lists, supporting the most handy features. It is a convenience wrapper around VirtualizedList, and thus inherits its props (as well as those of ScrollView) that aren't explicitly listed here, along with the following caveats:

Internal state is not preserved when content scrolls out of the render window. Make sure all your data is captured in the item data or external stores like Flux, Redux, or Relay.
This is a PureComponent which means that it will not re-render if props remain shallow-equal. Make sure that everything your renderItem function depends on is passed as a prop (e.g. extraData) that is not === after updates, otherwise your UI may not update on changes. This includes the data prop and parent component state.
In order to constrain memory and enable smooth scrolling, content is rendered asynchronously offscreen. This means it's possible to scroll faster than the fill rate and momentarily see blank content. This is a tradeoff that can be adjusted to suit the needs of each application, and we are working on improving it behind the scenes.
Code samples

The following code sample shows how to use FlatList to render a simple list of items:

JavaScript
import React, { useState } from 'react';
import { FlatList } from 'react-native';

const data = [
  { id: 1, name: 'Item 1' },
  { id: 2, name: 'Item 2' },
  { id: 3, name: 'Item 3' },
];

const MyComponent = () => {
  const renderItem = ({ item }) => (
    <Text key={item.id}>{item.name}</Text>
  );

  return (
    <FlatList
      data={data}
      renderItem={renderItem}
    />
  );
};

export default MyComponent;
Use code with caution. Learn more
This code will render a list with three items: "Item 1", "Item 2", and "Item 3".

The following code sample shows how to use FlatList to render a list of items in multiple columns:

JavaScript
import React, { useState } from 'react';
import { FlatList } from 'react-native';

const data = [
  { id: 1, name: 'Item 1' },
  { id: 2, name: 'Item 2' },
  { id: 3, name: 'Item 3' },
  { id: 4, name: 'Item 4' },
  { id: 5, name: 'Item 5' },
  { id: 6, name: 'Item 6' },
];

const MyComponent = () => {
  const renderItem = ({ item }) => (
    <Text key={item.id}>{item.name}</Text>
  );

  return (
    <FlatList
      data={data}
      renderItem={renderItem}
      numColumns={2}
    />
  );
};

export default MyComponent;
Use code with caution. Learn more
This code will render a list with two columns, each with three items.

Why use FlatList?

FlatList is a good choice for rendering large lists of data because it is optimized for performance. It uses a number of techniques to improve performance, such as recycling components and rendering offscreen content asynchronously.

FlatList is also a versatile component that can be used to create a variety of different list interfaces, such as:

Simple lists of items
Lists of items with multiple columns
Lists of items with headers and footers
Lists of items with separators
Lists of items that can be refreshed by pulling down
Lists of items that can be scrolled infinitely
Styling FlatList

FlatList can be styled using the same CSS properties as any other React Native component. However, there are a few special properties that can be used to style the list itself, such as columnWrapperStyle and ListHeaderComponentStyle.

The columnWrapperStyle prop can be used to style the wrapper element that is used to render multi-item rows when numColumns is greater than 1. The ListHeaderComponentStyle prop can be used to style the wrapper element that is used to render the list header.

Conclusion

FlatList is a powerful and versatile component that can be used to create a variety of different list interfaces. It is optimized for performance and can be styled using the same CSS properties as any other React Native component.

Sources
s-pace.github.io/react-native/docs/0.50/flatlist.html
63444b71u11g.back-vision.xyz/
react-native-sectionlist-scrolltolocation-example.exvidiosliyanarachchi.fun/
www.iditect.com/how-to/53847398.html
reactnative.dev/blog/tags/engineering
github.com/Vishnu-Nalagatla/KarachiBakery_Clone








  
