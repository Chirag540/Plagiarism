import java.util.Scanner;
public class arrReve {
    public static void main(String[] args) {
        System.out.println("enter the array to be reverse");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i =0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
