  /*
        Name:  [Dana ALsibai]
        Assignment:  [Pearson Revel]
        Program: [CalculateLoan]
        Date:  [June 8th,2020]
    
        Description: 1- the application must let the user enter the interest rate, 
       the loan amount, and the number of years for which payments will be made.
       2- compute and display the monthly payment and total payment amounts.

    */

package calculateloan;

import java.util.Scanner;

/**
 *
 * @author danasebai
 */
public class CalculateLoan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter The Annual Interest rate, eg: 7.25%:\t");
        
        double annualRate = input.nextDouble();
        
        double monthlyInterestRate = annualRate / 1200;
        
        System.out.print("Enter the number of years:\t\t\t");
        
        int numberOfYears = input.nextInt();
        
         System.out.print("Enter the loan amount:\t\t\t        ");
         
         double loanAmount = input.nextDouble();
         
         double monthlyPayment = loanAmount * monthlyInterestRate / (
                 1 - 1/Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
         
         double totalPayment = monthlyPayment * numberOfYears * 12;
         
         //Print the numbers with only 2 digits after the decimal point
         //by multiplying the amount by 100 and type cast to an int 
         //and then divide by 100 
         System.out.println("The monthly payment is:\t $ " 
                            + (int) (monthlyPayment * 100) / 100.0);
         
         System.out.println("The total payment is: \t $" 
                            + (int) (totalPayment * 100) / 100.0);
        
        
        
        
    }

}
