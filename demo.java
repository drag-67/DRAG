import java.util.*;

class Sample{
    String name;
    int num;


    void get(){
        Scanner sam = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = sam.next();

        System.out.println("Enter PH.Number : ");
        num = sam.nextInt();
    }
    void put(){
        System.out.println("Name = "+ name);
        System.out.println("Ph.Number = "+ num);
    }
    public static void main(String[] args){
        Sample s = new Sample();
        s.get();
        s.put();
    }
}