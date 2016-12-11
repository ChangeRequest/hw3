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

        if (value == 2) return true;
        if (value < 2 || value % 2 == 0) {
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

        if ((("").equals(value)) || value == null) {
            return null;
        }
        int val = 0;
        int j = 0;
        for (int i = value.length() - 1; i > 0; i--) {
            if (Character.isDigit(value.charAt(i))) {
                val = val + Character.getNumericValue(value.charAt(i)) * (int) Math.pow(10.0, j);
                j++;
            } else return null;
        }
        if (Character.isDigit(value.charAt(0))) {
            val = val + Character.getNumericValue(value.charAt(0)) * (int) Math.pow(10.0, j);

        } else if (value.startsWith("-")) {
            val = val * (-1);
        } else if(value.startsWith("+")) {}
        else return null;
        ExtendedInteger newInt = new ExtendedInteger(val);
        return newInt;
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
        if (obj == null) return false;

        if (!(obj instanceof ExtendedInteger)) return false;
            return ((ExtendedInteger) obj).getValue() == this.value;

    }

}
