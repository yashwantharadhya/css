class Demo
{
int add(int x,int y)
{
return x+y;
}
double add(int x,double y)
{
return x+y;
}
float add(float x, int y)
{
return x+y;
}
}

class launch
{
public static void main(String[]args)
{
Demo d = new Demo();
int a =10,b=20;
int c=10,d=20;
System.out.println(d.add(a,b));
System.out.println(d.add(c,d));
}
}
