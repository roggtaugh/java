import java.util.Scanner;
public class Num_finder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number : ");
        long num = input.nextLong();
        System.out.print("enter the number you want to count : ");
        int n = input.nextInt();
        long num1 = num;
        int count = 0;
        while(num>0){
            int temp = (int)(num % 10);
            num = num/10;
            if (temp == n){
                count++;
            }
        }
        System.out.println("the number of "+ n + " in " + num1 + " is " + count );
    }
}
