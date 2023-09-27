


Use  "usePathname" , to find the current path name.



import { Link, usePathname } from 'expo-router';




export default function AppBar2() {

    const path = usePathname();
    const isActive = route => path === route;
    console.log(path)
return (

<View style={{backgroundColor: isActive('/') ? 'blue' : 'yellow'}}>
  <Link href="/">
    <Icon name="home" size={20} color={isActive('/home') ? 'blue' : '#fff'} />
  </Link>
</View>

)
