// https://leetcode.com/problems/find-pivot-index/description/

class FindPivot {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(findPivot(arr));
        
    }
    static int findPivot (int[] arr){
     int totalSum = 0 ;
     for(int nums : arr){
        totalSum += nums;
     }
     int leftSum = 0 ;
     for (int i = 0 ; i < arr.length ; i++){
     int rightSum = totalSum - leftSum - arr[i];

     if(leftSum == rightSum){
        return i;
     }
     leftSum += arr[i];
     }
     return -1 ;
    }
}