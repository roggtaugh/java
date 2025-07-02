import java.util.Scanner;
public class SwapArrayElement {
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
        int j = input.nextInt();
        int k = input.nextInt();
        System.out.println("before swap ");
        for(int i = 0; i < limit; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
        System.out.println("after swap ");
        for(int i =0; i < limit; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
