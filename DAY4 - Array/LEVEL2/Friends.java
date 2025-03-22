import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int[] age=new int[3];
        float[] height=new float[3];
        for(int i=0;i<3;i++){
            age[i]=reader.nextInt();
            
        }
        for(int i=0;i<3;i++){
            height[i]=reader.nextFloat();
            
        }
        int minage=age[0];
        float maxheight=height[0];
        

        for(int i=0;i<3;i++){
            if (minage>age[i]){
                minage=age[i];
            }
        }
        for(int i=0;i<3;i++){
                if (maxheight<height[i]){
                    maxheight=height[i];
                }
            
        }
        System.out.println(minage);
        System.out.println(maxheight);



         

        
       

    }
    
    }

