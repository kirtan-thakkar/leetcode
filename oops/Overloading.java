import java.util.*;



// public class Overloading {
//     public static void area(int length) {
//         System.out.println("Area of square: " + (length * length));
//     }
    
//     public static void area(int length, int width) {
//         System.out.println("Area of rectangle: " + (length * width));
//     }
    
//     public static void area(double radius) {
//         System.out.println("Area of circle: " + (3.14 * radius * radius));
//     }
    

//     public static void main(String args[]) {
//         area(2);
//         area(5, 10);
//         area(5.5);
//     }
// }

// class Shape {
//     int length, width;
//     double radius;

//     public void area(int length) {
//         System.out.println("Area of square: " + (length * length));
//     }
    
//     public void area(int length, int width) {
//         System.out.println("Area of rectangle: " + (length * width));
//     }
    
//     public void area(double radius) {
//         System.out.println("Area of circle: " + (3.14 * radius * radius));
//     }
// }

// public class Overloading {
//     public static void main(String args[]) {
//         Shape square = new Shape();
//         Shape rectangle = new Shape();
//         Shape circle = new Shape();

//         square.area(5);
//         rectangle.area(5, 10);
//         circle.area(5.5);
//     }
// }

public class Overloading {
    static int my_len(String s) {
        int count = 0;
        char[] charar = s.toCharArray();
        
        for (char c : charar) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String str = sc.nextLine();

        int length = my_len(str);
        System.out.print(length);

        sc.close();
    }
}