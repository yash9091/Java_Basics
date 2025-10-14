
import java.util.Scanner;

class ReverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter String to reverse"); hello 
        String sc = input.nextLine();
        System.err.println("string is :" + sc);
        String res = "";
        for (int i = sc.length() - 1; i >= 0; i--) {
            res += sc.charAt(i);

        }
        System.err.println("Reverse string is:" + res);

    }
}
