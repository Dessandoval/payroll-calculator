package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Create a Java application named payroll-calculator that prompts the user to enter:
        //− Ask their name
        System.out.print("Enter your name: ");
        String employeeName = scanner.nextLine();

        //− their hours worked (a floating point number)
        System.out.print("Enter your hours worked: ");
        float hoursWorked = scanner.nextFloat();

        //− their pay rate (a floating point number)
        System.out.print("Enter your pay rate: ");
        float payRate = scanner.nextFloat();

        //Calculate their gross pay.
        float grossPay = hoursWorked * payRate;

        //Display the employee's name and their gross pay
        System.out.println("Hi " + employeeName + " your gross pay is " + grossPay);


    }

}
