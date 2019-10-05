public class String1 {
    public void String(String S) {
        int len = S.length();
        System.out.print("index: ");
        for (int i = 0; i < len; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.print("chars: ");
        for (int j = 0; j < len; j++) {
            System.out.print(S.charAt(j) + "\t");
        }
    }
}