import java.io.File;

//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
//который запишет эту строку в простой текстовый файл, обработайте исключения.

public class task4 {
    public static void main(String[] args) {
        StringBuilder my_str = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            my_str.append("TEST");
        }
         
    }

    public static void writing (String[] args) {
        File logg = new File(D:\Аня\Geek Brains\Java\Seminars\sem_2\logg.txt);
        
    }
}

package sm_02;

import java.io.File;
import java.io.FileWriter;

public class Task04 {
    public static String Test100() {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < 100; i++) {
            stringBuilder.append("Test");
        }
        return stringBuilder.toString();
    }

    public static void WriteStringToFile(String s, String filepath) throws Exception {
        File f = new File(filepath);
        FileWriter fw = new FileWriter(f);
        fw.write(s);
        fw.flush();
        fw.close();
    }

    public static void main(String[] args) {
        try {
            WriteStringToFile(Test100(), "result.txt");
        } catch (Exception e) {
            System.out.printf("Exception: %s", e);
        }
    }
}

