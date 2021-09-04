import java.util.Scanner;

public class TaxRate {
    
    public static void main (String[] args){
        
            //declaring variables to be used in the main method
        int income;
        double taxRate = 0;
        double withholdings;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter your weekly income: ");
        income = scnr.nextInt ();

            //using if-else statments to take the users income and apply the correct
            //tax rate for their income.
        if(income < 500){
            taxRate = 0.10;
        } else if(income >= 500 && income < 1500){
            taxRate = 0.15;
        } else if(income >= 1500 && income < 2500){
            taxRate = .20;
        } else{
            taxRate = .30;
        }
            //calculating the users withholdings by multiplying the users income by the appropriate tax rate
        withholdings = income * taxRate;

        System.out.println ("You need to withhold " + withholdings +"$ per week to properly pay your taxes."  );

        scnr.close ();
     
    }
}