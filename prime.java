import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = input.nextInt();
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int n){
        int count = 0;
        for(int i = 2; i < n; i++){
            if(n%i==0){
                count++;
            }
        }
        return count == 0;
    }
}
