import java.util.Scanner;
public class SumNaturalNos{
	static int sum=0;
	static int result=0;
public static void calcNaturalNos(int n)
{

for(int i=0;i<=n;i++)
 {
  sum+=i;
 }
  System.out.println(sum);
}  
public static void calcNaturalNosFor(int n)
{
  
  result=n*(n+1)/2;
  System.out.println(result);
}
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
int n;
System.out.println("Enter a no. : ");
n= input.nextInt();
calcNaturalNos(n);
calcNaturalNosFor(n);
if (sum==result)
{
System.out.println("Both are same");
}
input.close();
}
}
