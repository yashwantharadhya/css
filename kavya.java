import java.util.*;
class kavya
{
public static void main(String[]args)
{
PriorityQueue q = new PriorityQueue(15,new MyComparator());
q.offer("A");
q.offer("b");
q.offer("c");
q.offer("d");
System.out.println(q);
}
}
class MyComparator implements Comparator
{
public int compare(Object o1,Object o2)
{
String s1 = (String)o1;
String s2 = (String)o2;
return s1.compareTo(s2);
}
}

