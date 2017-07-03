package school.lemon.changerequest.java.extendedinteger;


/**
 * Integer representation with some additional features
 */
public class ExtendedInteger {
    private int value;

    public ExtendedInteger(int value) {
        this.value = value;
    }

    /**
     * Check whether specified value is even
     *
     * @param value to check
     * @return true if value is even, false - otherwise
     */
    public static boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

    /**
     * Check whether specified value is odd
     *
     * @param value to check
     * @return true if value is odd, false - otherwise
     */
    public static boolean isOdd(int value) {
        if (value % 2 != 0) {
            return true;
        }
        return false;
    }

    /**
     * Check whether specified value is prime
     *
     * @param value to check
     * @return true if value is prime, false - otherwise
     */
    public static boolean isPrime(int value) {
        int i;
        if (value > 1) {
            for (i = 2; i <= value / 2; i++) {
                if (value % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Parse specified char array and create instance of {@code ExtendedInteger}
     *
     * @param value to parse
     * @return instance of {@code ExtendedInteger} or
     * null in case specified value is null or the value does not contain a parsable integer
     */
    public static ExtendedInteger parseInt(char[] value) {
        if (value.length != 0 && value != null) {
            char firstChar = value[0];
            int negative = 1;
            int result = 0;

            if (firstChar == "-".charAt(0)) {
                negative = -1;
            } else if (firstChar == "+".charAt(0)) {
            } else if (Character.isDigit(firstChar)) {
                result = Character.getNumericValue(value[0]);
            } else return null;

            for (int i = 1; i < value.length; i++) {
                if (Character.isDigit(value[i])) {
                    int prevInt = result;
                    result = prevInt * 10 + Character.getNumericValue(value[i]);
                } else return null;
            }
            return new ExtendedInteger(new Integer(negative*result));
        }
        return null;
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
        return value;
    }

    /**
     * Check whether current value is even
     *
     * @return true if value is even, false - otherwise
     */
    public boolean isEven() {
        return isEven(value);
    }

    /**
     * Check whether current value is odd
     *
     * @return true if value is odd, false - otherwise
     */
    public boolean isOdd() {
        return isOdd(value);
    }

    /**
     * Check whether current value is prime
     *
     * @return true if value is prime, false - otherwise
     */
    public boolean isPrime() {
        return isPrime(value);
    }

    /**
     * Check whether current {@code ExtendedInteger} is equal to specified int value
     *
     * @return true if values are equal, false - otherwise
     */
    public boolean equals(int value) {
        if (this.value == value) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExtendedInteger that = (ExtendedInteger) o;

        return value == that.value;
    }

    @Override
    public int hashCode() {
        return value;
    }
}
