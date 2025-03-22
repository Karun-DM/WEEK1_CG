import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int noOfPerson=reader.nextInt();
        double[] weight=new double[noOfPerson];
        double[] height=new double[noOfPerson];
        double[] BMI=new double[noOfPerson];
        String[] weightStatus=new String[noOfPerson];
        for(int i=0;i<noOfPerson;i++){
            weight[i]=reader.nextDouble();
        }
        for(int i=0;i<noOfPerson;i++){
            height[i]=reader.nextDouble();
        }
        for(int i=0;i<noOfPerson;i++){
            BMI[i]=weight[i]/(height[i]*height[i]);
            System.out.println(BMI[i]);
        }
        for(int i=0;i<noOfPerson;i++){
            if (BMI[i]<=18){
                System.out.println("less");
            }
            else if(BMI[i]>19 && BMI[i]<23){
                System.out.println("normal");
            }
            else{
                System.out.println("obese");
            }
        }




    }
    
}
