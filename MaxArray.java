import java.util.Scanner;
public class MaxArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the array limit : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array : ");
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int p = arr[0];
        for (int i = 1;i < n ; i++ ){
            if (arr[0]<arr[i]){
                p = arr[i];
                arr[0] = arr[i];
            }
        }
        System.out.println("the maximum element of the array is : " + p);
    }

}
