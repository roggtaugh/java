import java.util.Scanner;
public class Num_reverse {
    public static void main(String[] args) {
        System.out.print("enter the number : ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num = num1;
        int num2 = 0;
        while(num1 > 0 ){
            int temp = num1 % 10;
            num2 = num2 * 10 + temp;
            num1 = num1 / 10;
        }
        System.out.println("the reverse of " + num + " is " + num2);
    }
}
