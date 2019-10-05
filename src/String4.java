public class String4 {
    private String input;
    private int c = 0;


    public String4(String input) {
        this.input = input;
    }


    public void modify() {

        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') && (c % 3 == 0)) {
                input = input.replace(input.charAt(i), '*');
            } else if ((input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') && (c % 3 == 1)) {
                input = input.replace(input.charAt(i), '^');
            } else if ((input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') && (c % 3 == 2)) {
                input = input.replace(input.charAt(i), '!');
            }
            c++;
        }
        System.out.println(input);
    }
}