import java.util.Scanner;

public class Matrix {
    public static void add(int[][] array1,int[][] array){
        double[][] result=new double[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
            result[i][j]=array1[i][j]+array[i][j];
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
            System.out.print(result[i][j]+",");
        }
        System.out.println();
    }
    public static void sub(int[][] array1,int[][] array){
        double[][] result1=new double[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
            result1[i][j]=array1[i][j]-array[i][j];
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
            System.out.print(result1[i][j]+",");
        }
        System.out.println();
    }
    public static void mult(int[][] array1,int[][] array){
        double[][] result2=new double[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            result2[i][j]=array1[i][j]*array[i][j];
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            System.out.print(result2[i][j]+",");
            }
        }
        System.out.println();
    }
    public static void transpose( int[][] array){
        double[][] result3=new double[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            result3[i][j]=array[i][j];
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            System.out.print(result3[i][j]+",");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[][] array = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                array[i][j]=reader.nextInt();

            }
        }
        int[][] array1 = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                array1[i][j]=reader.nextInt();

            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(array[i][j]);
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(array1[i][j]);
            }
        }
        add(array1,array);
        sub(array1,array);
        mult(array1,array);
        transpose(array);
        

    }
}
