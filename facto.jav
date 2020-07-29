java import.util.Scanner;
class facto
{
int fact=1;
public static void main(string[]args)
{
Scanner s = new Scanner();
int no = s.nextInt(System.in);
facto f = new facto();
f.calfa(no);
System.out.println("factrial of a number is "+fact);
}


int calfa(int no)
{
if(no>1)
{
fact=fact*no;
fact(no-1);
return fact;
}
}
}


