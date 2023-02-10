class Reverse {
    static String reverse(String s) {
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            str += s.charAt(i);
        }
        return str;
    }

    public static void main(String a[]) {
        String s = "devanshu yadav";
        String sArr[] = s.split(" ");
        String reversedString = "";
        for (String str : sArr) {
            reversedString += reverse(str) + " ";
        }

        System.out.println(reversedString);

        String newReversedString = "";
        for (int i = sArr.length - 1; i >= 0; i--) {
            newReversedString += reverse(sArr[i]) + " ";
        }

        System.out.println(newReversedString);
    }
}