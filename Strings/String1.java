class String1 {
    public static void main(String args[]) {
        String s = new String();
        System.out.println(s);
        String str = "Umbrella";
        System.out.println(str.contains("e"));

        String newStr = "Hello, have a good day";
        for (int i = 0; i < newStr.length(); i++) {
            if (newStr.charAt(i) == 'a' || newStr.charAt(i) == 'e' || newStr.charAt(i) == 'i' || newStr.charAt(i) == 'o' || newStr.charAt(i) == 'u' ||
                newStr.charAt(i) == 'A' || newStr.charAt(i) == 'E' || newStr.charAt(i) == 'I' || newStr.charAt(i) == 'O' || newStr.charAt(i) == 'U'
            ) {
                System.out.print(newStr.charAt(i));
            }
        }
        System.out.println();
    }
}