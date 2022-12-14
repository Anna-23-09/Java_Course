package HW.HW_2;

import java.io.*;

public class task1 {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("HW_2/file_text.txt")) {
            StringBuilder str = new StringBuilder();
            int i;
            while ((i = fr.read()) != -1) {
                str.append((char) i);
            }
            str.delete(54, 72);
            str.deleteCharAt(1)
                    .deleteCharAt(5)
                    .deleteCharAt(16)
                    .deleteCharAt(23)
                    .deleteCharAt(34)
                    .deleteCharAt(38);
            String upgradeText = str.toString();

            upgradeText = upgradeText.replaceAll(",", "")
                    .replace("{", "")
                    .replace("}", "")
                    .replace(" ", " AND ")
                    .replace(":", " = ")
                    .replace(" \"age\" = \"null\"", "");
            try (FileWriter fw = new FileWriter("TASK_1/new_file_text.txt", false)) {
                fw.write("SELECT * FROM students WHERE " + upgradeText + ";");
            }
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
}
