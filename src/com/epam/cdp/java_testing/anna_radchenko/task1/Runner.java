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

    /**
     * Метод выводит в консоль массив целых чисел в случайном порядке от -10 до 10;
     * А затем выводит массив целых чисел в случайном порядке от -10 до 10, но при этом заменяя все нечётные числа
     * на 0.
     */

    public void execute() {
        int[] myArray = new int[21];
        for (int x = 0; x < myArray.length; x++) {
            myArray[x] = ((int) (Math.random() * 21) - 10);
            if (myArray[x] < 0) {
                myArray[x] = 0;
            }
            System.out.print(myArray[x]);
        }
    }
}
