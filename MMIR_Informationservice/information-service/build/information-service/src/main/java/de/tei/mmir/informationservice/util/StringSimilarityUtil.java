package de.tei.mmir.informationservice.util;

public class StringSimilarityUtil {
    private static int levenshteinDistance(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];

        for (int i = 0; i <= a.length(); i++) {
            for (int j = 0; j <= b.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1]
                                            + costOfSubstitution(a.charAt(i - 1), b.charAt(j - 1)),
                                    dp[i - 1][j] + 1),
                            dp[i][j - 1] + 1);
                }
            }
        }

        return dp[a.length()][b.length()];
    }

    private static int costOfSubstitution(char a, char b) {
        return a == b ? 0 : 1;
    }

    public static double calculateSimilarity(String x, String y) {
        int maxLength = Math.max(x.length(), y.length());
        if (maxLength == 0) return 1.0; // Beide Strings sind leer
        return (1.0 - (double) levenshteinDistance(x, y) / maxLength);
    }
}
