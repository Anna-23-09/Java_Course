// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, 
//которая состоит из чередующихся символов c1 и c2, начиная с c1.

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
try (//        String a="aaaaaaaabbbbbbccccccmmmmmcccccccd";
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите строку: ");
            String str = scanner.nextLine();
            char first = str.charAt(0);
            int count = 1;

            StringBuilder res = new StringBuilder();
            for (int i = 1; i < str.length(); i++) {
                if (first == str.charAt(i)) {
                    count++;
                } else {
                    if (count > 0)
                        res.append(first).append(count);
                    count = 1;
                    first = str.charAt(i);
                }
            }
            if (count > 0)
                res.append(first).append(count);
            else
                res.append(first);
            System.out.println(res);
        }
    }

    // public static void main(String[] args) {
    //     //        String a="aaaaaaaabbbbbbccccccmmmmmcccccccd";
    //             Scanner scanner = new Scanner(System.in);
    //             System.out.print("Введите строку: ");
    //             String str = scanner.nextLine();
    //             char first = str.charAt(0);
    //             int count = 1;
        
    //             StringBuilder res = new StringBuilder();
    //             for (int i = 1; i < str.length(); i++) {
    //                 if (first == str.charAt(i)) {
    //                     count++;
    //                 } else {
    //                     if (count > 0)
    //                         res.append(first).append(count);
    //                     count = 1;
    //                     first = str.charAt(i);
    //                 }
    //             }
    //             if (count > 0)
    //                 res.append(first).append(count);
    //             else
    //                 res.append(first);
    //             System.out.println(res);
    //         }
        
}


