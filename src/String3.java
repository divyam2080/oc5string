import java.util.Scanner;

public class String3 {
    public void Replacing(String str) {
        char[] arr = new char[]{'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < arr.length; i++) {
            str = str.replace(arr[i], '*');
        }
        System.out.println(str);
    }
}

class Execution3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scan.nextLine().trim();
        String3 obj = new String3();
        obj.Replacing(str);
    }
}