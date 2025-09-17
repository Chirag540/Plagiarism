import java.util.Scanner;
public class search {
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];


        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("enter target value");
                int target = sc.nextInt();

        for(int i =0 ; i<n; i++){
            if(target == arr[i]){
                System.out.print("found at  "+i);
                break;
            }
        }
        
    }
}
