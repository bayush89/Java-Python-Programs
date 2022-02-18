import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the string to be reversed:");
        original = in.nextLine();

        for(int i = original.length()-1; i >= 0; i--){
            reverse = reverse + original.charAt(i);
        }
        System.out.println("Reverse of the string entered is:" + "" +reverse);
    }
}
