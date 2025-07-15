package searching;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Test cases:
 * Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
 * Output: 6
 * Explanation: All the numbers from 1 to 8 are present except 6.
 *
 * Input: arr[] = [1, 2, 3, 5]
 * Output: 4
 * Explanation: Here the size of the array is 4, so the range will be [1, 5]. The missing number between 1 to 5 is 4
 */
public class FindMissingNumber {
    static int missingNumber(int arr[]){
        Arrays.sort(arr);
        for(int i =0; i <arr.length - 1;i++){
            if (arr[i + 1] != arr[i] + 1) {
                return arr[i] + 1;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int arr[] ={8, 2, 4, 5, 3, 7, 1};
        System.out.println(" the missing element in the array: " + missingNumber(arr));

    }
}
