
import java.util.ArrayList;

class PrettyPrinting {
    public static void main(String[] args) {
    //if object toString() will be called 
    //float a = 122.3445f;
    //System.out.printf("Formatted number is %.2f", a);
    // System.out.printf("PIE: %.2f", Math.PI );
    //System.out.printf("My name is %s and i am %s" , "Vishesh" , "Cool");
      System.out.println("Vishesh" + new ArrayList<>());
      System.out.println("Vishesh" + new Integer(18));

      //atleast 1 String is required
      System.out.println(new Integer(18) + "" + new ArrayList<>() );
    }
}
