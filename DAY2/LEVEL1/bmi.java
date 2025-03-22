import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter height in cm");
        double hInCm=reader.nextDouble();
        System.out.println("enter weight");
        double wt=reader.nextDouble();
        double hInM=hInCm/100;
        double BMI=wt/Math.pow(hInM,2);
        System.out.println(BMI);
        if (BMI<18){
            System.out.println("unerweight");
        }
        else if(BMI>18 && BMI<25){
            System.out.println("normalweight");

        }
        else {
            System.out.println("obese");
        }

    }
    
}
