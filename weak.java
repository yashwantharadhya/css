import java.util.*;
class weak
{
public static void main(string[]args)
{
weakHashMap m = new weakHashMap();
Temp t = new Temp();
m.put(t,"durga");
System.out.println(m);
t=null;
System.gc();
Thread.sleep(5000);
System.out.println(m);
}
}
