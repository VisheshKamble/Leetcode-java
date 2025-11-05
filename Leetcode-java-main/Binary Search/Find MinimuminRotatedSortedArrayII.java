// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/

class FindMinimuminRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,3,};
        System.out.println(findMin(arr));
        
    }
    static int findMin (int[] arr){
        int start =  0 ;
        int end = arr.length - 1 ; 
        while (start < end ){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr [end]){
                start = mid + 1 ;
            }else if(arr[mid] > arr[start]){
                end = mid ; 
            }else {
                end-- ;
            }
        }
        return arr[end];
    }
}