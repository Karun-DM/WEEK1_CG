public class HandShake{
    public static int hand(int n){
        return n*(n-1)/2;
    }
    public static void main(String[] args) {
        int n=10;
        int c=hand(n);
        System.out.println(c);
    }
}