package hw3;

public class ReverseString {
    public static String reverse(String src) {
        if (src.length() == 1) {
            return src;
        }
        return reverse(src.substring(src.length() / 2)) + reverse(src.substring(0, src.length() / 2));
    }

    public static void main(String[] args){
        System.out.println(reverse("Hello world!"));
    }
}
