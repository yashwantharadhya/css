class hacker
{
public static void main(String []args)
{
String s  = "Hacker";
char y[] = s.toCharArray();
int l = y.length;
char even[]=new char[l];
char odd[]=new char[l];
for(int i =0;i<l-1;i++)
{
if(y[i]%2==0)
{
even[i]  = y[i];
}
else
{
odd[i]= y[i];
}
System.out.print(even[i]+"  "+odd[i]);
}
}
}


