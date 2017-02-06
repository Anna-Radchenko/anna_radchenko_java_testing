package com.epam.cdp.java_testing.anna_radchenko.task3;

import java.util.Scanner;

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
        String k = in.next();
        System.out.print ("Enter the second number");
        float b = in.nextInt();
        switch (k) {
            case "+":
                System.out.print ("a + b = " + (a + b) );
                break;
            case "-":
                System.out.print ("a - b = " + (a - b) );
                break;
            case "*":
                System.out.print ("a * b = " + (a * b) );
                break;
            case "/":
                System.out.print ("a / b = " + (a / b) );
                break;
            }
        }

    }


