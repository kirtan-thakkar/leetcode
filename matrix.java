import java.util.*;
public class matrix {

    public static void matrixCall(){
        //input
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements to form a 3 * 3 matrix mother fucker:");
        for(int i=0 ; i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // to find the max Number in the matrix;
        int max = Integer.MIN_VALUE;
         for(int i=0 ; i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(max < matrix[i][j]){
                    System.out.println("Ohh max number updated mother fucker");
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("The Maximum Number in the given inputed matrix is:" + max);

    }

    public static void main(String args[]){
        matrixCall();
    }
}
