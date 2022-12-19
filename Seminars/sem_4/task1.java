// спрашиваем юзера ФИо и возраст, можно ввести несколько человек. 
//Выводим на экран все эти данные в формате ФИО - возраст (в одной строке каждый чел)
//сортируем их по возрасту LinkedList-ом

package sem_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        ArrayList<String> list_fname = new ArrayList<>();
        ArrayList<String> list_lname = new ArrayList<>();
        ArrayList<String> list_tname = new ArrayList<>();
        ArrayList<Integer> list_age = new ArrayList<>();
        LinkedList<Integer> key = new LinkedList<>();
        
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            Scanner scanner_age = new Scanner(System.in);

            System.out.println("Введите ФИО: ");
            String fio = scanner.nextLine();
            System.out.println("Введите Ваш возраст: ");
            Integer age = scanner_age.nextInt();
            list_age.add(age);
            String[] fio1 = fio.split(" ");

            if (fio1.length == 3) {
                list_fname.add(fio1[1]);
                list_lname.add(fio1[0]);
                list_tname.add(fio1[2]);
            } else if (fio1.length == 2) {
                list_lname.add(fio1[0]);
                list_fname.add(fio1[1]);
                list_tname.add(" ");
            } else {
                list_lname.add(fio1[0]);
                list_fname.add(" ");
                list_tname.add(" ");
            }
            key.add(list_fname.size() - 1); //в ключах будет храниться просто индексы
            System.out.println("Хотите ввести следующего? Y/N");
            Scanner scanner1 = new Scanner(System.in);
            String yn = scanner1.nextLine();
            if (yn.toUpperCase().equals("N")) {
                flag = false;
            }
            int a = 0;
        }

        int cnt = key.size() - 1;
        while (cnt > -1) {
            int max_age = list_age.get(key.get(cnt));
            int index = cnt;    
            for (int i = 0; i < cnt; i++) {
                if (max_age < list_age.get(key.get(i))) {
                    max_age = list_age.get(key.get(i));
                    index = i;
                }
            }
            int tmp = key.get(cnt);
            key.set(cnt, key.get(index));
            key.set(index, tmp);
            cnt--;
        }
        
        // for (int i = 0; i < list_lname.size(); i++) {
        //     System.out.println(list_lname.get(i) + " " + list_fname.get(i) + " " + list_tname.get(i) + " " + list_age.get(key.get(cnt)));
        // }
        key.forEach(n -> System.out.println(list_fname.get(n) + " " + list_lname.get(n) + " " + list_tname.get(n) + " " + list_age.get(n)));
    }
}
