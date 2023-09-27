import { Link, usePathname } from 'expo-router';





export default function AppBar2() {
    const path = usePathname();
    const isActive = route => path === route;
    console.log(path)

{
<View style={{backgroundColor: isActive('/') ? 'blue' : 'yellow'}}>
  <Link href="/">
    <Icon name="home" size={20} color={isActive('/home') ? 'blue' : '#fff'} />
  </Link>
</View>

}


  -------------------------------------


  To change the background color of the active screen and icon, you can use state in your AppBar2 component to keep track of the active route. When a route is active, you can change the color of the corresponding icon and the background color of the screen. Here's an example:

import { useRouting } from "expo-router";

// ...

const { getLocation } = useRouting();
const location = getLocation();
const isActive = route => location.pathname === route;

// ...

<View style={{backgroundColor: isActive('/home') ? 'blue' : 'green'}}>
  <Link href="/home">
    <Icon name="home" size={20} color={isActive('/home') ? 'blue' : '#fff'} />
  </Link>
</View>

// ...
In this example, the useRouting hook from expo-router is used to get the current location. The isActive function checks if a route is currently active. If the route is active, the background color of the icon's parent view and the color of the icon are set to blue; otherwise, they're set to green and white, respectively docs.expo.dev, expo.github.io, stackoverflow.com.
