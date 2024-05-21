import java.util.*;
public class Swap{
  public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number 1 : ");
        int a=sc.nextInt();
        System.out.println("enter the number 2 : ");
        int b=sc.nextInt();
        int c =a;
        a=b;
        b=c;
        System.out.println("after swapping number 1 is :"+a+" and number 2 is :"+b);
}
}
