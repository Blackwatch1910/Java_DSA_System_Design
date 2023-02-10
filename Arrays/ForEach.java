class ForEach {
    public static void main(String args[]) {
        // jagged array
        int arr[][] =   {
                            {5,4,3,0},
                            {2,10},
                            {11,9,6}
                        };

        for (int a[] : arr) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}