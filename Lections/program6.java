package Lections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        System.out.println("Температура воздуха сегодня: " + temp + " градусов.");

        Worker w1 = new Worker();
        w1.firstname = "Name_1";
        w1.lastname = "LName_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.firstname = "Name_1";
        w4.lastname = "LName_1";
        w4.salary = 100;
        w4.id = 1000;

        Worker w2 = new Worker();
        w2.firstname = "Name_2";
        w2.lastname = "LName_2";
        w2.salary = 200;
        w2.id = 2000;

        Worker w3 = new Worker();
        w3.firstname = "Name_3";
        w3.lastname = "LName_3";
        w3.salary = 300;
        w3.id = 3000;

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4); //здесь выводятся не данные, а их хэши

        // System.out.println(w1.toString());

        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));

        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));
    }
}
