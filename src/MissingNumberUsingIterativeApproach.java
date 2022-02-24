public class MissingNumberUsingIterativeApproach {
    static int missingNumber(int arr[], int n) {
        int total = 1;
        for(int i = 2; i <= n+1; i++) {
            total = total + i;
            total = total - arr[i-2];
        }
        return total;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6};
        System.out.println("The missing number in the array is:"+missingNumber(arr,arr.length));
    }
}
