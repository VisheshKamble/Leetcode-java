package Recursion;

public class BsWithRecursion {
    public static void main (String[] args){
        int arr[] = {1,4,6,7,8,9,11};
        int target = 4;
        System.out.println(Bs(arr, target , 0 , arr.length - 1 ));

   }

    static int Bs (int [] arr , int target , int s , int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2 ;
        if(arr[m] == target){
            return m;
        }
        if(arr[m] > target){
            return Bs(arr , target , s , m - 1);
        }
        return Bs(arr , target , m + 1 , e);
    }
}
