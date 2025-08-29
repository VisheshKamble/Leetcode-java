class OrderAgBS{
    public static void main(String[] args) {
       //int [] arr = {1,2,3,4,5,6,7,8,9};
    int [] arr = {9,8,7,6,5,4,3,2,1};
       int target =  7 ;
       int ans =  orderAgBS(arr, target);
       System.err.println(ans);
     }

    static int orderAgBS(int [] arr , int target){

     int start =  0  ; 
     int end =  arr.length - 1;

     boolean isAsc = arr[start] < arr[end];

     while (start <= end ){
     int mid = start + (end - start) / 2;

     if(isAsc){

        if(target < arr[mid]){
            end = mid - 1;
        }
        else if (target > arr[mid]){
            start = mid + 1;
        }
        else {
            return mid;
        }
     }else{
        if(target < arr[mid]){
            start = mid + 1;
        }else if (target >  arr[mid]){
            end = mid - 1;
        }
        else {
            return mid;
        }
     }
     }
     

     return -1;

     } 
    
}

