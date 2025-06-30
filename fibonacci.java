import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        System.out.print("enter the limit of fibonacci series : ");
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i = 1; i <= limit; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
