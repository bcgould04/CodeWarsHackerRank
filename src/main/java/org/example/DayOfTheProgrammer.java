package org.example;

public class DayOfTheProgrammer {

    public static String dayOfProgrammer(int year) {
        String date = "";
        if(year < 1918) {
            date += (year % 4 == 0) ? "12.09." : "13.09.";
        } else if(year == 1918) {
            date += "26.09.";
        } else {
            date += ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))? "12.09." : "13.09.";
        }
        return date + year;

    }
}
