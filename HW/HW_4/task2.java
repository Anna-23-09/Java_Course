//Реализуйте очередь с помощью LinkedList со следующими методами: 
//enqueue() - помещает элемент в конец очереди, 
//dequeue() - возвращает первый элемент из очереди и удаляет его, 
//first() - возвращает первый элемент из очереди, не удаляя.
package HW.HW_4;

import java.util.LinkedList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        LinkedList<Integer> my_list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            my_list.add(rnd.nextInt(100));
        }
        System.out.println(my_list);

        enqueue(my_list, 5);
        System.out.println("enqueue " + my_list);

        dequeue(my_list);
        System.out.println("dequeue " + my_list);

        first(my_list);
        System.out.println("first " + my_list);

    }

    private static int first(LinkedList<Integer> my_list) {
        int num = 0;
        num = my_list.get(0);
        return num;
    }

    private static int dequeue(LinkedList<Integer> my_list) {
        int num = 0;
        num = my_list.get(0);
        my_list.remove(0);
        return num;
    }

    private static void enqueue(LinkedList<Integer> my_list, int i) {
        my_list.addLast(i);
    }
    
}
