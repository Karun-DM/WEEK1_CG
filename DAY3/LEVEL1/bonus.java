import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter salary");
        float salary = reader.nextFloat();
        System.out.println("enter service");
        float service = reader.nextFloat();
        float bonus =5f/100f;
        if (service>5){
            double addedBonus=salary+(salary*bonus);
            System.out.println(addedBonus);
        }
        else{
            System.out.println(salary);
        }
    }
}
