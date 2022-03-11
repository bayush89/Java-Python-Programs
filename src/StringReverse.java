import java.util.Scanner;
import java.util.Stack;

public class StringReverse {
    public String reverseUsingStack(String original) {
        if(original == null || original.equals("")) {
            return original;
        }
        Stack<Character> s = new Stack<>();
        char[] ch = original.toCharArray();
        for(int i = 0; i < original.length(); i++) {
            s.push(ch[i]);
        }
        int index = 0;
        while(!s.isEmpty()) {
            ch[index++] = s.pop();
        }
        return String.copyValueOf(ch);
    }
    public String reverseUsingPlusOperator(String original) {
        if(original == null || original.equals("")) {
            return original;
        }
        String reverse = "";
        for(int i = original.length()-1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        StringReverse sr = new StringReverse();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str = in.nextLine();
        String result = sr.reverseUsingStack(str);
        System.out.println("Reverse of the string entered is: " +result);
        System.out.println("Reverse of the reverse of the string entered above is: "+sr.reverseUsingPlusOperator(result));
    }
}