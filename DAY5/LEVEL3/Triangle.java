import java.util.Scanner;

public class Triangle {
    public static void check(double ab,double bc,double ac ){
        if(ab==bc && ab==ac){
            System.out.println("collinear");
        }
        else{
            System.out.println("non collinear");
        }
    }
    public static void checkOne(double x1,double x2,double x3,double y1,double y2,double y3){
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        System.out.println(area);
        if(area==0){
            System.out.println("collinear");
        }
        else{
            System.out.println("not");
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double x1=reader.nextDouble();
        double y1=reader.nextDouble();
        
        double x2=reader.nextDouble();
        double y2=reader.nextDouble();
        double x3=reader.nextDouble();
        double y3=reader.nextDouble();

        double ab=(y2-y1)/(x2-x1);
        double ac=(y3-y1)/(x3-x1);
        double bc=(y3-y2)/(x3-x2);
        check(ab,bc,ac);
        checkOne(x1,x2,x3,y1,y2,y3);
        



    }
}
