import java.util.Scanner;

public class circlearea {
    public static void main(String[] args){
        Scanner reader= new Scanner(System.in);
        System.out.println("enter radius");
        float r = reader.nextFloat();
        double area = Math.PI * Math.pow(r,2);
        System.out.println(area);
    }
    
}
