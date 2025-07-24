package searching.linearSearching.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * 3 Sum - Find All Triplets with Zero Sum
 * Given an array arr[], the task is to find all possible indices {i, j, k} of triplet {arr[i],
 * arr[j], arr[k]} such that their sum is equal to zero and all indices in a triplet should be
 * distinct (i != j, j != k, k != i). We need to return indices of a triplet in sorted order, i.e., i < j < k.
 *
 * Examples :
 *
 * Input: arr[] = {0, -1, 2, -3, 1}
 * Output: {{0, 1, 4}, {2, 3, 4}}
 * Explanation:  Two triplets with sum 0 are:
 * arr[0] + arr[1] + arr[4] = 0 + (-1) + 1 = 0
 * arr[2] + arr[3] + arr[4] = 2 + (-3) + 1 = 0
 *
 * Input: arr[] = {1, -2, 1, 0, 5}
 * Output: {{0, 1, 2}}
 * Explanation: Only triplet which satisfies the condition is arr[0] + arr[1] + arr[2] = 1 + (-2) + 1 = 0
 *
 * Input: arr[] = {2, 3, 1, 0, 5}
 * Output: {{}}
 * Explanation: There is no triplet with sum 0
 */
public class TripletsWithZeroSum {
    static List<List<Integer>> tripletsWithZeroSum(int[] arr){
        List<List<Integer>> result = new ArrayList<>();

        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        result.add(Arrays.asList(i, j, k));
                    }
                }
            }
        }

        return result;
    }
    // Function to find all triplets with zero sum
    static List<List<Integer>> findTriplets(int[] arr) {

        // Map to store indices for each value
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        // Resultant list
        List<List<Integer>> ans = new ArrayList<>();

        // Check for all pairs i, j
        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {

                // Value of third index should be
                int val = -1 * (arr[j] + arr[k]);

                // If such indices exist
                if (map.containsKey(val)) {

                    // Append the i, j, k
                    for (int i : map.get(val)) {
                        ans.add(Arrays.asList(i, j, k));
                    }
                }
            }

            // After j'th index is traversed
            // We can use it as i.
            map.putIfAbsent(arr[j], new ArrayList<>());
            map.get(arr[j]).add(j);
        }

        return ans;
    }
    public static void main(String[] args){
        int[] arr = {0, -1, 2, -3, 1};
        System.out.println("triplets with sum 0 are::" +tripletsWithZeroSum(arr));
        System.out.println("triplets with sum 0 are::" +findTriplets(arr));
    }
}
