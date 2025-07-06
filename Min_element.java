import java.util.Scanner;
public class Min_element {
    public static void main(String[] args) {
        System.out.println("minimum element is : " + minElement());
    }
    static int minElement(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the limit of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements of array : ");
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int p = arr[0];
        for(int i = 1; i < n; i++){
            if(p > arr[i]){
                p = arr[i];
            }
        }
        return p;
    }
}
