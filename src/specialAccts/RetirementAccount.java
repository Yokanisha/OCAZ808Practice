package specialAccts;

import accts.SavingsAccount;

public class RetirementAccount extends SavingsAccount {
    public static void main(String[] args) {
        RetirementAccount ra = new RetirementAccount();
        ra.balance = 10;

        SavingsAccount sa = new SavingsAccount();
        //sa.balance = 10;
    }
}
