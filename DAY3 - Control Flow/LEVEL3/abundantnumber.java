import java.util.Scanner;

public class abundantnumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter any no");
        int no = reader.nextInt();
        int sum=0;
        for(int i=1;i<no;i++){
            if(no%i==0){
                sum=sum+i;
            }
            
        }
        System.out.println(sum);
            
        if (sum>no){
                System.out.println("abundant number");
            }
        else{
                System.out.println("its not");
            }
        
    }
    
}
