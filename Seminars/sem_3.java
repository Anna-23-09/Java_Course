import java.until.Collections;
import java.util.ArrayList;
import java.util.List;

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
        System.out.println(list1);
        int i = list.indexOf(3);
        list.clear();
    }
}
