package org.example;

public class TimeConversion {
    public static String timeConversion(String s) {
        if(s.contains("AM")) {
            if(s.substring(0,2).equals("12")) {
                return "00" + s.substring(2,8);
            }
            return s.substring(0,8);
        } else {
            if(s.substring(0,2).equals("12")) {
                return s.substring(0,8);
            }
            int hour = Integer.parseInt(s.substring(0,2)) + 12;
            return hour + s.substring(2,8);
        }

    }
}
