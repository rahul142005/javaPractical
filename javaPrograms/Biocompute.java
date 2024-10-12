class Biocompute {
    public static int scoreMatch (String subject, String query, int subStart, int queStart, int length) {
        int score = 0;

        for (int i = 0; i < length; i++) {
            char subBase = subject.charAt(subStart + i);
            char queBase = query.charAt(queStart + i);

            if (subBase == queBase) {
                score = score + 1;
            }
            else {
                score = score - 1;
            }
        }

        return score;
    }

    public static void main (String[] args) {
        String str1 = "ACTGATCGATTGATCGATCGATCG";
        String str2 = "TTTAGATCGATCTTTGATC";

        System.out.println(scoreMatch(str1, str2, 7, 4, 8));
        System.out.println(scoreMatch(str1, str2, 7, 4, 4));
        System.out.println(scoreMatch(str1, str2, 7, 4, 12));
        System.out.println(scoreMatch(str1, str2, 10, 1, 5));
    }
}