package Problem2;
//By: William Moss
//Date: 09-24-24

/*
 * I created the Date class to represent a simple date system.
 * It includes fields for the day, month, and year.
 * The class provides getter and setter methods to manipulate the date,
 * and overrides the toString() method to display the date in the format dd/mm/yyyy.
 */


public class Date {
        // Fields to store the date components
        private int day;
        private int month;
        private int year;
    
        /*
         * Constructor that initializes the date with provided day, month, and year.
         * This allows setting the date at the time of object creation.
         */
        public Date(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    
        /*
         * Getter method for day.
         * Returns the day component of the date.
         */
        public int getDay() {
            return this.day;
        }
    
        /*
         * Getter method for month.
         * Returns the month component of the date.
         */
        public int getMonth() {
            return this.month;
        }
    
        /*
         * Getter method for year.
         * Returns the year component of the date.
         */
        public int getYear() {
            return this.year;
        }
    
        /*
         * Setter method for day.
         * Allows updating the day component of the date.
         */
        public void setDay(int day) {
            this.day = day;
        }
    
        /*
         * Setter method for month.
         * Allows updating the month component of the date.
         */
        public void setMonth(int month) {
            this.month = month;
        }
    
        /*
         * Setter method for year.
         * Allows updating the year component of the date.
         */
        public void setYear(int year) {
            this.year = year;
        }
    
        /*
         * Method to set day, month, and year at once.
         * This is useful for updating the entire date in one method call.
         */
        public void setDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    
        /*
         * toString method to return the date in dd/mm/yyyy format.
         * If day or month is a single digit, it adds a leading zero to maintain the format.
         */
        public String toString() {
            // Adding leading zeros if necessary
            String dd = (day < 10) ? "0" + day : Integer.toString(day);
            String mm = (month < 10) ? "0" + month : Integer.toString(month);
            return dd + "/" + mm + "/" + year;
        }
    }

