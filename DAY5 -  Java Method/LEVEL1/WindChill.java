import java.util.Scanner;

public class WindChill {
    public static double solve(double temp,double windspeed){
        return 35.74+(0.6125*temp)+((0.4275*temp)-35.75)*(Math.pow(windspeed,0.16));
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double temp = reader.nextDouble();
        double windspeed = reader.nextDouble();
        System.out.println(solve(temp,windspeed));

    }
    
}
