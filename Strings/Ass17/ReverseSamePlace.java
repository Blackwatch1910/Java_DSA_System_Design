class ReverseSamePlace {

    static String reverse(String s) {
            String str = "";

            for (int i = s.length() - 1;  i >= 0; i--) {
                str += s.charAt(i);
            }

            return str;
        }

    public static void main(String args[]) {
        String str = "Think twice";

        String splitString[] = str.split(" ");

        String revString = "";

        for (String s: splitString) {
            revString += reverse(s) + " ";
        }

        System.out.println("Final string:" + revString);

    }
}