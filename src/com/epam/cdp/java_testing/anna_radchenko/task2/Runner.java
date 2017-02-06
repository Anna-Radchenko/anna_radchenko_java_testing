package com.epam.cdp.java_testing.anna_radchenko.task2;

/**
 * Task 2, option 1 created by Anna Radchenko on 02.02.2017.
 *  "Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину."
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Runner {

    public static void main(String... args) {
        Runner runner = new Runner();
        runner.execute();
    }

    public void execute() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        ArrayList<String> k = new ArrayList<String>();
        boolean confirmation;
        do {
            System.out.print("Would you like to continue input? Enter true/false");
            confirmation = in.nextBoolean();
            if (confirmation) {
                k.add(reader.readLine());
            }
            else {
                String max = k.get(0);
                for (int i = 1; i < k.size(); i++) {
                    if (k.get(i).length() > max.length()) {
                        max = k.get(i);
                    }
                }

                for (int i = 0; i < k.size(); i++) {
                    if (max.length() == k.get(i).length())
                        System.out.println(k.get(i));
                        System.out.print (k.get(i).length());
                }
            }
        } while (confirmation == false);
    }
}

