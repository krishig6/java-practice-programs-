import java.util.Scanner;
public class Factors{
	static int count;
	static int[] factors;
public static void FindFactors(int n)
{
count =0;
factors = new int[n];
for (int i=1;i<=n;i++)
{
 if(n%i==0)
 {
  factors[count]=i; 
  count++;
  }
}
int[] result= new int[count];
for(int i=0; i<count; i++)
{
  result[i]= factors[i];
}
 factors= result;
  System.out.println("Factors of " + n +" are: ");
for(int i=0;i<count;i++)
{
 System.out.println(factors[i]);
}
}
public void sum()
{
int sum=0;
for(int i=0; i<count; i++)
{
 sum+=factors[i];
}
System.out.println("Sum of the factors is: " + sum );
}

public void product()
{
int product = 1;
for(int i =0; i< count ; i++)
{
  product*= factors[i];
}
System.out.println("Product of the factors is: "+ product);
}	
public void sumOfSquare()
{
int[] squares = new int[count];
 for( int i=0; i< count; i++)
 {
   squares[i]=factors[i]*factors[i];
 }
 int sums=0;
 for( int i=0; i< count; i++)
 {
  sums+= squares[i];
 }
System.out.println("Sum of square of the factors is: " + sums);
} 
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
System.out.println("Enter a number: ");
int n;
n= input.nextInt();
FindFactors(n);
Factors obj = new Factors();
obj.sum();
obj.product();
obj.sumOfSquare();
input.close();
}
}
