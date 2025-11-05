 // https://leetcode.com/problems/reach-a-number/description/

 class ReachANumber {
    public static void main(String[] args) {
        int target = 3 ;
        int result = reachNumber(target);
        System.out.println(result);
    }
     static int reachNumber(int target) {
        target = Math.abs(target) ; 
        int sum = 0 ;
        int step = 0 ;
        while (sum < target || (sum - target) % 2 != 0){
            step++;
            sum += step ;
        }
        return step ;
    }
 }