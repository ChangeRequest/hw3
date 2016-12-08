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
     * @param value to check
     * @return true if value is even, false - otherwise
     */
    public static boolean isEven(int value) {
        return value%2 == 0;
    }

    /**
     * Check whether specified value is odd
     * @param value to check
     * @return true if value is odd, false - otherwise
     */
    public static boolean isOdd(int value) {

        return value%2 != 0;
    }

    /**
     * Check whether specified value is prime
     * @param value to check
     * @return true if value is prime, false - otherwise
     */
    public static boolean isPrime(int value) {

        if (value == 1) {
            return false;
        }
        for (int d = 2; d*d<value; d++){
            if (value%d == 0)
                return false;
        }
        return true;
    }

    /**
     * Parse specified char array and create instance of {@code ExtendedInteger}
     * @param value to parse
     * @return instance of {@code ExtendedInteger} or
     * null in case specified value is null or the value does not contain a parsable integer
     */
    public static ExtendedInteger parseInt(char[] value) {

        if (value == null || value.length == 0) {
            return null;
        }
        String newValue = new String(value);
        return ExtendedInteger.parseInt(newValue);
    }

    /**
     * Parse specified string and create instance of {@code ExtendedInteger}
     * @param value to parse
     * @return instance of {@code ExtendedInteger} or
     * null in case specified value is null or the value does not contain a parsable integer
     */
    public static ExtendedInteger parseInt(String value) {

        if (value == null || value.length() == 0) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        if (Character.isDigit(value.charAt(0)) || value.startsWith("-")) {
            sb = sb.append(value.charAt(0));
        }

        for (int i = 1; i<value.length(); i++) {
            if (Character.isDigit(value.charAt(i))) {
                sb = sb.append(value.charAt(i));
            }
            else return null;
        }
        return new ExtendedInteger (new Integer(value));

    }

    /**
     * Get int representation of {@code ExtendedInteger}
     * @return int representation
     */
    public int getValue() {

        return this.value;
    }

    /**
     * Check whether current value is even
     * @return true if value is even, false - otherwise
     */
    public boolean isEven() {

        return isEven(this.value);
    }

    /**
     * Check whether current value is odd
     * @return true if value is odd, false - otherwise
     */
    public boolean isOdd() {

        return isOdd(this.value);
    }

    /**
     * Check whether current value is prime
     * @return true if value is prime, false - otherwise
     */
    public boolean isPrime() {

        return isPrime(this.value);
    }


    /**
     * Check whether current {@code ExtendedInteger} is equal to specified int value
     * @return true if values are equal, false - otherwise
     */
    public boolean equals(int value) {

        return this.value == value;

    }

    /**
     * Check whether current {@code ExtendedInteger} is equal to specified object
     * @return true if values are equal, false - otherwise
     */

    public boolean equals(Object obj) {

        if (obj instanceof ExtendedInteger) {
            ExtendedInteger extendedInteger =  (ExtendedInteger) obj;
            return true;
        }

        else return false;
    }

}
