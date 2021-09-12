package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        final double taxRate = 0.055f;
        final String Wisconsin = "WI";

        System.out.println("What is the order amount? ");
        double amount = sc.nextDouble();

        System.out.println("What is the state? ");
        String state = sc.next();

        double total = amount;

        if (state.compareTo(Wisconsin) == 0)
        {
            //calculate
            double tax = amount * taxRate;
            total = amount + tax;

            //output
            System.out.printf("The subtotal is $%.2f\nThe tax is $%.2f\n", amount, tax);
        }

        //output
        System.out.printf("The total is $%.2f", total );
    }
}
