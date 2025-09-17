import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i =0 ; i<arr.length; i++){
            arr[i] = sc.nextInt(); 

        }
                int largest = arr[0];

        
        for(int i =0 ; i<n; i++){
        



        if(largest<arr[i]){
            largest= arr[i];
            System.out.println("largest number is "+ largest);
                }
        
        
    }
}
}