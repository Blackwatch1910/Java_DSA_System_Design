class Pangram {
    public static void main(String args[]) {
        String s = "Two driven jocks help fax my big ";

        s = s.toLowerCase();
        s = s.replace(" ", "");
        int ch[] = new int[26];

        // freq array
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            ch[(int)c - 97]++;
        }

        boolean flag = false;
        for (int i: ch) {
            if (i == 0) {
                flag = true;
                break;
            }
        }

        if (flag)
            System.out.println("Not panagram");
        else
            System.out.println("Panagram");
    }
}