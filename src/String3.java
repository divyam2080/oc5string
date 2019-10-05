public class String3 {
    public void Replacing(String str) {
        char[] arr = new char[]{'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < arr.length; i++) {
            str = str.replace(arr[i], '*');
        }
        System.out.println(str);
    }
}