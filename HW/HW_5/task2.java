// Пусть дан список сотрудников: 
// Иван, Пётр, Антон и так далее. 
// Написать программу, которая найдет и выведет повторяющиеся имена 
// с количеством повторений. 
// Отсортировать по убыванию популярности.package HW.HW_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class task2 {

    public static void main(String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new FileReader("HW_5/task2.txt"))) {
            BufferedWriter fw = new BufferedWriter(new FileWriter("HW_5/task2_2.txt"));
            List<String> lineName = new ArrayList();
            String line;
            while ((line = br.readLine()) != null) {
                lineName.add(line);
            }
            fw.write("всего людей - ");
            fw.write(lineName.size() + "\n");
            Set<String> uniqueName = new HashSet<String>(lineName);
            fw.write("всего имен - ");
            fw.write(uniqueName.size() + "\n\n");

            List<String> numEqualName = new ArrayList<>();
            for (String temp : uniqueName) {
                int count = 0;
                for (String temp2 : lineName) {
                    if (temp.equals(temp2)) {
                        count++;
                    }
                }
                numEqualName.add(count + " - " + temp + "\n");
                numEqualName.sort(null);
                Collections.reverse(numEqualName);
            }
            for (String name : numEqualName) {
                fw.write(name);
            }
            fw.close();

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}