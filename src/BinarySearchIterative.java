public class BinarySearchIterative {
    int binarySearch (int arr[], int x){
        int low = 0, high = arr.length-1;
        while (low <= high){
            int mid = low + (high-low)/2;
            if (x == arr[mid])
                return mid;
            if (x < arr[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchIterative br = new BinarySearchIterative();
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;
        int result = br.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Item does not exist in the array");
        else
            System.out.println("Item exists at index "+result);
    }
}
