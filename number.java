class number
{
public static void main(String[]args)
{
for(int i=1;i<=4;i++)
    {
int count=i;
    for(int j=1;j<=i;j++)
    {

     System.out.print(count);
     count = count+4-j;
     }
     System.out.println();
}
}
}

