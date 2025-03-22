import java.util.Scanner;

public class Ilegal {
    public static void exception(int age){
        try{
            if (age<0){
                throw new IllegalArgumentException("ages cannot be negative");
            }

            }
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

        

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int age=reader.nextInt();
         
        exception(age);
        
    }
}