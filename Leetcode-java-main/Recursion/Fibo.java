package Recursion;

public class Fibo {
    public static void main(String [] args){
        int ans = fiboNum(4);
    System.out.println(ans);
    }
    static int fiboNum(int n){
        if(n < 2){
            return n;
        }
        return fiboNum(n-1) + fiboNum(n-2);
    }
}
