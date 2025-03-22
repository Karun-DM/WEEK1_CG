import java.util.Scanner;

public class voting{
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int ages[] = new int[10];
        for (int i=0;i<ages.length;i++){
            System.out.print("enter age of student "+ (i+1) + " : " );
            ages[i]=reader.nextInt();
        }
        for(int element:ages){
            if (element<18){
                System.out.println("not");
            }
            else{
                System.out.println("eligible");
            }
             

        }
    }
}