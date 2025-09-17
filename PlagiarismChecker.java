import java.io.*;
import java.util.*;

public class PlagiarismChecker {

    // Method to read file and create word frequency map
    private static Map<String, Integer> getWordFrequency(String filePath) {
        Map<String, Integer> freqMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Normalize words (lowercase, remove punctuation)
                line = line.toLowerCase().replaceAll("[^a-zA-Z ]", "");
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + filePath);
        }
        return freqMap;
    }

    // Method to calculate cosine similarity
    private static double cosineSimilarity(Map<String, Integer> freq1, Map<String, Integer> freq2) {
        Set<String> allWords = new HashSet<>();
        allWords.addAll(freq1.keySet());
        allWords.addAll(freq2.keySet());

        int dotProduct = 0;
        double magnitude1 = 0, magnitude2 = 0;

        for (String word : allWords) {
            int val1 = freq1.getOrDefault(word, 0);
            int val2 = freq2.getOrDefault(word, 0);

            dotProduct += val1 * val2;
            magnitude1 += Math.pow(val1, 2);
            magnitude2 += Math.pow(val2, 2);
        }

        return (magnitude1 == 0 || magnitude2 == 0) 
                ? 0.0 
                : dotProduct / (Math.sqrt(magnitude1) * Math.sqrt(magnitude2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter path of first file: ");
        String file1 = sc.nextLine();

        System.out.print("Enter path of second file: ");
        String file2 = sc.nextLine();

        Map<String, Integer> freq1 = getWordFrequency(file1);
        Map<String, Integer> freq2 = getWordFrequency(file2);

        double similarity = cosineSimilarity(freq1, freq2);
        double percentage = similarity * 100;

        System.out.println("\n===== Plagiarism Report =====");
        System.out.println("File 1: " + file1);
        System.out.println("File 2: " + file2);
        System.out.printf("Similarity: %.2f%%\n", percentage);
    }
}
