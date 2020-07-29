import java.util.*;
clas rrr
{
public static void main(String[]args)
{
Scanner scan = new Scanner(System.in);
System.out.println("enter the number");
int no = scan.nextInt();
int rem;
int revr=0;
while(no!=0)
{
rem=no%10;
revr= revr*10+rem;
no=no/10;
}
System.out.println(revr);
}
}

