import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    // Selection Sort function
     static void selectionSort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            int last = arr.length - i - 1;
            int maxElement = getMaxElement(arr , 0 , last);
            swap(arr , maxElement, last);
        }
     }
    
    // Swap function
    static void swap (int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    

    // Get index of maximum element between start and end
    static int getMaxElement (int[] arr , int start , int end){
        int max = start ;
        for (int i = start ; i <= end ; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
  
}

