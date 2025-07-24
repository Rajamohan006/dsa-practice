package searching.linearSearching;

public class LinearSearching {
    static int search(int arr[], int key){
        for(int i =0;i<arr.length; i++){
            if(arr[i]== key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {2,3,4,5,6,7};
        int x=5;
        int result= search(arr,x);
        System.out.println(result +" is an index of key in the array");
    }
}

