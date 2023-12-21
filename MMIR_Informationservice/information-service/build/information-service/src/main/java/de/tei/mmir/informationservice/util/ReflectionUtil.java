package de.tei.mmir.informationservice.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectionUtil {

    private static final Logger logger = LoggerFactory.getLogger(ReflectionUtil.class);

    public static boolean isAtLeastOneFieldNonNull(Object obj) {
        if (obj == null) return false;

        for (Field field : obj.getClass().getDeclaredFields()) {
            try {
                field.setAccessible(true); // Damit private Felder auch zugänglich sind
                if (field.get(obj) != null) {
                    return true;
                }
            } catch (IllegalAccessException e) {
                logger.error(Arrays.toString(e.getStackTrace()));
            }
        }
        return false;
    }
}
