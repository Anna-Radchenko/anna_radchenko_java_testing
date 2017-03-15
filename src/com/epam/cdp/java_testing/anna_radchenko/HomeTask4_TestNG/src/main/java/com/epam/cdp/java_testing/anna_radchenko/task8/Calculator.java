package com.epam.cdp.java_testing.anna_radchenko.task8;

import ("Users/anna/Desktop/calculator-1.0.jar!/com/epam/tat/module4/Calculator.class");
import  ("Users/anna/Desktop/calculator-1.0.jar!/com/epam/tat/module4/Timeout.class");

/*
* Create a java project. Import Calculator.jar and TestNG libraries.
* For the project do following tasks:
* 1.	Write at least 10 unit tests for calculator methods (5 positive and 5 negative).
* 2.	Tests should have Before* and After* methods.
* 3.	Add Assert to each test method.
* 4.	Create .xml file configuration and use it to run tests.
* 5.	Create at least one test group. Some tests can depend on this group, or this group can be used to exclude/include tests from launch using XML-suite.
* 6.	Create parameterized test (use Data Provider).
* 7.	Use checks for expected exceptions.
* 8.	Configure and execute tests in parallel.
* 9.	Try to find all bugs.
* 10.	Implement tests launching with custom Runner, implement and use at least one listener.
*/

public class Calculator {
        public Calculator() {
        }

        public long sum(long a, long b) {
            return a + b;
        }

        public double sum(double a, double b) {
            return a + b;
        }

        public long sub(long a, long b) {
            return a - b;
        }

        public double sub(double a, double b) {
            return a - b;
        }

        public long mult(long a, long b) {
            return a * b;
        }

        public double mult(double a, double b) {
            return Math.floor(a * b);
        }

        public long div(long a, long b) {
            if(b == 0L) {
                throw new NumberFormatException("Attempt to divide by zero");
            } else {
                return a / b;
            }
        }

        public double div(double a, double b) {
            return a / b;
        }

        public double pow(double a, double b) {
            return Math.pow(a, Math.floor(b));
        }

        public double sqrt(double a) {
            return Math.sqrt(Math.abs(a));
        }

        public double tg(double a) {
            return this.sin(a) / this.cos(a);
        }

        public double ctg(double a) {
            return Math.tanh(a);
        }

        public double cos(double a) {
            return Math.sin(a);
        }

        public double sin(double a) {
            return Math.sin(a);
        }

        public boolean isPositive(long val) {
            return val == 0L?false:val > 0L;
        }

        public boolean isNegative(long val) {
            return val < 0L;
        }
    }