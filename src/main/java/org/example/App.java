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

        final float taxRate = 0.055f;
        final String Wisconsin = "WI";

        System.out.println("What is the order amount? ");
        double amount = sc.nextDouble();
        //float amount = Float.parseFloat(amountS);

        System.out.println("What is the state? ");
        String state = sc.next();

        //rounding to 2 decimal places
        amount = Math.round(amount * 100.0) / 100.0;

        //saving the short output for when not Wisconsin
        String output = "The total is $" + amount;

        if (state.equalsIgnoreCase(Wisconsin))
        {
            //calculate
            double tax = amount * taxRate;
            double total = amount + tax;

            //rounding to 2 decimal places

            tax = Math.round(tax * 100.0) / 100.0;
            total = Math.round(total * 100.0) / 100.0;

            //output
            output = "The subtotal is $" + amount + "\nThe tax is $" + tax + "\nThe total is $" + total;
        }

        //output
        System.out.print(output);
    }
}
