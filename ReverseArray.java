import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the limit of array : ");
        int limit = input.nextInt();
        int[] arr = new int[limit];
        System.out.print("enter the elements of array : ");
        for(int i = 0; i < limit; i++){
            arr[i] = input.nextInt();
        }
        System.out.print("enter the indices to swap : ");
        int j = 0;
        int k = limit - 1;
        System.out.println("before revers ");
        for(int i = 0; i < limit; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        while(j < k){
            int temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
            j++;
            k--;
        }
        System.out.println("after reverse ");
        for(int i =0; i < limit; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
