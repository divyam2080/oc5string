import java.util.Scanner;

public class String11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter character which we have to find: ");
        char ch = scan.nextLine().charAt(0);
        System.out.println("Enter any string: ");
        String str = scan.nextLine().trim();
        scan.close();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.println(i);
            }
        }
    }
}
