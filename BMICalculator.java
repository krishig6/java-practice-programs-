import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; 
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] teamData = new double[10][3];  

        System.out.println("Enter weight (kg) and height (cm) for 10 members:");

        for (int i = 0; i < teamData.length; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            teamData[i][1] = sc.nextDouble();
        }

        calculateBMI(teamData);

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < teamData.length; i++) {
            double bmi = teamData[i][2];
            String status = getBMIStatus(bmi);
            System.out.printf("Person %d: Weight = %.1f kg, Height = %.1f cm, BMI = %.2f, Status = %s\n",
                    (i + 1), teamData[i][0], teamData[i][1], bmi, status);
        }

        sc.close();
    }
}
