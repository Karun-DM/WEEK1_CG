import java.util.*;
public class Convertor {
    
    public static void conv(float foot){
        double yard=foot/3;
        System.out.println(yard);
    }
    public double convs(float cm){
        double inch=cm/2.54;
        return inch;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float foot=reader.nextFloat();
       
        conv(foot);
        float cm = reader.nextFloat();
        Convertor obj=new Convertor();
        System.out.println(obj.convs(cm));



    }
   }

    
 
