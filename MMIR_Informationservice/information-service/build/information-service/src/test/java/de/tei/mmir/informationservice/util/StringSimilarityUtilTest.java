package de.tei.mmir.informationservice.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringSimilarityUtilTest {
    @Test
    void calculateSimilarity_WithIdenticalStrings_ShouldReturnOne() {
        double result = StringSimilarityUtil.calculateSimilarity("test", "test");
        assertThat(result).isEqualTo(1.0);
    }

    @Test
    void calculateSimilarity_WithCompletelyDifferentStrings_ShouldReturnZero() {
        double result = StringSimilarityUtil.calculateSimilarity("test", "abcd");
        assertThat(result).isEqualTo(0.0);
    }

    @Test
    void calculateSimilarity_WithPartialSimilarity_ShouldReturnCorrectValue() {
        double result = StringSimilarityUtil.calculateSimilarity("test", "tes");
        assertThat(result).isGreaterThan(0.0).isLessThan(1.0);
    }

    @Test
    void calculateSimilarity_WithEmptyStrings_ShouldReturnOne() {
        double result = StringSimilarityUtil.calculateSimilarity("", "");
        assertThat(result).isEqualTo(1.0);
    }

    @Test
    void calculateSimilarity_WithOneEmptyString_ShouldReturnZero() {
        double result = StringSimilarityUtil.calculateSimilarity("test", "");
        assertThat(result).isEqualTo(0.0);
    }
}
