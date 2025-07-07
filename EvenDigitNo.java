import java.util.Scanner;
public class EvenDigitNo {
    public static void main(String[] args) {
        System.out.println("the no of even digit numbers are : " + evenDigitCount());
    }
    static int evenDigitCount(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the limit of array : ");
        int limit = input.nextInt();
        System.out.println("enter the elements of array : ");
        int[] arr =new int[limit];
        for(int i = 0; i < limit; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0; i < limit; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int count2 = 0;

        for(int i = 0; i < limit; i++){
            int temp = Math.abs(arr[i]);
            int count = 0;

            if (temp == 0) {
                count = 1;
            } else {
                while(temp > 0){
                    temp = temp / 10;
                    count++;
                }
            }

            if(count % 2 == 0){
                count2++;
            }
        }
        return count2;
    }
}
