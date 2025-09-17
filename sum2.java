import java.util.Scanner;
public class sum2 {
    public static void main(String[] args) {
        System.out.println("enter a number to sum");
        Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int sum =0;

for(int i =0; i<=num1; i++){
    sum += sc.nextInt() ;

}
System.out.println(sum);
sc.close();
    }
}
