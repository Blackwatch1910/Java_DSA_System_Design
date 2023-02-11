import java.util.Arrays;

class SortString {
    public static void main(String args[]) {
        String s = "Blackwatch";

        char ch[] = s.toCharArray();

        Arrays.sort(ch);

        for (char c: ch) {
            System.out.print(c);
        }
        System.out.println();
    }
}