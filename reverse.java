import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
System.out.println("enter a string to reverse");
Scanner sc = new Scanner(System.in);

String str = sc.nextLine();
String rever =" ";

for(int i = str.length()-1 ; i>=0 ; i--){
    rever += str.charAt(i);

}
System.out.println(rever);
        
    }
}
