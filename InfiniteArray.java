class InfiniteArray{
    public static void main (String[] args){
        //You cannot use arr.length 
        int [] arr = {2,4,45,67,89,101,205,578,899,908,1001,1222,1333,4444};
        int target = 908;
        System.out.println(ans (arr, target));
    

    }

    static int ans (int [] arr , int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;

            // previous end  +  end - start + 1 * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(arr , target , start , end);

        //now double the box
    }

    static int binarySearch(int [] arr , int target , int start , int end ){
        while (start <= end ){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid] ){
                start =mid + 1;
            }else{
                return mid ;
            }
        }
        return -1;
    }
}