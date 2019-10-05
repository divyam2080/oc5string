import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scan.nextLine().trim();
        str = str.toUpperCase();
        System.out.println(str);
    }
}
