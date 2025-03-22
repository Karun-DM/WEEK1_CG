import java.util.Arrays;

public class Length{
    public static void counts(String text,int count){
        for(int i=0;i<text.length();i++){
            count++;
         }
         System.out.println(count);

    }
    public static void main(String[] args) {
         String text="karun";
         int count=0;
         counts(text,count);
         
         
    }
}