package sem_6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MySet {
    private static final Object obj = new Object();
    Map<Person, Object> items = new HashMap<>();

    public boolean add(Person person) {
        return items.putIfAbsent(person, obj) == null;
        // Set<Person> s = new HashSet<>();
        // s.add(person);
    }
}
