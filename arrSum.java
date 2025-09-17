import java.util.Scanner;
public class arrSum {
    public static void main(String[] args) {
        System.out.println("enter the array to sum");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum =0;
int i;
        for(i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
for(i=0; i<n;i++){
    System.out.print(arr[i]+" ");
    sum += arr[i];
}
System.out.println("sum of array is "+sum);
    }
    
}
