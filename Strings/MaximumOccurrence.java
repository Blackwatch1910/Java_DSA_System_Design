public class MaximumOccurrence {
    public static void main(String[] args) {
        String str = "Blackwatch";

        int arr[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }

        int max = Integer.MIN_VALUE;
        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                pos = i;
            }
        }

        System.out.println("Character having maximum occurence:" + (char)pos);

    }
}
