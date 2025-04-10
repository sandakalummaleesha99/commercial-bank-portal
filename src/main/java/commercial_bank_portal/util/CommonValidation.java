package commercial_bank_portal.util;

public class CommonValidation {

    public static boolean stringNullValidation(String inputString) {
        return inputString == null || inputString.isEmpty();
    }

    public static boolean integerNullValidation(Integer inputValue) {
        return inputValue == null;
    }
}
