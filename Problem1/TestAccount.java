package Problem1;
//By: William Moss
//Date: 09-24-24

/*
 * In this TestAccount class, I create two account instance
 * Perform a transfer operation between them.
 * This helps to verify that the credit, debit, and transfer methods are working correctly.
 */

public class TestAccount {
    public static void main(String[] args) {
        // Creating two accounts with initial balances
        Account acc1 = new Account("Debit", "Jacob Smith", 5000);   // Account with $5000 balance
        Account acc2 = new Account("Credit", "Alexa Joseph", 4000); // Account with $4000 balance

        // Displaying initial balances
        System.out.println("Initial Balances:");
        System.out.println(acc1.getName() + " (" + acc1.getID() + "): $" + acc1.getBalance());
        System.out.println(acc2.getName() + " (" + acc2.getID() + "): $" + acc2.getBalance());

        // Transferring $1000 from acc1 to acc2
        System.out.println("\nTransferring $1000 from " + acc1.getName() + " to " + acc2.getName() + "...");
        acc1.transferTo(acc2, 1000); // Performing the transfer

        // Displaying updated balances after the transfer
        System.out.println("\nUpdated Balances:");
        System.out.println(acc1.getName() + " (" + acc1.getID() + "): $" + acc1.getBalance()); // Should be $4000
        System.out.println(acc2.getName() + " (" + acc2.getID() + "): $" + acc2.getBalance()); // Should be $5000
    }
}

