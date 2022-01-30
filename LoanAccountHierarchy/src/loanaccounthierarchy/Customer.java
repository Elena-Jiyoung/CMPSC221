/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loanaccounthierarchy;

import java.util.ArrayList;

/**
 *
 * @author kinner
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String SSN;
    private ArrayList<LoanAccount> loanAccounts;

    public Customer(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        loanAccounts = new ArrayList<LoanAccount>();
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSSN() {
        return SSN;
    }

    public void addLoanAccount(LoanAccount account) {
        loanAccounts.add(account);
    }

    public String printMonthlyReport() {
        String retString = "Account Report for Customer: " + firstName + " " + lastName + " with SSN " + SSN + "\n\n";
        for (LoanAccount account : loanAccounts) {
            retString += account.toString();
        }
        return retString;
    }
}
