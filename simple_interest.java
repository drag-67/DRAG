import java.util.Scanner;

public class simple_interest 
{
   public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Simple Interest Program In Java");
        System.out.println("Enter Amount : ");
        float amount = scan.nextFloat();

        System.out.println("Enter Rate :");
        float rate = scan.nextFloat();
      
        System.out.println("Enter Time :");
        float time = scan.nextFloat();

        float si = (amount*rate*time)/100;

        System.out.println("Simple Interest Of"+ amount +"is" + si );


    }
}
