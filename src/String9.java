import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String str = scan.nextLine().trim();
        int upperW = 0;
        int lowerW = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                upperW = upperW + (int) (str.charAt(i));
            }
            if (Character.isLowerCase(str.charAt(i))) {
                lowerW = lowerW + (int) (str.charAt(i));
            }
        }
        int absoluteWeight = upperW - lowerW;
        System.out.println("absolute weight of " + str + " is " + Math.abs(absoluteWeight));
    }
}
