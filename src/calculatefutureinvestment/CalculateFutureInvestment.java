/*
        Name:  [Dana Alsibai]
        Assignment:  Pearson Revel Book
        Program: Financial application
        Date:  [assignment due date here]
    
        Description:
        calculate future investment value
        displays the future investment value using the following formula:
futureInvestment= investmentAmount * (1 + monthlyInterestRate)^(numberOfYears * 12)
 */
package calculatefutureinvestment;

import java.util.Scanner;

/**
 *
 * @author danasebai
 */
public class CalculateFutureInvestment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Exercise02_11.java: Create a method for computing future value
        Scanner input = new Scanner(System.in);
        // Enter the investment amount
        System.out.print("Enter the investment amount: ");
        double investmentAmount = input.nextDouble();
        // Enter yearly interest rate
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
        // Enter number of years
        System.out.print("Enter number of years: ");
        int years = input.nextInt();
        double futureValue
                = investmentAmount * Math.pow(1 + monthlyInterestRate,
                        years * 12);
        System.out.print("Future value is: $ 2"
                + (int) (futureValue * 100) / 100.0);
        System.out.println();
    }
} 


