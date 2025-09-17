import java.util.Scanner;
public class psllindrome {
    public static void main(String[] args) {
        System.out.println("enter the srting to check");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder st = new StringBuilder(str);
        String Reversed = st.reverse().toString();

        if(str.equals(Reversed)){
            System.out.println("it is pallindrome");
        }else
            System.out.println("it is not pallindrome");
    
        
    }
}
