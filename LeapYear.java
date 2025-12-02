import java.util.Scanner;
public class LeapYear{
public static void CheckYear(int n)
{
 if(n>=1582)
 { 
  if((n%4==0 && n%100!=0 )|| n%400!=0)
  {
    System.out.println(n + "is a leap year");
  }
 }
 else
 {
   System.out.println(n + "is not a leap year" );
 }
}
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
int n;
System.out.println("Enter year: ");
n= input.nextInt();
CheckYear(n);
input.close();
}
} 