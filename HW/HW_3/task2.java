package HW.HW_3;

import java.util.ArrayList;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него четные числа

public class task2 {
    public static void random_list(ArrayList<Integer> list) {

        Random rnd = new Random();
        for (int i = 0; i < 15; i++) {
            list.add(rnd.nextInt(10));
        }
        System.out.println(list);
    }

    public static void del_even_numbers(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.print(list);
        random_list(list);
        del_even_numbers(list);
    }

}
