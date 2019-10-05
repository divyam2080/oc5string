import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = scan.nextLine().trim();
        int Weight = 0;
        for (int i = 0; i < str.length(); i++) {
            Weight = Weight + (int) str.charAt(i);
        }
        System.out.println("Total weight of string: " + Weight);
    }
}
