



 // Ascending Binary Search
 /*class BinarySearch {
     public static void main(String[] args) {
        System.out.println("Binary Search");
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target =  9;
        int ans = binarySearch(arr, target) ;
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < mid) {
                end = mid - 1;
            }
            else if(target > mid)
            {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}*/

//Decreasing 
class BinarySearchAlgo{
public static void main(String[] args) {
    int[] arr = {9,8,7,6,5,4,3,2,1,0};
    int target =  8;
    int ans = binarySearch(arr, target);
    System.out.println(ans); 
    
}

static int binarySearch (int [] arr ,  int target){
    int start =  0 ;
    int end =  arr.length -1;

    while (start <= end ){
        int mid = start + (end - start)/2;

        if (target < arr[mid] ){
            start = mid + 1;
        }  else if (target > arr[mid] ){
            end =  mid - 1;
        }else{
            return mid ;
        }
    }
    return-1 ;

}

}

