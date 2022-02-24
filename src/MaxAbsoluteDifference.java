import java.util.Scanner;

public class MaxAbsoluteDifference {
    static int maxABSDifference(int arr[], int n) {
        int minE = arr[0];
        int maxE = arr[0];
        for(int i = 1; i < n; i++) {
            minE = Math.min(minE, arr[i]);
            maxE = Math.max(maxE, arr[i]);
        }
        return (maxE - minE);
    }
    public static void main(String[] args) {
        //int arr[] = {-10, 4, -9, -5};
        //int n = arr.length;
        //System.out.println("Absolute difference between the max and min elements of the array is:"+maxABSDifference(arr,n));
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in your array:");
        int length = in.nextInt();
        int[] arr = new int[10];
        System.out.println("Enter the elements of your array:");
        for(int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }
        int n = arr.length;
        System.out.println("Absolute difference between the max and min elements of the array is:"+maxABSDifference(arr,n));
    }
}
