import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class sem_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2, 321);
        
        int a = list.get(4);
        list.remove(2);
        list.set(2, 372);
        System.out.println(a);


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);

        int i = list.indexOf(3);

        //list.clear();
        list.size();

        List list2 = list.subList(2, 4);
        list.equals(5);
        // list.retainAll(list2);       

        // for (int j = 0; j < list.size(); j++) {
        //     System.out.println(list.get(j));
        //     list.remove(j);
        // }

        // for (int in: list) {
        //     System.out.println(in);
        // }

        // ListIterator<Integer> iterator = list.listIterator();
        // while (iterator.hasNext()) {
        //     int it = iterator.next();
        //     iterator.remove();
        // }

        list.forEach(n -> System.out.println(n));
    }
}
