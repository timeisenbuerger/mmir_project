package de.tei.mmir.informationservice.util;

/**
 * Utility class for calculating the similarity between two strings.
 */
public class StringSimilarityUtil {

    /**
     * Calculates the Levenshtein distance between two strings.
     * Implementation reference http://tinyurl.com/3zy8tywt
     * The distance is defined as the minimum number of single-character edits
     * (insertions, deletions, or substitutions) required to change one string into the other.
     *
     * @param a The first string.
     * @param b The second string.
     * @return The Levenshtein distance between the two strings.
     */
    private static int levenshteinDistance(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];

        for (int i = 0; i <= a.length(); i++) {
            for (int j = 0; j <= b.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1] + costOfSubstitution(a.charAt(i - 1), b.charAt(j - 1)), dp[i - 1][j] + 1), dp[i][j - 1] + 1);
                }
            }
        }

        return dp[a.length()][b.length()];
    }

    /**
     * Computes the cost of substituting two characters in the Levenshtein distance calculation.
     *
     * @param a The first character.
     * @param b The second character.
     * @return 0 if the characters are equal, 1 otherwise.
     */
    private static int costOfSubstitution(char a, char b) {
        return a == b ? 0 : 1;
    }

    /**
     * Calculates a similarity score between two strings.
     * The score is the proportion of characters that are the same between the two strings
     * and ranges from 0.0 (no similarity) to 1.0 (exact match).
     *
     * @param x The first string.
     * @param y The second string.
     * @return The similarity score between the two strings.
     */
    public static double calculateSimilarity(String x, String y) {
        int maxLength = Math.max(x.length(), y.length());
        if (maxLength == 0) return 1.0; // Both strings are empty
        return (1.0 - (double) levenshteinDistance(x, y) / maxLength);
    }
}