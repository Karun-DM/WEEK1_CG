import java.util.Scanner;

public class calcSwitch {
    static void Cal(){

    
    int a=10;
    int b=5;
    Scanner reader = new Scanner(System.in);
    System.out.println("operation?");
    String operation = reader.nextLine();
    switch(operation){
        case "add":
        System.out.println(a+b);
        break;
        case "sub":
        System.out.println(a-b);
        case "mult":
        System.out.println(a*b);
        break;
    }
    

    }
    public static void main(String[] args) {
        Cal();
    }
}
