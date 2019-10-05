import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter character which have to be find out: ");
        char ch = scan.nextLine().charAt(0);
        System.out.println("Enter any string: ");
        String str = scan.nextLine().trim();
        scan.close();
        System.out.println(str.indexOf(ch));
    }
}
