package searching.linearSearching.easy;

/**
 * Test case 1:
 * Input: arr[] = [10, 20, 4]
 * Output: 20
 * Explanation: Among 10, 20 and 4, 20 is the largest.
 *
 * Input: arr[] = [20, 10, 20, 4, 100]
 * Output: 100
 */
public class LargestElementInAnArray {
    static int largestElement(int arr[]){
         int largest =arr[0];
         for(int i=0;i < arr.length;i++){
             if(arr[i] > largest){
                 largest = arr[i];
             }
            /* if(largest >arr[i]){
                 continue;
             }else {
                 largest = arr[i];
             }*/
         }
         return largest;
    }
    public static void main(String [] args){
        int arr[] ={20, 10, 20, 4, 100};
        System.out.println(" the largest element in the array: " + largestElement(arr));

    }

}
