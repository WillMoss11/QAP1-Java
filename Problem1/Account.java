package Problem1;
//By: William Moss
//Date: 09-24-24


/*
 * I created the Account class to represent a simple bank account system.
 * It includes fields for the account ID, the account holder's name, and the balance.
 * The class provides methods to credit, debit, and transfer funds between accounts.
 */

public class Account {
      // Fields to store account information
      private String id;       // Unique identifier for the account
      private String name;     // Name of the account holder
      private int balance;     // Current balance of the account
  
      /*
       * Constructor with ID and name.
       * Since no initial balance is provided, we set the balance to 0.
       */
      public Account(String id, String name) {
          this.id = id;
          this.name = name;
          this.balance = 0; // Initialize balance to zero
      }
  
      /*
       * Constructor with ID, name, and initial balance.
       * This allows creating an account with a starting balance.
       */
      public Account(String id, String name, int balance) {
          this.id = id;
          this.name = name;
          this.balance = balance;
      }
  
      /*
       * Getter method for account ID.
       */
      public String getID() {
          return this.id;
      }
  
      /*
       * Getter method for account holder's name.
       */
      public String getName() {
          return this.name;
      }
  
      /*
       * Getter method for current balance.
       */
      public int getBalance() {
          return this.balance;
      }
  
      /*
       * Method to add money to the account.
       * It increases the balance by the specified amount.
       */
      public int credit(int amount) {
          this.balance += amount; // Add amount to balance
          return this.balance;
      }
  
      /*
       * Method to withdraw money from the account.
       * It checks if there are sufficient funds before debiting.
       * If not enough balance, it prints an error message.
       */
      public int debit(int amount) {
          if (amount <= this.balance) {
              this.balance -= amount; // Subtract amount from balance
          } else {
              System.out.println("Amount exceeded balance."); // Error message
          }
          return this.balance;
      }
  
      /*
       * Method to transfer funds to another account.
       * It debits the amount from this account and credits it to another account.
       * It checks for sufficient balance before transferring.
       */
      public int transferTo(Account another, int amount) {
          if (amount <= this.balance) {
              this.balance -= amount;   // Subtract amount from this account
              another.credit(amount);   // Add amount to the other account
          } else {
              System.out.println("Amount exceeded balance."); // Error message
          }
          return this.balance;
      }
  
      /*
       * toString method to return a string representation of the account.
       */
      public String toString() {
          return "Account[id=" + this.id + ", name=" + this.name + ", balance=" + this.balance + "]";
      }
  }

