//  https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.*;

class FindAllDuplicates{
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        FindAllDuplicates result = new FindAllDuplicates();
        List<Integer> solution = result.findDuplicates(arr);
        System.out.println(solution);
    }
  public List<Integer> findDuplicates(int[] arr) {
    int i = 0 ;
    while (i < arr.length){
        int correct = arr[i] - 1;
        if(arr[i]!= arr[correct]){
            swap(arr , i , correct);
        }else{
            i++;
        }
    }
    List<Integer> result = new ArrayList<>();
    for(int index = 0 ; index < arr.length ; index++){
        if(arr[index] != index + 1){
            result.add(arr[index]);

        }
    } 
    return result ; 
  }


  static void swap (int[] arr , int firstNum ,  int SecondNum){
    int temp = arr[firstNum];
    arr[firstNum] = arr[SecondNum];
    arr[SecondNum] = temp;
  }
}