import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter phy marks");
        float phy=reader.nextFloat();
        System.out.println("enter math marks");
        float math=reader.nextFloat();
        System.out.println("enter chem marks");
        float chem=reader.nextFloat();
        double average = (math+phy+chem)/3;
        if (average >=80 || average>100){
            System.out.println("level 4 "+" and marks is  "+ average);
        }
        else if (average >=70 || average>80){
            System.out.println("level 3 "+" and marks is  "+  average);
        }
        else if (average >=60 || average>70){
            System.out.println("level 2 "+" and marks is  "+  average);
        }
        else if (average >=50 || average>60){
            System.out.println("level 1 "+" and marks is  "+ average);
        }
        else{
            System.out.println("fail");
        }
    }
}