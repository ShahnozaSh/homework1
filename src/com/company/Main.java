package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        work(10,34);
    }
        public static void work (int age, int temperature) {
            System.out.println("возраст" + " " + age + " " + " температура" + temperature);
            boolean isRainy = true;
            if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
                System.out.println("ьщжно идти гулять");
            } else if (age > 20 && temperature >= 0 && temperature <= 28) {
                System.out.println("можно идти гулять");
            } else if (age > 45 && temperature >= -10 && temperature <= 25) {
                System.out.println("можно идти гулять");
            } else {
                System.out.println(" оставайтесь дома");
            }
        }

}
