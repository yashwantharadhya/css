class man
{
public static void main(String[]args)
{
for(int i=1;i<=4;i++)
  {
   for(int j=1;j<=i;j++)
   {
   if(i>1 && j=i-1)
    {
    System.out.print(" ");
    }
    else
    {
    System.out.print("*");
     }
    System.out.println();
     }
for(int i=1;i<=4;i++)
{
   for(int j=1;j<=i;j++)
{
   System.out.print(" ");
}
for(int k=4;k>=i;k--)
{
if(i>2&&k>1)
{
System.out.print(" ");
}
else
{
System.out.print("*");
}
}
System.out.println();
}
}
}

}

