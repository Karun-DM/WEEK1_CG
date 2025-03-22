import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] age = new int[5];
        for (int i=0;i<age.length;i++){
            System.out.println("enter the age "+(i+1)+" : ");
        
        age[i]=reader.nextInt();
    }
        for(int element:age){
            if(element<18){
                System.out.println("not");
            }
            else{
                System.out.println("eligible");
            }
        }
    }
    
}
