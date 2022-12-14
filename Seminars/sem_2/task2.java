//Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.

public class task2 {
    public static void main(String[] args) {
        String a="aaaaaaaabbbbbbccccccmmmmmcccccccd";
        char first = a.charAt(0);
        int count = 1;

        StringBuilder res = new StringBuilder();
        for (int i = 1; i <a.length(); i++) {
            if(first == a.charAt(i)){
                count++;
            }
            else{
                if (count > 0)
                    res.append(first).append(count);
                count = 1;
                first = a.charAt(i);
            }
        }
        if (count > 0)
            res.append(first).append(count);
        else
            res.append(first);
        System.out.println(res);
    }

}
