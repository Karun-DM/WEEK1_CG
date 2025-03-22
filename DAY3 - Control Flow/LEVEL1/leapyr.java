public class leapyr {
    public static void main(String[] args) {
        int a=1900;
        if ((a%400==0) || (a%100!=0 && a%4==0)){
            System.out.println("leap");
        }
        else{
            System.out.println("not leap");
        }
    }
    
}
