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
        if ((value & 1) == 0) {
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
        if ((value & 1) == 1) {
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
        if (value <= 1) {
            return false;
        } else {
            for (int i = 2; i < value; i++) {
                if (value % i == 0) {
                    return false;
                }
            }
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


        int result = 0;
        int resultSum = 0;
        int j = 0;
        int k = 0;
        int first = 1;
        int lengthChar = value.length;
        if (lengthChar == 0) {
            return null;
        }
        if (value[0] == '-') {
            first = -1;
        } else if (value[0] == '+') {
            k = 0;
        } else {
            k = -1;
        }
        for (int i = lengthChar - 1; i != k; i--) {
            if (Character.isDigit(value[i])) {
                result = Character.getNumericValue(value[i]);
                result *= Math.pow(10, j++);
            } else {
                return null;
            }
            resultSum += result;
        }
        resultSum *= first;
        ExtendedInteger resultInt = new ExtendedInteger(resultSum);
        return resultInt;
    }

    /**
     * Parse specified string and create instance of {@code ExtendedInteger}
     *
     * @param value to parse
     * @return instance of {@code ExtendedInteger} or
     * null in case specified value is null or the value does not contain a parsable integer
     */
    public static ExtendedInteger parseInt(String value) {

        char[] newChar = value.toCharArray();
        return parseInt(newChar);
    }

    /**
     * Get int representation of {@code ExtendedInteger}
     *
     * @return int representation
     */
    public int getValue() {
        return this.value;
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
        return this.value == value;
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
        else {
            ExtendedInteger tmp = (ExtendedInteger) obj;
            if (tmp.value == this.value)
                return true;
            else
                return false;
        }
    }

}
