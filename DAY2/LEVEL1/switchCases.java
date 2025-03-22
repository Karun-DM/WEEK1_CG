import java.net.Socket;
import java.util.Scanner;

public class switchCases {
    public static void main(String[] args) {
        int a=10;

        int b=5;
        Scanner reader = new Scanner(System.in);
        System.out.println("choose operation");
        String operation = reader.nextLine();
        switch(operation){
            case "add":
                System.out.println(a+b);
                break;
            case "sub":
                System.out.println(a-b);
                break;
            case "mult":
                System.out.println(a*b);
                break;
            case "div":
                System.out.println(a/b);
                break;
            }
        }
    }
