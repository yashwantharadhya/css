import java.util.*;
class HashMapd
{
public static void main(String[]args)
{

LinkedHashMap m = new LinkedHashMap();
m.put("yash",1000);
m.put("vinod",200);
m.put("puru",5000);
m.put("pooja",555);
System.out.println(m);
System.out.println(m.put("pooja",700));
Set s=m.keySet();
System.out.println(s);
Collection v =m.values();
System.out.println(v);
Set s1 =m.entrySet();
System.out.println(s1);
Iterator itr = s1.iterator();
while(itr.hasNext())
{
Map.Entry m1 =(Map.Entry)itr.next();
System.out.println(m1.getKey()+"............"+m1.getValue());
if(m1.getKey().equals("pooja"))
{
m1.setValue(95000);
}
}
System.out.println(m);
 }
}

