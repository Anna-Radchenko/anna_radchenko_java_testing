package com.epam.cdp.java_testing.anna_radchenko.task1;

/**
 * The task 1, option 7 was created by Anna Radchenko on 31.01.2017.
 * В массиве целых чисел заменить все нечётные числа на 0.
 */

class Runner {

    public static void main(String... args) {
        Runner runner = new Runner();
        runner.execute();
    }
    public void execute() {

        int[] myArray = new int[21];

        for (int x = 0; x < myArray.length; x++) {

            myArray[x] = ((int) (Math.random() * 21) - 10);

            System.out.print(myArray[x]);
        }
        for (int x = 0; x < myArray.length; x++) {

            if (myArray[x] < 0) {
                myArray[x] = 0;
            } else if (myArray[x] >= 0) {
                myArray[x] = myArray[x];
            }

            System.out.print(myArray[x]);
        }
    }
}
