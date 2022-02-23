import java.util.Scanner;

public class SumOfDigitsRecursive {
    static int sumOfDigits (int num){
        if (num == 0)
            return 0;
        else
            return (num%10) + sumOfDigits(num/10);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Enter a number:");
        int n = in.nextInt();
        System.out.println("Sum of the digits of the number is:"+sumOfDigits(n));
    }
}
