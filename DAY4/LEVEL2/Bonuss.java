import java.util.Scanner;

public class Bonuss{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double[] salary = new double[10];
        
        double[] yrofservice = new double[5];
        for(int i=0;i<5;i++){
            System.out.println("enter the salary for employeer "+i);
            salary[i] = reader.nextDouble();
            
            
            System.out.println("enter the yrofservice "+i);
            yrofservice[i] = reader.nextDouble();

            }
        for(int i=0;i<5;i++){
            if(yrofservice[i]>=5){
                salary[i]=salary[i]+salary[i]*(5f/100f);

            }
            else{
                salary[i]=salary[i]+salary[i]*(2f/100f);
            }
        }
        for(int i=0;i<5;i++){
            System.out.println(salary[i]);
        }
        
        
    }

    
}