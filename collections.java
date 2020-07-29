import java.util.*;

class collections
{
public static void main(String[]args)
{
ArrayList l = new ArrayList();
l.add("z");
l.add("A");
l.add("k");
l.add("N");
System.out.println("before sorting"+l);
Collections.sort(l,new Mycomparator());


System.out.println("after sorting"+l);
}
}

class Mycomparator implements Comparator
{
public int compare(Object obj1,Object obj2)
{
String s1 = (String)obj1;
String s2 = obj2.toString();
return s2.compareTo(s1);
}
}




