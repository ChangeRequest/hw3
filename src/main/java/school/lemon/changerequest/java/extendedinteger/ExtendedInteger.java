package school.lemon.changerequest.java.extendedinteger;

import javax.naming.ldap.ExtendedRequest;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Integer representation with some additional features
 */
public class ExtendedInteger {

    int intValue;

    public ExtendedInteger(int value) {
        intValue = value;
    }

    /**
     * Check whether specified value is even
     *
     * @param value to check
     * @return true if value is even, false - otherwise
     */
    public static boolean isEven(int value) {

        boolean result = ((value & 1) == 0);
        return result;
    }

    /**
     * Check whether specified value is odd
     *
     * @param value to check
     * @return true if value is odd, false - otherwise
     */
    public static boolean isOdd(int value) {
        boolean result = ((value & 1) == 1);
        return result;
    }

    /**
     * Check whether specified value is prime
     *
     * @param value to check
     * @return true if value is prime, false - otherwise
     */
    public static boolean isPrime(int value) {

        value = Math.abs(value);

        if (value == 0 || value == 1)
            return false;
        if (value > 2 && value % 2 == 0)
            return false;

        int valueSqrt = (int) Math.sqrt(value);
        for (int i = 3; i <= valueSqrt; i += 2)
            if (value % i == 0)
                return false;

        return true;
    }

    /**
     * Parse specified char array and create instance of {@code ExtendedInteger}
     *
     * @param value to parse
     * @return instance of {@code ExtendedInteger} or
     * null in case specified value is null or the value does not contain a parsable integer
     */
    public static ExtendedInteger parseInt(char[] value) {

        if (value == null || value.length == 0)
            return null;
        if (value.length == 0 && !Character.isDigit(value[0]))
            return null;

        ExtendedInteger result = new ExtendedInteger(0);
        int coefficient = 1;
        for (int i = value.length - 1; i > 0; i--, coefficient *= 10) {
            if (!Character.isDigit(value[i]))
                return null;
            result.intValue += Character.digit(value[i], 10) * coefficient;
        }
        if (Character.isDigit(value[0]))
            result.intValue += Character.digit(value[0], 10) * coefficient;
        else if (value[0] == '-')
            result.intValue *= -1;
        else if (value[0] != '+')
            return null;
        return result;
    }

    /**
     * Parse specified string and create instance of {@code ExtendedInteger}
     *
     * @param value to parse
     * @return instance of {@code ExtendedInteger} or
     * null in case specified value is null or the value does not contain a parsable integer
     */
    public static ExtendedInteger parseInt(String value) {
        return parseInt(value.toCharArray());
    }

    /**
     * Get int representation of {@code ExtendedInteger}
     *
     * @return int representation
     */
    public int getValue() {

        return intValue;
    }

    /**
     * Check whether current value is even
     *
     * @return true if value is even, false - otherwise
     */
    public boolean isEven() {

        return isEven(intValue);
    }

    /**
     * Check whether current value is odd
     *
     * @return true if value is odd, false - otherwise
     */
    public boolean isOdd() {

        return isOdd(intValue);
    }

    /**
     * Check whether current value is prime
     *
     * @return true if value is prime, false - otherwise
     */
    public boolean isPrime() {

        return isPrime(intValue);
    }

    /**
     * Check whether current {@code ExtendedInteger} is equal to specified int value
     *
     * @return true if values are equal, false - otherwise
     */
    public boolean equals(int value) {

        return intValue == value;
    }

    /**
     * Check whether current {@code ExtendedInteger} is equal to specified object
     *
     * @return true if values are equal, false - otherwise
     */
    @Override
    public boolean equals(Object obj) {

        if (obj == this)
            return true;

        if (obj == null)
            return false;

        if (!(getClass() == obj.getClass()))
            return false;

        return equals(((ExtendedInteger) obj).intValue);
    }

}
