import java.util.Scanner;

public class NumberCheck {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        else if (number1 == number2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + numbers[i] + " is ");
            if (isPositive(numbers[i])) {
                System.out.print("Positive and ");
                if (isEven(numbers[i])) {
                    System.out.println("Even.");
                } else {
                    System.out.println("Odd.");
                }
            } else {
                System.out.println("Negative.");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        System.out.print("\nComparison of first and last elements: ");
        if (result == 1) {
            System.out.println(numbers[0] + " is Greater than " + numbers[4]);
        } else if (result == 0) {
            System.out.println("Both are Equal.");
        } else {
            System.out.println(numbers[0] + " is Less than " + numbers[4]);
        }

        sc.close();
    }
}
