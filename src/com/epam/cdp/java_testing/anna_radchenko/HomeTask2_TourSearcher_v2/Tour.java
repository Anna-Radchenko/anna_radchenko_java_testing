package com.epam.cdp.java_testing.anna_radchenko.task4.v2;

/*
 * The HomeTask2, task1, option 8:
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного
 * типа (отдых, экскурсии, лечение,
 * шопинг, круиз и т.д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

        public class Tour {
            String name;
            double price;
            int duration;
            String startDate;
            int tourist;
            
            Tour(String name, double price, int duration, String startDate, int tourist);
            {
                this.name = name;
                this.price = price;
                this.duration = duration;
                this.startDate = startDate;
                this.tourist = tourist;    
            }
        }
    }
