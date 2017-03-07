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
<<<<<<< HEAD:src/com/epam/cdp/java_testing/anna_radchenko/HomeTask1_task3/Runner.java
        System.out.print ("Enter one of the following operator: +, -, *, /");
=======
                System.out.print ("Enter one of the following operator: +, -, *, /");
>>>>>>> 38bcc6318dbfa97a4207de1086b8d7c5513fd4fc:src/com/epam/cdp/java_testing/anna_radchenko/task3/Runner.java
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
<<<<<<< HEAD:src/com/epam/cdp/java_testing/anna_radchenko/HomeTask1_task3/Runner.java
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


=======
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
>>>>>>> 38bcc6318dbfa97a4207de1086b8d7c5513fd4fc:src/com/epam/cdp/java_testing/anna_radchenko/task3/Runner.java
