import java.util.Scanner;


public class agessss {
    public static void main(String[] args) {
        int age1,age2,age3;
        float height1,height2,height3;
        Scanner inp = new Scanner(System.in);
        age1 = inp.nextInt();
        age2 = inp.nextInt();
        age3 = inp.nextInt();
        height1 = inp.nextFloat();
        height2 = inp.nextFloat();
        height3 = inp.nextFloat();
        if ((age1 > 0)){
            if ((age1 < age2) && (age1 < age3)){
                System.out.println("Amar is the youngest.");
            }
            else if ((age2 < age1) && (age2 < age3)){
                System.out.println("Akbar is the youngest.");
            }
            else if ((age3 < age1) && (age3 < age2)){
                System.out.println("Anthony is the youngest.");
            }
            else{
                System.out.println("Enter valid age.");
            }
        }
        if (height1 > 0){
            if ((height1 > height2) && (height1 > height3)){
                System.out.println("Amar is the tallest.");
            }
            else if ((height2 > height1) && (height2 > height3)){
                System.out.println("Akbar is the tallest.");
            }
            else if ((height3 > height2) && (height3 > height1)){
                System.out.println("Anthony is the tallest.");
            }
            else{
                System.out.println("Enter valid height.");
            }
        }          
    }
}