package sem_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class task0 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(18);
        list.add(24);
        list.add(13);
        list.add(24);
        list.add(2, 321);
        int a = list.get(4);
        list.remove(2);
        list.set(2, 321);
        System.out.println(list);

        Collections.sort(list);  //сортировка по возрастанию
        list.sort(new Comparator<Integer>() {
            public int compare(Integer integer, Integer t1) {
                return 0;
            }
        }); // тоже сортировка
        System.out.println(list);

        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(2);
        // list1.add(4);

        // int i = list.indexOf(3);
        // list.size();
        // List list2 = list.subList(2, 4);

        // list.equals(5);

    }
}
