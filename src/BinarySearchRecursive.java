public class BinarySearchRecursive {
    int binarySearch(int arr[], int low, int high, int x){
        while (low <= high){
            int mid = low + (high-low)/2;
            if (x == arr[mid])
                return mid;
            if (x < arr[mid])
                return binarySearch(arr, low, mid-1, x);
            else
                if(x > arr[mid])
                    return binarySearch(arr, mid+1, high, x);
        }
        return -1;
    }

    public static void main (String[] args){
        BinarySearchRecursive br = new BinarySearchRecursive();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = br.binarySearch(arr, 0, n-1, x);
        if (result == -1)
            System.out.println("Item does not exist in the array");
        else
            System.out.println("Item exists at index "+result);
    }
}
