package searching.linearSearching.easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Test Cases:
 * Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
 * Output: 5
 * Explanation: 5 is the first element that repeats
 *
 * Input: arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}
 * Output: 6
 * Explanation: 6 is the first element that repeats
 */
public class FirstRepeatingNumber {
    static int firstRepeatNumber(int[] arr){
        Arrays.sort(arr);
        for(int i = 0;i<arr.length -1;i++){
            if(arr[i] == arr[i+1])
                return arr[i];
        }
        return -1;
    }
    static int firstRepeatingElement(int[] arr) {
        HashSet<Integer> s = new HashSet<>();

        // If an element is already present, return it
        // else insert it
        int minEle = Integer.MAX_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (s.contains(arr[i])) {
                minEle = Math.min(minEle, i);
            }
            s.add(arr[i]);
        }

        // If no element repeats
        return minEle == Integer.MAX_VALUE ? -1 : minEle;
    }
    static int firstRepeatingElement(int[] arr, int n) {
        // Nested loop to check for repeating elements
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If a repeating element is found, return its index
                if (arr[i] == arr[j]) {
                    return i;
                }
            }
        }
        // If no repeating element is found, return -1
        return -1;
    }
    public static void main(String [] args){
        int[] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        System.out.println(firstRepeatNumber(arr));

    }
}
