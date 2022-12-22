package sem5;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class task0 {
    public static void main(String[] args) {

        Fio fio = new Fio("Fam", "Nam", "SoNam");
        
        HashMap<Integer, String> map = new HashMap<>();

        map.clear();
        map.put(1, new Fio("Fam", "Nam", "SoNam"));
        map.put(2, "Dva");
        map.putIfAbsent(4, "Chetity");
        map.put(15, "P");
        map.put(56, "Sh");
        map.put(37, "Sem");


        String vc = map.get(1);
        map.equals(2);
        map.containsValue("One");
        map.containsKey(34);
        Set<Integer> a = map.keySet();
        Collection<String> v = map.values();
        map.replace(1, "Tri");
        map.isEmpty();
        map.remove(2);
        
        for (Integer i : map.keySet()) {
            System.out.println(map.get(i));
        }

        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(map.keySet().toArray()[i]));
        }

        LinkedHashMap<Iterator, String> LinkedMap = new LinkedHashMap<>();

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "1");
        treeMap.put(2, "2");
        treeMap.put(3, "3");
        treeMap.put(4, "4");

    }
}


class Fio {
    String f;
    String n;
    String n2;

    public Fio (String f, String n, String n2) {
        this.f = f;
        this.n = n;
        this.n2 = n2;
    }
}