
import java.util.Arrays;

class CycleSort{
    public static void main(String[] args) {
        int [] arr = {8,7,6,5,4,3,2,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void cycleSort(int[] arr){
        int i = 0 ; //search will start from zeroth index;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
            swap(arr , i , correct);     
            }else {
                i++;
            }
        }
    }
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}