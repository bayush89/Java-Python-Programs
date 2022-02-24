import java.util.Scanner;

public class StringLength {
    public static int findLength(String str) {
        char[] ch = str.toCharArray();
        int count = 0;
        for (char c: ch){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine();
        System.out.println("Length of the given string is: " +findLength(s));
    }
}
