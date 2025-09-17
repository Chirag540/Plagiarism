import java.util.Scanner;
public class fibbo {
    public static void main(String[] args) {
        System.out.println("enter the number to print");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int first =0 , second =1;

if(n>=first){
    System.out.println(first+" ");
}
if(n>=second){
    System.out.println(second+" ");
}

        for(int i =3 ; i<=n; i++){
            int next= first+ second;
            first = second;
            second = next;

            System.out.println(next);



        }
    }
}
