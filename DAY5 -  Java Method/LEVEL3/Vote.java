// import java.util.Arrays;
// import java.util.Scanner;

// public class Vote {
//     public static void valid(int[] age){
//         System.out.println("valid ages are" );
//         for(int i=0;i<4;i++){
//             if(age[i]>18){
//                 System.out.print(+age[i]+" ");;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner reader = new Scanner(System.in);
//         int[] age=new int[4];
//         for(int i=0;i<4;i++){
//             age[i]=reader.nextInt();
//         }
//         valid(age);
        
//     }
    
// }
 
import java.util.Scanner;

public class Vote {
    public static boolean valid(int[] age){
        boolean found=false;
        System.out.println("valid ages are" );
        for(int i=0;i<4;i++){
            if(age[i]>18){
                System.out.print(age[i]+" ");
                found= true;
            }
        }
        return found;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] age=new int[4];
        for(int i=0;i<4;i++){
            age[i]=reader.nextInt();
        }
        valid(age);
        
    }
    
}
