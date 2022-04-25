package com.company;

public class Date {
    int day=25;
    String month="April";
    int year=2022;
    public static void main(String[] args){
        Date d = new Date();
        Date m = new Date();
        Date y = new Date();
        System.out.println("The date today is" + " " + d.day+"/" +m.month+"/"+y.year+ ".");
    }
}
