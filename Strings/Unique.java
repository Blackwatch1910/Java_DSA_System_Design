public class Unique {
    public static void main(String[] args) {
        String str = "abcd10jk";
        int arr[] = new int[256];
 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[(int)ch]++;
        }

        boolean flag = false;

        for (int i: arr) {
            if (i > 1) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Not unique");
        } else {
            System.out.println("Unique ");
        }
    }
}
