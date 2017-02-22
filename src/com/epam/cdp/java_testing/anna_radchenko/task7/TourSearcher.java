package com.epam.cdp.java_testing.anna_radchenko.task7;

/*
* The HomeTask3, task2:
* Дополнить сценарии, реализованные в домашнем задании в рамках лекции по ООП.
* Добавить чтение данных из файла / запись данных в файл, используя I/O Streams.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InputStreamTourSearcher {
    private InputStream inputstream;
    private OutputStream outputStream;
    private String /Users/Anna/Desktop/tours.docx;

    public InputOutputStreamTourSearcher(String /Users/Anna/Desktop/tours.docx) {
        this.path = /Users/Anna/Desktop/tours.docx;
    }
    public void read() throws IOException {
        inputstream = new FileInputStream(/Users/Anna/Desktop/tours.docx);

        int data = inputstream.read();
        char collectionData;
        while(data != -1) {

            collectionData = (char) data;
            System.out.print(collectionData);
            data = inputstream.read();
        }
        inputstream.close();
    }
}

public class TourSearcher {
    public static void main(String[] args) {
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
    tourList.add(new

    String("Holiday","Magic Croatia","600 Euro","10","AllInclusive","Plane"));
    tourList.add(new

    String("Sport","Skiing time in France","400 Euro","5","WithoutMeal","Bus"));
    tourList.add(new

    String("Shopping","On shopping to Milan","350 Euro","2","BreakfastOnly","Train"));
    tourList.add(new

    String("Excurtion","Weekend in the Paris","300 Euro","2","HalfBoard","Plane"));
    tourList.add(new

    String("Extreme","Amazonia cruise","1000 Euro","14","FullBoard","Ship"));
    tourList.add(new

    String("Holiday","Mallorca sun","800 Euro","7","AllInclusive","Plane"));

    Scanner in = new Scanner(System.in);
    String filterBy = in.nextLine();

    ArrayList<String> filterResult = new ArrayList<String>();
    for(tourList)

    {
        if (tourList.getType().getDuration().getTransport().getMeals().contains(filterBy))
    }
    System.out.println(filterResult);

    Collections.sort(tourList,new

    PriceComparator());
    System.out.println(tourList.getName()+tourList.getType()+tourList.getPrice()+tourList.getDurarition()+tourList.getMeals()+tourList.getTransport());

    public void write(ArrayList filterResult) throws IOException {
        outputStream = new FileOutputStream(/Users/Anna/Desktop/tours.docx);
        outputStream.write(filterResult.getBytes());
        outputStream.close();
    }
}
