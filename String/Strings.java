
import java.util.*;


class Strings{
    public static void main(String[] args) {

      //Pretty printing 

    //if object toString() will be called 
    //float a = 122.3445f;
    //System.out.printf("Formatted number is %.2f", a);
    // System.out.printf("PIE: %.2f", Math.PI );
    //System.out.printf("My name is %s and i am %s" , "Vishesh" , "Cool");
      System.out.println("Vishesh" + new ArrayList<>());

      //depreacated
      System.out.println("Vishesh" + new Integer(18));

      //atleast 1 String is required
      System.out.println(new Integer(18) + "" + new ArrayList<>() );



      //performance 

      //waste of memory 
      String series = "";
      for(int i = 0 ; i <= 26 ;  i++){
        char ch = (char) ('a' + i);
        series += ch ;
      }
      System.out.println(series);


      // String builder 

      StringBuilder sb = new StringBuilder();
      for (int i = 1 ; i < 26 ; i++){
        char ch = (char) ('a' + i);
        sb.append(ch);
      }

      //Methods

      String name = "Vishesh Kamble Hello World";
      //System.out.println(Arrays.toString(name.toCharArray()));
      System.out.println(name.toLowerCase());
      System.out.println(name);
      System.out.println("   Vishesh   ".strip());
      System.out.println(Arrays.toString(name.split(" ")));

    }
}
