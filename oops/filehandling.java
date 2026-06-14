import java.io.*;
import java.util.*;

public class filehandling {
    public static void main(String[] args) {
        File file = new File("numbers.txt");

        if (file.exists()) {
            System.out.println("File exists.");

            try {
                FileWriter fw = new FileWriter(file);
                Random rand = new Random();

                for (int i = 0; i < 150; i++) {
                    int num = rand.nextInt(1000);
                    fw.write(num + " ");
                }

                fw.close();
                System.out.println("150 integers added.");

                Scanner sc = new Scanner(file);
                int n = 150;
                int[] nums = new int[n];
                int max = Integer.MIN_VALUE;
                int count = 0;

                while (sc.hasNextInt()) {
                    int num = sc.nextInt();
                    nums[count] = num;

                    if (num > max) {
                        max = num;
                    }
                    
                    count++;
                }

                System.out.println("Maximum integer in file: " + max);

                // Sort
                for (int i = 0; i < n - 1; i++) {
                    int min_idx = i;
                    for (int j = i + 1; j < n; j++) {
                        if (nums[j] < nums[min_idx]) min_idx = j;
                    }

                    int temp = nums[min_idx];
                    nums[min_idx] = nums[i];
                    nums[i] = temp;
                }

                FileWriter fw2 = new FileWriter("numbersSorted.txt");

                for (int k = 0; k < n; k++) {
                    fw2.write(nums[k] + " ");
                }

                fw2.close();
                System.out.println("Sorted numbers written to numbersSorted.txt");

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}