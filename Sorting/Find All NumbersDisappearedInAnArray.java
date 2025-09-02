//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
import java.util.*;
class FindAllNumbersDisappearedInAnArray{
    public static void main(String[] args) {
        int[] nums = {1,4,5,7,3,6,6,9};
    FindAllNumbersDisappearedInAnArray solution = new FindAllNumbersDisappearedInAnArray();
    List<Integer> result = solution.findDisappearedNumbers(nums);
    System.out.println(result);  
        
    }
public List<Integer> findDisappearedNumbers(int[] nums){
int i = 0;
while (i < nums.length){
int correctIndex = nums[i] - 1;
if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex] ){
    swap(nums, i, correctIndex);
}else {
    i++;
}
}

 List<Integer> result = new ArrayList<>();
for(int index = 0 ; index < nums.length ; index++){
    if(nums[index] != index + 1){
      result.add(index+1);
    }
}
return result;
}

static void swap (int[] arr , int firstNum ,  int SecondNum){
    int temp = arr[firstNum];
    arr[firstNum] = arr[SecondNum];
    arr[SecondNum] = temp;
}
}