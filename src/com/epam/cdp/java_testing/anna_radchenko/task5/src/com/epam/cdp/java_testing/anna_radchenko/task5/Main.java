package com.epam.cdp.java_testing.anna_radchenko.task5;
/**
* HomeTask 2, task 2:
* Проверить скорость работы (добавление, поиск элемента, удаление) следующих коллекций:
* Lists (ArrayList vs LinkedList)
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList newArrayList = new ArrayList();
        int newValue = 7001;
        int valueRemove[] = {1};
        Random random = new Random();
        for (int i = 0; i < 7000; i++) {
            newArrayList.add(random.nextInt());
        }

        long start = System.currentTimeMillis();
        newArrayList.add(newValue);
        long finish = System.currentTimeMillis();
        long timeArrayListAdd = finish - start;
        System.out.println(timeArrayListAdd + " - timeArrayListAdd");

        long start2 = System.currentTimeMillis();
        System.out.println(newArrayList.indexOf("70001"));
        long finish2 = System.currentTimeMillis();
        long timeArrayListSearch = finish2 - start2;
        System.out.println(timeArrayListSearch + " - timeArrayListSearch");

        long start3 = System.currentTimeMillis();
        newArrayList.remove(valueRemove);
        long finish3 = System.currentTimeMillis();
        long timeArrayListRemove = finish3 - start3;
        System.out.println(timeArrayListRemove + " - timeArrayListRemove");

        LinkedList newLinkedList = new LinkedList();

        for (int i = 0; i < 7000; i++) {
            newLinkedList.add(random.nextInt());
        }

        long start4 = System.currentTimeMillis();
        newLinkedList.add(newValue);
        long finish4 = System.currentTimeMillis();
        long timeLinkedListAdd = finish4 - start4;
        System.out.println(timeLinkedListAdd + " - timeLinkedListAdd");

        long start5 = System.currentTimeMillis();
        System.out.println(newArrayList.indexOf("70001"));
        long finish5 = System.currentTimeMillis();
        long timeLinkedListSearch = finish5 - start5;
        System.out.println(timeLinkedListSearch + " - timeLinkedListSearch");

        long start6 = System.currentTimeMillis();
        newArrayList.remove(valueRemove);
        long finish6 = System.currentTimeMillis();
        long timeLinkedListRemove = finish6 - start6;
        System.out.println(timeLinkedListRemove + " - timeLinkedListRemove");
    }
}