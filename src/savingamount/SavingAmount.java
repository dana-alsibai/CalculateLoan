/*
        Name:  Dana Alsibai
        Assignment:  Revel Book
        Program: Calculate the saving amount 
        Date:  June 13th, 2020
    
        Description:
        Write a program that prompts the user to enter a monthly saving amount 
        and displays the account value after the sixth month.
 */
package savingamount;

import java.util.Scanner;

/**
 *
 * @author danasebai
 */
public class SavingAmount {

    public static void main(String[] args) {
        double annualInterestRate = 0.05;
        double savingAmount;
        double monthlyInterestRate;
        double monthlySavingAmount = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly saving amount: ");

        savingAmount = sc.nextDouble();

        monthlyInterestRate = annualInterestRate / 12;

        for (int i = 1; i <= 6; i++) {
            monthlySavingAmount = (monthlySavingAmount + savingAmount)
                    * (1 + monthlyInterestRate);

            System.out.println("After the " + i + " month the account value is "
                    + monthlySavingAmount);
        }
    }
}

