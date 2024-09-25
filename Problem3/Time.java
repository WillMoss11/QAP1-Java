package Problem3;
//By: William Moss
//Date: 09-24-24
// Time.java
/*
 * I created the Time class to represent a simple time system.
 * It includes fields for hour, minute, and second.*/


public class Time {
        // Fields to store the time components
        private int hour;
        private int minute;
        private int second;
    
        /*
         * Constructor that initializes the time with provided hour, minute, and second.
         * This allows setting the time at the time of object creation.
         */
        public Time(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    
        /*
         * Getter method for hour.
         * Returns the hour component of the time.
         */
        public int getHour() {
            return this.hour;
        }
    
        /*
         * Getter method for minute.
         * Returns the minute component of the time.
         */
        public int getMinute() {
            return this.minute;
        }
    
        /*
         * Getter method for second.
         * Returns the second component of the time.
         */
        public int getSecond() {
            return this.second;
        }
    
        /*
         * Setter method for hour.
         * Allows updating the hour component of the time.
         */
        public void setHour(int hour) {
            this.hour = hour;
        }
    
        /*
         * Setter method for minute.
         * Allows updating the minute component of the time.
         */
        public void setMinute(int minute) {
            this.minute = minute;
        }
    
        /*
         * Setter method for second.
         * Allows updating the second component of the time.
         */
        public void setSecond(int second) {
            this.second = second;
        }
    
        /*
         * Method to set hour, minute, and second at once.
         * This is useful for updating the entire time in one method call.
         */
        public void setTime(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    
        /*
         * toString method to return the time in hh:mm:ss format.
         * If hour, minute, or second is a single digit, it adds a leading zero to maintain the format.
         */
        public String toString() {
            // Adding leading zeros if necessary
            String hh = (hour < 10) ? "0" + hour : Integer.toString(hour);
            String mm = (minute < 10) ? "0" + minute : Integer.toString(minute);
            String ss = (second < 10) ? "0" + second : Integer.toString(second);
            return hh + ":" + mm + ":" + ss;
        }
    
        /*
         * Method to advance the time by one second.
         * It handles the increment and resets seconds, minutes, and hours as needed.
         * Returns the current Time object to allow method chaining if desired.
         */
        public Time nextSecond() {
            second++; // Increment second by one
            if (second >= 60) { // Check if seconds roll over
                second = 0;
                minute++; // Increment minute
                if (minute >= 60) { // Check if minutes roll over
                    minute = 0;
                    hour++; // Increment hour
                    if (hour >= 24) { // Check if hours roll over
                        hour = 0;
                    }
                }
            }
            return this;
        }
    
        /*
         * Method to move the time back by one second.
         * It handles the decrement and resets seconds, minutes, and hours as needed.
         * Returns the current Time object to allow method chaining if desired.
         */
        public Time previousSecond() {
            second--; // Decrement second by one
            if (second < 0) { // Check if seconds roll under
                second = 59;
                minute--; // Decrement minute
                if (minute < 0) { // Check if minutes roll under
                    minute = 59;
                    hour--; // Decrement hour
                    if (hour < 0) { // Check if hours roll under
                        hour = 23;
                    }
                }
            }
            return this;
        }
    }

