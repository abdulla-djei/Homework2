package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String name = "Zhanyl";
        int age = generateRandomAge();//
        int tem = 20;


        if (20 < age && 45 > age && tem < 30 && tem > -20) {
            System.out.println("можно идти гулять!");
        } else  if (age < 20 && tem > 0 && 28 < tem) {
            System.out.println(" можно гулять");
        }  else  if (age > 45 && tem > -10 && 25 > tem) {
            System.out.println(" Сидите дома");
        } else
            System.out.println("**");
    }
    public static int generateRandomAge(){
        int min = 0;
        int max = 107;
        int ranAge = min + (int) (Math.random()* max);
        System.out.println(ranAge + " namber 1");

        return ranAge;

    }
}
