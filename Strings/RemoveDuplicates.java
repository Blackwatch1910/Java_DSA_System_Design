class RemoveDuplicates {
    public static void main(String args[]) {
        String str = "This is the best part of learning";
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ans.indexOf(ch) < 0) {      // or str.indexOf(ch, i + 1)
                ans += ch;
            }
        }

        System.out.println("Final result:"+ ans);
    }
}