public class Count {
    public static void main(String[] args) {
        int consonants = 0, vowels = 0, special = 0;

        String s = "Blackwatch is the best js dev";
        s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((int)ch > 64 && (int)ch < 91) {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else {
                special++;
            }

        }
        System.out.println("Vowels' count:" + vowels + " consonants' count: " + consonants + " special characters: " +special);
    }
}
