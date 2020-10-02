package hw3;

public class TransposeString {
    private static void helper(String base_string, String end_string){
        if (end_string.length() == 0){
            System.out.println(base_string);
            return;
        }
        for (int i = 0; i < end_string.length(); i++){
            String new_base_string = base_string + end_string.charAt(i);
            String new_end = new StringBuilder(end_string).deleteCharAt(i).toString();
            helper(new_base_string, new_end);
        }
    }

    public static void transpose(String src){
        helper("", src);
    }

    public static void main(String[] args) {
        transpose("Abc");
    }
}
