package school.lemon.changerequest.java.extendedinteger;

/**
 * Integer representation with some additional features
 */
public class ExtendedInteger {
    private int value;

    public ExtendedInteger(int value) {
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
        if (value < 2)
            return false;
        for (int i = 2; i*i<= value; i++) {
            if (value % i == 0)
                return false;
        }
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
        //TODO: implement me
        return null;
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
        if (isEven(value)) {
            return true;
        }
        return false;
    }

    /**
     * Check whether current value is odd
     *
     * @return true if value is odd, false - otherwise
     */
    public boolean isOdd() {
        if (isOdd(value)) {
            return true;
        }
        return false;
    }

    /**
     * Check whether current value is prime
     *
     * @return true if value is prime, false - otherwise
     */
    public boolean isPrime() {
        if (isPrime(value))
            return true;
        return false;
    }

    /**
     * Check whether current {@code ExtendedInteger} is equal to specified int value
     *
     * @return true if values are equal, false - otherwise
     */
    public boolean equals(int value) {
        if (this.value == getValue()) {
            return true;
        }
        return false;
    }

    /**
     * Check whether current {@code ExtendedInteger} is equal to specified object
     *
     * @return true if values are equal, false - otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ExtendedInteger) {
            ExtendedInteger extendedInteger = (ExtendedInteger) obj;
            return true;
        } else return false;
    }

}
