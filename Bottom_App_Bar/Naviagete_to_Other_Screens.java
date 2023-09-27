You can use the "asChild " prop to pass on the nviagtion of the  Link to the child, which should preferebly be a compoenent with an OnPress function

<Link href="/about" asChild>
      <Pressable>
      <Icon name="shopping-cart" size={20} color={isActive('/home') ? 'blue' : '#fff'} />

      </Pressable>
    </Link>


or use Button


  <Link href="/about" asChild>
      <Button title='About' >

      </Button>
    </Link>






-----------------------------------------------------------------------------------







  The Link component wraps the children in a <Text> component by default, this is useful for accessibility but not always desired. You can customize the component by passing the asChild prop, which will forward all props to the first child of the Link component. The child component must support the onPress and onClick props, href and accessibilityRole will also be passed down.

import { Pressable, Text } from "react-native";
import { Link } from "expo-router";

export default function Page() {
  return (
    <Link href="/other" asChild>
      <Pressable>
        <Text>Home</Text>
      </Pressable>
    </Link>
  );
}






  
