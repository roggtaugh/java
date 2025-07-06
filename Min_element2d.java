import java.util.Scanner;
public class Min_element2d {
    public static void main(String[] args) {
        System.out.println("minimum element is : " + minElement());
    }
    static int minElement(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the no. of row of array : ");
        int n = input.nextInt();
        System.out.print("enter the no. of col of array : ");
        int m = input.nextInt();
        int[][] arr = new int[n][m];
        System.out.print("enter the elements of array : ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j =0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int p = arr[0][0];
        for(int i = 0; i < n; i++){
            for(int j = 1; j < m; j++){
                if(p > arr[i][j]){
                    p = arr[i][j];
                }
            }
        }
        return p;
    }
}
