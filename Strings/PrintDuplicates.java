public class PrintDuplicates {
    public static void main(String[] args) {
        int freqArr[] = new int[256];

        String str = "Blackwatch is the best js dev";

        String ans = "";

        for (int i = 0;  i< str.length(); i++) {
            char ch = str.charAt(i);
            freqArr[(int)ch]++;
        }

        for (int i = 0; i < freqArr.length; i++) {
            if (freqArr[i] > 1) {
                ans += (char)i;
            }
        }

        System.out.println("Final result:" + ans);
    }    
}
