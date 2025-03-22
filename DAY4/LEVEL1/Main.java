import java.util.*;

public class Main {
   
    public static void main(String[] args) {
        int sum=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
         
         
        int user=(int)(Math.random()*8)-1;
        while(true){
            if(user>=1){
                sum=sum+user;
                list.add(user);
                user=(int)(Math.random()*8)-1;
            }
            else if(user==-1){
                user=(int)(Math.random()*8)-1;
                continue;
            }
            else{
                System.out.println("out");
                break;
            }
        }
        System.out.println("total sum is "+sum);
        for(int i = 0; i < list.size(); i++) {   
            System.out.print(list.get(i)+" ");
        } 
        
        
    }}
        