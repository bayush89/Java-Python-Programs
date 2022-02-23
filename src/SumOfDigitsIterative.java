import jdk.jshell.Snippet;

import java.util.Scanner;

public class SumOfDigitsIterative {
    static int sumOfDigits (int num){
        int sum = 0;
        while (num != 0){
            sum = sum + num%10;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Enter a number:");
        int n = in.nextInt();
        System.out.println("Sum of the digits of the number is:"+sumOfDigits(n));
    }
}
