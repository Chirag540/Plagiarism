import java.util.Scanner;
public class reverBuilder {
    public static void main(String[] args) {
        System.out.println("enter String to reverse");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder str = new StringBuilder(input);

        System.out.println(str.reverse());
    }
}
