public class Palindrome {
    public static void main(String[] args) {
        String s = "2552";
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            str += s.charAt(i);
        }

        if (str.equals(s))
            System.out.println("Palindrome");
        else    
            System.out.println("Not palindrome");
    }
}
