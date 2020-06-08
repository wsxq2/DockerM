package top.wsxq2.dockerm.util;


import org.controlsfx.validation.Severity;
import org.controlsfx.validation.Validator;

import java.net.URL;

public class ValidatorUtil {
    private static Validator<String> url;
    private static Validator<String> empty;

    public static Validator<String> getUrlValidator() {
        if (url == null) {
            url = Validator.createPredicateValidator(t -> {
                try {
                    new URL(t);
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }, "Not a valid URL!", Severity.ERROR);
        }
        return url;
    }

    public static Validator<String> getEmptyValidator() {
        if (empty == null) {
            empty = Validator.createEmptyValidator("Empty!");
        }
        return empty;
    }
}
