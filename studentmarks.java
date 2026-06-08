import java.util.*;

class Student {
    String name;
    int[] marks = new int[5];
    double percentage;
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {

            students[i] = new Student();

            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i].name = sc.nextLine();

            int sum = 0;

            for (int j = 0; j < 5; j++) {
                students[i].marks[j] = Math.round(rand.nextFloat() * 100);
                sum += students[i].marks[j];
            }

            students[i].percentage = (sum / 500.0) * 100;
        }

        System.out.println("\n--- Results ---");

        for (int i = 0; i < 5; i++) {
            System.out.println("Name: " + students[i].name);
            System.out.print("Marks: ");

            for (int j = 0; j < 5; j++) {
                System.out.print(students[i].marks[j] + " ");
            }

            System.out.printf("\nPercentage: %.2f%%\n\n",
                    students[i].percentage);
        }

        sc.close();
    }
}