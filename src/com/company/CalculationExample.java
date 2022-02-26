package com.company;

import java.util.Scanner;

public class CalculationExample {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = scanner.nextDouble();
        System.out.println("Enter y: ");
        double y = scanner.nextDouble();

        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);
    }
    public void calculate(double x, double y) {
        double a = x + y;
        double b = x - y;
        double c = x * y;
        double d = x / y;

        try {
            System.out.println("Addition x + y = " + a);
            System.out.println("Subtraction x - y = " + b);
            System.out.println("Multiplication x * y = " + c);
            System.out.println("Division x / y = " + d);
        }
        catch (Exception e) {
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
