import java.util.Scanner;
public class Binary_search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the limit of array : ");
        int limit = input.nextInt();
        int[] arr = new int[limit];
        System.out.print("enter the elements of array : ");
        for(int i = 0; i < limit; i++) {
            arr[i] = input.nextInt();
        }
        for(int i = 0; i < limit; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("enter the number you want to find : ");
        int num = input.nextInt();
        System.out.println("the number you want to find is at " + binarySearch(arr, num, limit));
    }
    static int binarySearch(int[] arr, int num, int limit){
        for(int i =0; i < limit; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
