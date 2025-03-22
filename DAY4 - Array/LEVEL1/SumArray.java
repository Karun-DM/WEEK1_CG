import java.util.Scanner;

public class SumArray {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double sum=0.0;
        double[] numbers = new double[10];
        int i = 0;
        while (true){
            numbers[i] = reader.nextDouble();
            if (numbers[i] == 0) {
                break;
            }
            sum += numbers[i]; 
            i++;
        
        }
        System.out.println(sum);


    }
    
}
