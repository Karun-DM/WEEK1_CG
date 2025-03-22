import java.util.Scanner;

public class Sum {
    public static void compare(int sum,int total){
        if(sum==total){
            System.out.println("its same");
        }
        else{
            System.out.println("diff");
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number=reader.nextInt();
        int sums=0;
        for(int i=0;i<=number;i++){
            sums=sums+i;
        }
        System.out.println(sums);
        int total=(number*(number+1))/2;
        System.out.println(total);
        compare(sums,total);
    }
    
}
