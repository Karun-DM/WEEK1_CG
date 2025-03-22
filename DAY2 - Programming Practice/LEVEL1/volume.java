import java.util.Scanner;

public class volume {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("enter radius");
        float r=reader.nextFloat();
        System.out.println("enter height");
        float h=reader.nextFloat();
        double volume = Math.pow(r,2)* h * Math.PI;
        System.out.println(volume);


    }
    
}
