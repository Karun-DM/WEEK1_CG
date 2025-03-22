// public class mileskm {
//     public static void main(String[] args) {
//         float km=10.8f;
//         double mile=km/1.6;
//         System.out.printf("the distance %.2f km in miles is %.2f",km,mile);
// }
// }
    
// }

// public class profitloss{
//      public static void main(String[] args) {
//         float costprice=129f;
//         float sellingprice=191f;
//         double profit=sellingprice-costprice;
//         double profitpercentage=(profit/costprice)*100;
//         System.out.printf("cost price is INR %.2f and selling price is INR %.2f%n"+"the profit is INR %f and the profit percentage is %.2f%% ",costprice,sellingprice,profit,profitpercentage);
//      }
// }

// public class pen{
//     public static void main(String[] args) {
//         int totalpens=14;
//         int totalstudents=3;
//         int penperstudent=14/3;
//         int nondistributed=14%3;
//         System.out.printf("The pen per student %d and the remaining per not distributed is %d",penperstudent,nondistributed);
//     }
// }
// public class university{
//     public static void main(String[] args) {
//         int fee=125000;
//         int discountPercent=10;
//         float discount= fee*(discountPercent/100f);
//         float feePay=fee-discount;
//         System.out.printf("discount amount is %.2f and final discounted fee is %.2f",discount,feePay);
//     }
// }
// public class volumeEarth{
//     public static void main(String[] args) {
//         double radius = 6378;
//         double volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);
//         double radiusInMiles=radius/1.6;
//         double volumeInMiles = (4.0/3.0)*Math.PI*Math.pow(radiusInMiles,3);

//         System.out.printf("volume of earth in cubic kilometer is %.2f km and cubic miles is %.2f miles",volume,volumeInMiles);
//     }
// }

// import java.util.Scanner;
// public class KmInMiles{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         double km = input.nextDouble();
//         double miles= km/1.6;
//         System.out.printf("total miles is %.2fmile for given %.2f km ",miles,km);
//         }
// }

// import java.util.Scanner;

// public class universityInput{
//         public static void main(String[] args) {
//             Scanner reader = new Scanner(System.in);
//             System.out.println("enter fee");
//             int fee = reader.nextInt();
//             System.out.println("enter discountpercent");
//             double discountPercent = reader.nextDouble();
            
//             double discount= fee*(discountPercent/100);
//             double feePay=fee-discount;
//             System.out.printf("discount amount is %.2f and final discounted fee is %.2f",discount,feePay);
//         }
//     }

// import java.util.Scanner;
// public class height{
//     public static void main(String[] args) {
//         Scanner reader = new Scanner(System.in);
//         System.out.println("enter height in cm");
//         float hInCm=reader.nextFloat();
//         float hInInch=hInCm/2.54f;
//         float hInFoot=hInInch/12f;
//         System.out.printf("your height in cm is %.2f while in feet is %.2f and in inches is %.2f",hInCm,hInFoot,hInInch);
//     }
// }

import java.util.Scanner;

// public class Calc{
//     public static void main(String[] args) {
//         Scanner reader = new Scanner(System.in);
//         System.out.println("enter 1st number");
//         float input1=reader.nextFloat();
//         System.out.println("enter 2nd number");
//         float input2=reader.nextFloat();
//         double add=input1+input2;
//         double sub=input1-input2;
//         double mult=input1*input2;
//         double div=input1/input2;
//         System.out.printf("addition,subtraction,multiplication.division value of 2 numbers are %.2f and %.2f is %.2f,%.2f,%.2f and %.2f",input1,input2,add,sub,mult,div);
//     }
// }
// public class area{
//     public static void main(String[] args) {
//         Scanner reader=new Scanner(System.in);
//         System.out.println("enter height");
//         float height=reader.nextFloat();
//         System.out.println("enter base");
//         float base=reader.nextFloat();
//         double area = base*height*1/2;
//         System.out.printf("base is %.2f and height is %.2f and the area is %.2f",base,height,area);


//     }
// }

// public class perimeter{
//     public static void main(String[] args) {
//         Scanner reader = new Scanner(System.in);
//         System.out.println("perimeter???");
//         float perimeter=reader.nextFloat();
//         float side = perimeter/4;
//         System.out.printf("for perimeter %.2f side is %.2f",perimeter,side);
//     }
// }
// public class distance {
//     public static void main(String[] args) {
//         Scanner reader = new Scanner(System.in);
//         System.out.println("enter distance in feets");
//         float distanceInFeets=reader.nextFloat();
//         float yard=distanceInFeets/3;
//         float mile=yard/1760;
//         System.out.print("distance in feets is"+distanceInFeets+" distance in yard is "+yard+" n miles is "+mile);
//     }
// }
// public class totalPrice{
//     public static void main(String[] args) {
//         Scanner reader = new Scanner(System.in);
//         System.out.println("unit price???");
//         int unitPrice = reader.nextInt();
//         System.out.println("quantity???");
//         int quantity = reader.nextInt();
//         int totalPrices=unitPrice*quantity;
//         System.out.printf("quantity is %d and unit price is %d so totalPrices is %d",quantity,unitPrice,totalPrices);
//     }
// }
public class handshake{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("no of students?");
        int no = reader.nextInt();
        int handshake=(no*(no-1))/2;
        System.out.printf("number of handshake for %d student is %d",no,handshake);

    }
}