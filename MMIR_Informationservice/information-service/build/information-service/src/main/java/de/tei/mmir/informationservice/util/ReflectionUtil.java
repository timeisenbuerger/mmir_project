package de.tei.mmir.informationservice.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Utility class providing reflection-related methods.
 */
public class ReflectionUtil {

    private static final Logger logger = LoggerFactory.getLogger(ReflectionUtil.class);

    /**
     * Checks if at least one field in the given object is non-null.
     *
     * @param obj The object to check for non-null fields.
     * @return true if at least one field in the object is non-null, false otherwise.
     */
    public static boolean isAtLeastOneFieldNonNull(Object obj) {
        if (obj == null) return false;

        for (Field field : obj.getClass().getDeclaredFields()) {
            try {
                field.setAccessible(true); // Makes private fields accessible
                if (field.get(obj) != null) {
                    return true;
                }
            } catch (IllegalAccessException e) {
                logger.error("Access error when checking fields: " + Arrays.toString(e.getStackTrace()));
            }
        }
        return false;
    }
}