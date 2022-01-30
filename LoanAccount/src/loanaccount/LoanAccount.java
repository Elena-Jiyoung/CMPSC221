/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loanaccount;

/**
 *
 * @author kinner
 */
public class LoanAccount {
    private static double annualInterestRate;
    private double principle;
    
    public LoanAccount(double principle) {
        this.principle = principle;
    }

    public static void setAnnualInterestRate(double rate) {
        annualInterestRate = rate;
    }

    public double calculateMonthlyPayment(int numberOfPayments) {
        double monthlyInterest = annualInterestRate / 12;
        return Math.round(principle * ( monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -numberOfPayments))) * 100.0)/100.0;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoanAccount loan1 = new LoanAccount(5000.00);
        LoanAccount loan2 = new LoanAccount(31000.00);

        
        System.out.println("Monthly payments for loan of $5000.00 and loan2 $31000.00 for 3, 5, and 6 year loans at 1% interest.");
        LoanAccount.setAnnualInterestRate(0.01);

        double x =  loan1.calculateMonthlyPayment(36);
        double x2 = loan1.calculateMonthlyPayment(60);
        double x3 = loan1.calculateMonthlyPayment(72);
        double y =  loan2.calculateMonthlyPayment(36);
        double y2 = loan2.calculateMonthlyPayment(60);
        double y3 = loan2.calculateMonthlyPayment(72);

        System.out.println("Loan     3 years 5 years 6 years");
        System.out.printf("loan1    %.2f  %.2f   %.2f%n", x, x2, x3);
        System.out.printf("loan2    %.2f  %.2f  %.2f%n", y, y2, y3);

        System.out.println("\nMonthly payments for loan of $5000.00 and loan2 $31000.00 for 3, 5, and 6 year loans at 5% interest.");
        LoanAccount.setAnnualInterestRate(0.05);

        x =  loan1.calculateMonthlyPayment(36);
        x2 = loan1.calculateMonthlyPayment(60);
        x3 = loan1.calculateMonthlyPayment(72);
        y =  loan2.calculateMonthlyPayment(36);
        y2 = loan2.calculateMonthlyPayment(60);
        y3 = loan2.calculateMonthlyPayment(72);

        System.out.println("Loan     3 years 5 years 6 years");
        System.out.printf("loan1    %.2f  %.2f   %.2f%n", x, x2, x3);
        System.out.printf("loan2    %.2f  %.2f  %.2f", y, y2, y3);

        System.out.println();
    }
    
}
