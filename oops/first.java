public class first {
    static void pattern(int rows, int columns){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=columns; j++){
                // checking for border cells (i,j)
                if(i == 1 || i == rows || j == 1 || j == columns){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void half_py_inv(int rows){
        for(int i=1; i<=rows; i++){
            // Print spaces (increasing with each row)
            for (int j=1; j<i; j++){
                System.out.print(" ");
            }
            // Print stars (decreasing with each row)
            for(int z=1; z<=rows-i+1; z++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // int counter =1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(counter+" ");
        //         counter++;
        //     }
        //     System.out.println();
        // }
        
        //Butterfly Problem 
        int n=4;
        // Upper half (including middle)
        for(int i=1 ; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){  // Fixed: combined the two space loops
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower half (mirror image)
        for(int i=n-1; i>=1; i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
