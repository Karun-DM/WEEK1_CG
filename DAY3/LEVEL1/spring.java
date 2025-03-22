import java.util.Scanner;

public class spring {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter month ");
        String month = reader.nextLine();
        System.out.println("enter day number");
        int day = reader.nextInt();
        
            if ( (month.equals("march") && day >=20) || month.equals("april") || month.equals("may") || (month.equals("june") && day<=20))
            {
                System.out.println("spring");
            }
            else{
                System.out.println("not spring");
            }
        }
    }
