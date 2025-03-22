import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    
	    int num = sc.nextInt();
	    
	    double[][] personData = new double[num][3];
	    
	    
	    for(int i=0;i<num;i++){
	        
	        personData[i][0] = sc.nextDouble();
	        personData[i][1] = sc.nextDouble();
	       
	    }
	    for(int i=0;i<num;i++){
	        double height = personData[i][0];
	        double weight = personData[i][1];
	        
	        personData[i][2] = weight/(height*height);
	        
	         if(personData[i][2]<= 18.5){
	            System.out.println("Underweight");
	        }else if(personData[i][2]> 18.5 && personData[i][2] <= 24.9){
	            System.out.println(" Normal");
	        }else if(personData[i][2]>25 && personData[i][2] < 39.9){
	            System.out.println(" Overweight");
	        }else if(personData[i][2] > 40){
	            System.out.println(" Obesity ");
	        }
	    }
	    
	    for(int i=0;i<num;i++){
	        for(int j=0;j<3;j++){
	            System.out.println(personData[i][j]);
	        }
	    }
	    
	}
}