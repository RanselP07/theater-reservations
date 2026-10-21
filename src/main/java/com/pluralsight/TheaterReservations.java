package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {

    static void main(String[] args) {
        LocalDate localDate;

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = myScanner.nextLine();
        String[] name = fullName.split(" ");
        String firstName = name[0];
        String lastName = name[1];

        System.out.print("What date will you be coming (MM/DD/YYYY): ");
        String dateInput = myScanner.next();
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        localDate = LocalDate.parse(dateInput, formatter);


        System.out.print("How many tickest would you like? ");
        int tickest = myScanner.nextInt();


        if (tickest > 1){
            System.out.println(tickest + " ticket reserved for " + localDate + " under " + lastName + ", " + firstName + ".");
        }
        else if (tickest == 1){
            System.out.println("1 ticket reserved for " + localDate + " under " + lastName + ", " + firstName + ".");
        } else{
            System.out.println("ERROR: you entered an invalid ticket number.");
        }
    }

}
