import java.util.Scanner;
public class wordCount {
    public static void main(String[] args) {
        System.out.println("enter the String to check");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] words = str.trim().split("\\s+");

        System.out.println(words.length);
    }
    
    
}
