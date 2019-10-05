import java.util.Scanner;

public class String8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine().trim();
        int Weight = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                Weight = Weight + (int) (str.charAt(i));
            }
        }
        System.out.println("Upper weight: " + Weight);
    }
}
