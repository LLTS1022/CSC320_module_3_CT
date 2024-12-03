package module3;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		//Declare the needed variables
        double weeklyIncome;
        double taxRate;
        double taxWithholding;

        //Create a Scanner object so the user can input their income
        Scanner scanner = new Scanner(System.in);

        //Prompt the user for their weekly income
        System.out.print("Enter the weekly income: ");
        weeklyIncome = scanner.nextDouble();

        //Determine the tax rate based on the income brackets
        if (weeklyIncome < 500) {
            taxRate = 0.10;
        } else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
            taxRate = 0.15;
        } else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        //Calculate the tax withholding
        taxWithholding = weeklyIncome * taxRate;

        //Display result
        System.out.printf("The weekly average tax withholding is: $%.2f%n", taxWithholding);

        //Close the scanner
        scanner.close();
    }
}
