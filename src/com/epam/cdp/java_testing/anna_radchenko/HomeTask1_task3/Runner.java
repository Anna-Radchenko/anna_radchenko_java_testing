package com.epam.cdp.java_testing.anna_radchenko.task3;

import java.util.Scanner;
import java.io.IOException;

class Runner {
    
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.execute();
    }
    
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.print ("Enter the first number");
        float a = in.nextInt();
        System.out.print ("Enter one of the following operator: +, -, *, /");
        String operator = in.next();
        System.out.print ("Enter the second number");
        float b = in.nextInt();
        float result;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if(b == 0) {
                    throw new NumberFormatException("It is not allowed to divide by zero");
                }
                else {
                    result = a / b;
                }
                break;
        }
        System.out.print (result);
    }
}


