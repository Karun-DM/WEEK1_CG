import java.util.Scanner;

public class Spring {
    public static boolean spring(int month,int day){
        if ((month==3&&day>20)||
            (month==4)||
            (month==5)||
            (month==6 && day<20)){
                return true;
            }
            else{
                return false;
            }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int month=reader.nextInt();
        int day=reader.nextInt();
        if(spring(month,day)){
            System.out.println("spring");
        }
        else{
            System.out.println("not spring");
        }
    }
    
}
