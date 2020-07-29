 import java.util.Scanner;
class facto
{
public static int fact(int no)
{
if(no==0)
{
return 1;
}
else{
return no*fact(no-1);
}
}

public static void main(String[]args)
{
for(int i=1;i<=10;i++)
{
Scanner s = new Scanner(System.in);
System.out.println("enter the number");
int no = s.nextInt();
System.out.println("factorial of a nummber is " +fact(no));
}
}
}
