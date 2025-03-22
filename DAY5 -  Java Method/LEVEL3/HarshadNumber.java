public class HarshadNumber {
    public static void harshad(int n,int sum){
        if(n%sum==0){
            System.out.println("harshad number");
        }
        else{
            System.out.println("not");
        }
    }
    public static int SumSquare(int n){
        int sum=0;
        while(n>0){
        int digit=n%10;
        sum=sum+(int)Math.pow(digit,2);
        n=n/10;
        }
        return sum;
    }
   
    
    
    public static void main(String[] args) {
        
        int n=21;
        int sum=0;
        int temp=n;
         
        while(temp>0){
            int digit=temp%10;
            sum=sum+digit;
            temp=temp/10;
            
        }
        harshad(n,sum);
        System.out.println(SumSquare(n));
        
        }
    }
    

