import java.util.Scanner;

public class add {
        int add(int x,int y){
        return x+y;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a=reader.nextInt();
        int b=reader.nextInt();
         
        add obj = new add();
        
        System.out.println(obj.add(a,b));

    }
    
}
