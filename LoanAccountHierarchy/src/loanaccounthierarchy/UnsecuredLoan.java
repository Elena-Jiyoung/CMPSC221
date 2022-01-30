/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccounthierarchy;

/**
 *
 * @author kinner
 */
public class UnsecuredLoan extends LoanAccount{
    public UnsecuredLoan(double principle, double annualInterestRate, int months) {
        super(principle, annualInterestRate, months);
    }

    @Override
    public String toString() {
        return "Unsecured Loan with: " + super.toString() + "\n";
    }
}
