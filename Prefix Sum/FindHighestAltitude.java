// https://leetcode.com/problems/find-the-highest-altitude/description/
 
 class FindHighestAltitude {
    public static void main(String[] args) {
       int[] altitude = {-5,1,5,0,-7};
       System.out.println(findHighestAltitude(altitude)); 
    }
    static int findHighestAltitude (int[] gain){
        int maxAltitude = 0 ; 
        int altitude = 0 ;
        for(int g : gain){
            altitude += g ;
            maxAltitude = Math.max(maxAltitude, altitude);
        }
        return maxAltitude ; 
    }
 }