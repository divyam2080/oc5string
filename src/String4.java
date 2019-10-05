import java.util.Scanner;

public class String4 {
    private String input;
    private int c = 0;

    public String4(String input) {
        this.input = input;
    }


    void modify() {



        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u')) {
                if (c % 3 == 0) {

                    input = input.substring(0, i) + '*' + input.substring(i + 1);
                } else {
                    if (c % 3 == 1) {
                        input = input.substring(0, i) + '^' + input.substring(i + 1);
                    } else {
                        input = input.substring(0, i) + '!' + input.substring(i + 1);
                    }
                }
                c++;
            }

        }
        System.out.println(input);
    }
}

class change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String4 obj = new String4(input);
        obj.modify();
    }
}