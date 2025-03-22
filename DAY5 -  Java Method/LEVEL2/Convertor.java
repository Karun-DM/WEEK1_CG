import java.util.Scanner;



public class Convertor {
    public static void conv(float miles){
        double km=miles/0.621371;
        System.out.println(km);
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float miles=reader.nextFloat();
        
        conv(miles);

    }
    
}
