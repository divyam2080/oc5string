import java.util.Scanner;

public class String5 {
    public void Replace(String str, String substr) {
        System.out.println(str.replaceAll(substr, "-"));
    }
}

class Execution4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scan.nextLine().trim();
        System.out.println("Enter sub-string: ");
        String substr = scan.nextLine().trim();
        String5 obj = new String5();
        obj.Replace(str, substr);
    }
}