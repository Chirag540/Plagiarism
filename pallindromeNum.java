import java.util.Scanner;

public class pallindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;          // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            n = n / 10;                  // remove last digit
        }

        System.out.println("Reversed number = " + reversed);

        sc.close();
    }
}
