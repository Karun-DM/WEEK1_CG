import java.util.Scanner;

public class StringBound {
    public static void main(String[] args) {
        String text="karun";
        try{
            for(int i=0;i<text.length();i++){
                System.out.println(text.charAt(10));
            }
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
         
        }

    }
    

