import java.util.Scanner;
public class Char_search {
    public static void main(String[] args) {
        System.out.println("character in string : " + charSearch());
    }
    static boolean charSearch(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = input.nextLine();
        System.out.println("enter the character you want to find : ");
        String c = input.nextLine();
        char ch = c.charAt(0);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                return true;
            }
        }
        return false;

    }
}
