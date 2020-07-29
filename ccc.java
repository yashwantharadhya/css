import java.util.*;
class ppp
{
public static void main(String[]args)
{
ArrayList al =new ArrayList();
al.add(10);
al.add(20);
al.add(40);
al.add(5);
al.add(100);
System.out.println(al);
Collections.sort(al,new Mcomparator);
System.out.println(al);
System.out.println(Collections.binarySearch(al,10,Mcomparator));
System.out.println(Collections.binarySearch(al,20,Mcomparator));
}
}
class Mcomparator implements comparator
{
public int compare(Object o1,Object o2)
{
Integer i1= (Integer)o1;
Integer i2 =(Integer)o2;
return i2.compareTo(i1);
}
}



