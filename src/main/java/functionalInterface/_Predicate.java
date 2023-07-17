package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println("isPhoneNumberValid--> " + isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println("isPhoneNumberValid--> " + isPhoneNumberValidPredicate.test("09000000000"));

        boolean isPhoneNumberValidAndContains3 = isPhoneNumberValidPredicate.and(containsNumber3).test("07000000003");
        System.out.println("isPhoneNumberValidAndContains3--> " + isPhoneNumberValidAndContains3);

        boolean isPhoneNumberValidOrContains3 = isPhoneNumberValidPredicate.or(containsNumber3).test("09000000003");
        System.out.println("isPhoneNumberValidOrContains3--> " + isPhoneNumberValidOrContains3);
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}

