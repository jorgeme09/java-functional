package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("5579122638"));
        System.out.println(isPhoneNumberValid("5556589023"));

        boolean isValid = isPhoneNumberValidPredicate.test("5579122638");
        boolean isValidWithAnd = isPhoneNumberValidPredicate.and(containsNumber7).test("5579122638");
        boolean isValidWhitOr = isPhoneNumberValidPredicate.or(containsNumber7).test("5556589023");
        System.out.println(isValid);
        System.out.println(isValidWithAnd);
        System.out.println(isValidWhitOr);
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("55") && phoneNumber.length() == 10;
    }

    // is a boolean valued function of one argument
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("55") && phoneNumber.length() == 10;

    static Predicate<String> containsNumber7 = phoneNumber -> phoneNumber.contains("3");
}
