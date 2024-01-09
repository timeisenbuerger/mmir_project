package de.tei.mmir.informationservice.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReflectionUtilTest {

    private static class DummyClass {
        private final Integer fieldOne = null;
        private String fieldTwo = "test";
    }

    @Test
    void isAtLeastOneFieldNonNull_WithNonNullField_ShouldReturnTrue() {
        DummyClass testObject = new DummyClass();
        boolean result = ReflectionUtil.isAtLeastOneFieldNonNull(testObject);
        assertThat(result).isTrue();
    }

    @Test
    void isAtLeastOneFieldNonNull_WithAllNullFields_ShouldReturnFalse() {
        DummyClass testObject = new DummyClass();
        testObject.fieldTwo = null;
        boolean result = ReflectionUtil.isAtLeastOneFieldNonNull(testObject);
        assertThat(result).isFalse();
    }

    @Test
    void isAtLeastOneFieldNonNull_WithNullObject_ShouldReturnFalse() {
        boolean result = ReflectionUtil.isAtLeastOneFieldNonNull(null);
        assertThat(result).isFalse();
    }
}
