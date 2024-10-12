class Gene {
    static void uHalf(String str) {
        char first;
        char second;
        int pos = 0;

        for (int i = 1; i <= 4; i++) {
            first = str.charAt(pos);
            second = str.charAt(pos + 1);
            pos += 2;

            for (int j = 4 - i; j >= 1; j--) {
                System.out.print(" ");
            }

            System.out.print(first);

            for (int j = 1; j < i; j++) {
                System.out.print("--");
            }

            System.out.println(second);
        }
    }

    static void lHalf(String str) {
        char first;
        char second;
        int pos = 0;

        for (int i = 1; i <= 4; i++) {
            first = str.charAt(pos);
            second = str.charAt(pos + 1);
            pos += 2;

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            System.out.print(first);

            for (int j = 4 - i; j >= 1; j--) {
                System.out.print("--");
            }

            System.out.println(second);
        }
    }

    static void printDNA(String str[], int n) {
        for (int i = 0; i < n; i++) {
            int x = i % 6;

            if (x % 2 == 0) {
                uHalf(str[x]);
            }
            else {
                lHalf(str[x]);
            }
        }
    }

    public static void main (String[] args) {
        int n = 8;
        String DNA[] = {"ATTAATTA", "TAGCTAGC", "CGCGATAT", "TAATATGC", "ATCGTACG", "CGTAGCAT"};

        printDNA(DNA, n);
    }
}