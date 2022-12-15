import java.util.Random;

/**
 * sem_1
 */
public class sem_1 {

    public static void main(String[] args) {
        System.out.println(addTwo(19));

        char ch = 'f';
        long l = 12l;
        int i = (int) l;
        System.out.println(ch);

        int[] arrI = new int [5];
        arrI[2] = 7;

        int[] tmp = new int[arrI.length + 1];
        arrI = tmp;
        

        System.out.println(arrI[2] + " Hello " + i);

        // Integer.parseInt(s: "1234");
        // System.out.println(Long.bitCount(i: 12));

        String str = "Hello, world!";
        String st2 = "Hi!";
        String.valueOf(123.382);

        int charAt = str.charAt(6);
        System.out.println(charAt);
        boolean b = str.contains("world");
        str.equals(st2);
        System.out.println("Hi!".repeat(5));
        System.out.println(str.replace(str, "perevorot"));
        str.length();
        String str4 = "One Two Three";
        String[] sA = str4.split(" ");
        System.out.println(b);
        System.out.println(sA);

        Integer.parseInt("12");
        Integer.max(1, 5);
        Integer.toBinaryString(17);


        int r0 = (int) (Math.random()*200 - 100);
        int r1 = (int) (Math.random())*200 - 100;

        System.out.println(r0);
        System.out.println(r1);

        Random rnd = new Random();
        rnd.setSeed(73457); // при задании точно знаем первые случайные числа

        for (int j = 0; j < 10; j++) {
            System.out.println(rnd.nextInt(100));
        }      


    }
    private static int addTwo (int n) {
        return n + 2;
    }
}

/**
 * sem_1
 */
