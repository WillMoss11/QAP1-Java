package Problem2;
//By: William Moss
//Date: 09-24-24
// TestDate.java
/*
 * In this TestDate class, I'm testing the functionalities of the Date class.
 * I create a Date object, display it, modify its values using setter methods,
 * and then display the updated date to verify that the setters work correctly.
 */


public class TestDate {
    public static void main(String[] args) {
        // Creating a Date object with initial values
        Date date = new Date(12, 1, 2002); // Initial date: 01/12/2002

        // Displaying the initial date using toString()
        System.out.println("Initial Date: " + date.toString());

        // Modifying the date using setter methods
        date.setDay(24);     // Changing day to 24
        date.setMonth(9);  // Changing month to September
        date.setYear(2024); // Changing year to 2024

        // Alternatively, we could use setDate() to set all at once
        // date.setDate(24, 9, 2024);

        // Displaying the updated date
        System.out.println("Updated Date: " + date.toString());
    }
}

