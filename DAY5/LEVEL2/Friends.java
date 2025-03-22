import java.util.*;
public class Friends {
    public static void youngest(int[] age){
        Arrays.sort(age);
        System.out.println(age[0] + " is the youngest age");
    }
    public static void tallest(float[] height){
        Arrays.sort(height);
        System.out.println(height[height.length-1] + " is the tallest");
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] age=new int[3];
        float[] height=new float[3];
        for(int i=0;i<3;i++){
            age[i]=reader.nextInt();
        }
        
        for(int i=0;i<3;i++){
            height[i]=reader.nextFloat();

        }
        youngest(age);
        tallest(height);

    }
    
}
