/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccounthierarchy;

/**
 *
 * @author kinner
 */
public class PrimaryMortgage extends LoanAccount{
    private double PMIMonthlyAmount;
    private Address address;

    public PrimaryMortgage(double principle, double annualInterestRate, int months, double PMIMonthlyAmount, Address address) {
        super(principle, annualInterestRate, months);
        this.PMIMonthlyAmount = PMIMonthlyAmount;
        this.address = address;
    }

    @Override
    public String toString() {  
        return "Primary Mortgage Loan with:" + super.toString() + 
             "\nPMI Monthly Amount: $" + String.format("%.2f", PMIMonthlyAmount) + 
             "\nProperty Address:" + address.toString() + "\n";
    }
}
