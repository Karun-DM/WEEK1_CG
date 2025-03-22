import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        float[] no= new float[5];
        Scanner reader = new Scanner(System.in);
        for(int i=0;i<no.length;i++){
            System.out.println("numbers are"+(i+1)+" : ");
            no[i]=reader.nextFloat();
        }
        for(float element:no){
            if(element<0.0){
                System.out.println(element + " is negative number");
            }
            else {
                System.out.println(element + "positive number");
            }
            if(element%2==0){
                System.out.println(element + "even number");
            }
            else{
                System.out.println(element + "odd");
            }

        }
        float first=no[0];
        float last=no[no.length-1];
        if(first<last){
            System.out.println("last elements is larger");
        }
        else{
            System.out.println("1st elemnt is largest");
        }

    }
}
