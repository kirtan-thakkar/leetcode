import java.util.*;

class Student {
    static int total;
    static double average;

    static void calculate(int[] marks) {
        total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }
        average = total / 5.0;
    }
}

public class Static {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] totals = new int[n];
        double[] avgs = new double[n];

        for (int i = 0; i < n; i++) {
            int[] marks = new int[5];

            System.out.print("\nEnter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.println("Enter marks:");
            for (int j = 0; j < 5; j++) {
                marks[j] = sc.nextInt();
            }
            sc.nextLine();

            Student.calculate(marks);
            totals[i] = Student.total;
            avgs[i] = Student.average;
        }

        System.out.println("\n--- RESULT ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("Total: " + totals[i]);
            System.out.println("Average: " + avgs[i]);
            System.out.println();
        }

        sc.close();
    }
}