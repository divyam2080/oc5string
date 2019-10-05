import java.util.Scanner;

public class String2 {
    public void SubString(String str, int index) {
        System.out.println(str.substring(index));
    }
}

class Execution2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scan.nextLine().trim();
        System.out.println("Enter index: ");
        int index = scan.nextInt();
        scan.close();
        String2 obj = new String2();
        obj.SubString(str, index);
    }
}
