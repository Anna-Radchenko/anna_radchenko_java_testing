package com.epam.cdp.java_testing.anna_radchenko.task6;

/*
* Для объектной модели, реализованной в домашнем задании в рамках лекции по ООП реализовать классы пользовательских исключений и организовать обработку возможных исключительных ситуаций,
* например, если элемент отсутствует в коллекции, если мы не можем удалить текущий элемент и т.д.
* Комментарии оставлять в классах исключений. Создать минимум 3 пользовательских исключения и использовать минимум 5 встроенных исключений.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
* Встроенное исключение запрещенного доступа к классу.
*/

public class TourSearcher {
    public static void main(String[] args) {
        try {
            private int duration;
            private String meals;
            private String transport;

            static public enum meals {
                WithoutMeal, BreakfastOnly, HalfBoard, FullBoard, AllInclusive
            }

            static public enum transport {
                Bus, Train, Ship, Plane
            }
            static public enum duration {
            2, 5, 7, 10, 14
            }

        catch (IllegalAccessException) {
                System.out.println("Illegal access");
            }
        }
    }

    public class Tour extends TourSearcher {
        public String type;
        public String name;
        public String price;

        static public enum type {
            Shopping, Holiday, Excurtion, Sport, Extreme
        }

        ArrayList<String> tourList = new ArrayList<String>();

    /*
    * Встроенное исключение добавления в коллекцию данных несуществующего типа.
    */

   try

        {
            tourList.add(new String("Holiday", "Magic Croatia", "600 Euro", "10", "AllInclusive", "Plane"));
            tourList.add(new String("Sport", "Skiing time in France", "400 Euro", "5", "WithoutMeal", "Bus"));
            tourList.add(new String("Shopping", "On shopping to Milan", "350 Euro", "2", "BreakfastOnly", "Train"));
            tourList.add(new String("Excurtion", "Weekend in the Paris", "300 Euro", "2", "HalfBoard", "Plane"));
            tourList.add(new String("Extreme", "Amazonia cruise", "1000 Euro", "14", "FullBoard", "Ship"));
            tourList.add(new String("Holiday", "Mallorca sun", "800 Euro", "7", "AllInclusive", "Plane"));

       catch(EnumConstantNotPresentException)
                {
                        System.out.println("Added type is not defined");
        }
        }

        Scanner in = new Scanner(System.in);



    /*
    * Пользовательское исключение ввода пустой строки, так как вводные данные будут использоваться при дальнейшем поиске в коллекции
    * и встроенное исключение ввода в консоль данных другого типа (не String).
    */

        class filterException extends Exception {
            public filterException(String text) {
                super(text);
            }

            public filterException(String text, Exception innerEx) {
                super(text, innerEx);
            }
        }

    try

        {
            String filterBy = in.nextLine() throws filterException;
        catch(ArrayStoreException)
                {
                        System.out.println("String is valid input!");
        }

            {
                if (filterBy == null) throw new filterException("String can not be empty");
            }
        }

        ArrayList<String> filterResult = new ArrayList<String>();

    for(tourList)

        {
            if (tourList.getType().getDuration().getTransport().getMeals().contains(filterBy))
                System.out.println(filterResult);
        }


    Collections.sort(tourList,new PriceComparator());
    System.out.println(tourList.getName()+tourList.getType()+tourList.getPrice()+tourList.getDurarition()+tourList.getMeals()+tourList.getTransport());
    }