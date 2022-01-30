/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loanaccounthierarchy;

/**
 *
 * @author kinner
 */
public class LoanAccount {
    private double annualInterestRate;
    private double principle;
    private int months;
    
    public LoanAccount(double principle, double annualInterestRate, int months) {
        this.annualInterestRate = annualInterestRate;
        this.principle = principle;
        this.months = months;
    }

    public double calculateMonthlyPayment() {
        double monthlyInterest = (annualInterestRate / 100.0) / 12.0;
        return Math.round(monthlyInterest * principle / (1 - Math.pow(monthlyInterest + 1, months * -1)) * 100) / 100.0;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public double getPrinciple() {
        return this.principle;
    }

    public int getMonths() {
        return months;
    }

    @Override
    public String toString() {
        return "\nPrinciple: $" + String.format("%.2f", principle) +
               "\nAnnual Interest Rate: " + String.format("%.2f", annualInterestRate) + "%" +
               "\nTerm of Loan in Months: " + months +
               "\nMonthly Payment: $" + calculateMonthlyPayment();
    }
}
