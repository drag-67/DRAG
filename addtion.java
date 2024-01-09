import java.util.Scanner;

class addition {

    
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);

        System.out.println("Java Program For Addition of two nubers");
        System.out.println("Enter FIrst Number:");
        a = scan.nextInt();

        System.out.println("Enter Second Number:");
        b = scan.nextInt();

        int c = a+b;
        System.out.println("Addition OF two Numbers Is :" + c);


    }
}