package Recursion;
class BasicRecursion {
    public static void main(String[] args) {
    NumberExample(1);
    }
    // Recursion is the function that calls itself
    static void NumberExample(int n ) {
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
      NumberExample(n+1);
    }
}

