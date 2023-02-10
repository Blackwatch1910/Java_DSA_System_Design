class Smallest {
    public static void main (String args[]) {
        int a = 1;
        int b = 2;
        int c = 5;

        int res = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println("result: " + res);
    }
}