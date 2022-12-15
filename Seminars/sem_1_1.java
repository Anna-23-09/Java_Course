import java.util.Random;

public class sem_1_1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int n = rnd.nextInt(10);

            if (n > 7) {
                System.out.println("Number " + n + " > 7");
            } else if (n < 7) {
                System.out.println("Number " + n + " < 7");
            } else {
                System.out.println("Number " + n + " = 7");
            }
        }
    }
}
