import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        System.out.println("enter the number to check average");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
             int sum = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];

        }
        double average = sum / n;
        for(int i=0; i<n; i++){
            System.out.print(" "+arr[i]);


        }
                        System.out.println(" average is "+average);    
                        sc.close();

    }
    
}
