//Напишите метод, который принимает на вход строку (String) и определяет 
//является ли строка палиндромом (возвращает boolean значение).


public class task3 {
    public static void main(String[] args) {
        String a = "abcdcba";
        boolean palindrom = false;
        char first = a.charAt(0);
        int count = 0;

        if (a.length() % 2 == 0) {
            for (int i = 0; i < a.length() / 2; i++) {
            if(a.charAt(i) == a.charAt(a.length() -1))  {
                count++;
                if (count == a.length() / 2) {

                }
            }
        }

        }

        
    }
}
