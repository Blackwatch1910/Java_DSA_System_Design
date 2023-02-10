import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "School Master";
        s1 = s1.toLowerCase();
        String s2 = "The classroom";
        s2 = s2.toLowerCase();

        boolean flag = false;

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
