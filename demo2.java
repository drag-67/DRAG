
import java.util.*;
public class demo2 {

    public static void main(String[] a)
    {
        int age;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter Age : ");
      age = scanner.nextInt();

      if(age>18)
      {
        System.out.println("You Are Adult" );
      }
      else
      {
        System.out.println("You Are Not Adult");
      }

    }
}
