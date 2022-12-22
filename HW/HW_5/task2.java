//Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на платформе)
//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
//Отсортировать по убыванию популярности.

package HW.HW_5;

import java.io.FileReader;
import java.io.FileWriter;

public class task2 {
    public static void main(String[] args) {
        try (new FileReader("\task2.txt")) {
        FileWriter writer = new FileWriter("\task2_2.txt"); 
    }
    }
    
}
