import java.io.*;
import java.util.*;

public class uniqueWords {
    public static List<String> getUniqueWordsFromFile(String filePath) throws IOException {
        Set<String> uniqueWordsSet = new HashSet<>();
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        // Read each line from the file
        while ((line = bufferedReader.readLine()) != null) {

            // Split line into words (by spaces and punctuation)
            String[] words = line.split("[\\s+\\p{Punct}]+");

            // Add each word to the set (converts to lowercase for consistency)
            for (String word : words) {
                if (!word.isEmpty()) {
                    uniqueWordsSet.add(word.toLowerCase());
                }
            }
        }

        // Close the readers
        bufferedReader.close();
        fileReader.close();

        // Convert Set to List
        List<String> wordsList = new ArrayList<>(uniqueWordsSet);

        Collections.sort(wordsList, Collections.reverseOrder());

        return wordsList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        try {
            List<String> uniqueWordsList = getUniqueWordsFromFile(filePath);
            System.out.println("\nUnique words in descending order:");
            for (String word : uniqueWordsList) {
                System.out.println(word);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found at path: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

}