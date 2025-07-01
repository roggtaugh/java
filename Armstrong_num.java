import java.util.Scanner;
//import java.lang.Math;
public class Armstrong_num {
    public static void main(String[] args) {
        System.out.print("enter a number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.print(armstrong(num));
    }
    static boolean armstrong(int n){
        int temp = n;
        int count = 0;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        temp = n;
        int f = 0;
        int t;
        while(temp>0){
            t = temp%10;
            f = f + (int) Math.pow(t,count);
            temp = temp/10;
        }
        return f==n;
    }
}
