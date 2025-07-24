package searching.binarysearching;

public class FloorSqrt {
    static int floorSqrt(int x){
        int curr = 1;
        while (curr * curr <=x){
            curr++;
        }
        return curr -1;
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(floorSqrt(n));
    }
}
