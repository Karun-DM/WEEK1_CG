import java.util.Scanner;

public class temp {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in) ;
        System.out.println("enter celsius");
        float c = reader.nextFloat();
        float f = (c * 9/5)+32;
        System.out.println(f);
    }
    
}
