public class task3 {
    
    public static void main(String[] args) {
        double a;
        double b;
        double res;
        char act;

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число a: ");
        a = scan.nextDouble();
        
        System.out.print("Введите действие: ");
        act = scan.next().charAt(0);
        
        System.out.print("Введите число b: ");
        b = scan.nextDouble();

        switch(act) {
            case '+': res = a + b;
               break;
            case '-': res = a - b;
               break;
            case '*': res = a * b;
               break;
            case '/': res = a / b;
               break;
            default:  System.out.printf("Error! Enter correct operator");
               return;
         }

         System.out.println(res);
    }
}
