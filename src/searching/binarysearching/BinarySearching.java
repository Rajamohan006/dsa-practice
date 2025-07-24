package searching.binarysearching;

/**
 * Binary Search Algorithm is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half.
 * The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(log N).
 *
 * To apply Binary Search algorithm:
 *
 * The data structure must be sorted.
 * Access to any element of the data structure should take constant time.
 *
 * The Binary Search Algorithm can be implemented in the following two ways
 *
 * Iterative Binary Search Algorithm
 * Recursive Binary Search Algorithm
 */
public class BinarySearching {
    //Iterative Binary Search Algorithm
   // Here we use a while loop to continue the process of comparing the key and splitting the search space in two halves.
    int binarySearch(int arr[], int x){
        int low=0, high= arr.length -1;
        while (low <= high){
            int mid = (low + high)/2;
            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;
            // If x greater, ignore left half
            if (arr[mid] < x)
                low = mid + 1;

                // If x is smaller, ignore right half
            else
                high = mid - 1;
        }
        // not present
        return -1;
    }
    int binarySearch1(int arr[], int low, int high, int x)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch1(arr, low, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch1(arr, mid + 1, high, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
    // Driver code
    public static void main(String args[])
    {
        BinarySearching ob = new BinarySearching();
        int arr[] = { 2, 3, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);

        int result1 = ob.binarySearch1(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println(
                    "Element is present at index " + result1);
    }
}
