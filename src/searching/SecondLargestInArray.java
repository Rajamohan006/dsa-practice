package searching;

import java.util.Arrays;

/**
 * Test cases:
 * Input: arr[] = [12, 35, 1, 10, 34, 1]
 * Output: 34
 * Explanation: The largest element of the array is 35 and the second largest element is 34.
 *
 * Input: arr[] = [10, 5, 10]
 * Output: 5
 * Explanation: The largest element of the array is 10 and the second largest element is 5.
 *
 * Input: arr[] = [10, 10, 10]
 * Output: -1
 * Explanation: The largest element of the array is 10 there is no second largest element.
 */
public class SecondLargestInArray {
    static int largestElement(int arr[]){
        int largest =arr[0];
        int secondLargest=0;
        for(int i=0;i < arr.length;i++){
            if(arr[i] > largest){
                secondLargest= largest;
                largest = arr[i];
            }
        }
        return secondLargest;
    }
    static int getSecondLargest(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int arr[] ={20, 10, 20, 40, 100};
        System.out.println(" the second largest element in the array: " + largestElement(arr));
        System.out.println(" the second largest element in the array: " + getSecondLargest(arr));

    }
}
