//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package HW.HW_4;

import java.util.LinkedList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        LinkedList<Integer> my_list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            my_list.add(rnd.nextInt(100));
        }
        System.out.println(my_list);  

        int temp = 0;
        while (temp != my_list.size() - 1) {
            my_list.add(my_list.size()-temp, my_list.getFirst());
            my_list.removeFirst();
            temp++;
        }
        System.out.println(my_list);
    }
}
