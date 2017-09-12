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
        return value % 2 == 0;
    }

    /**
     * Check whether specified value is odd
     * @param value to check
     * @return true if value is odd, false - otherwise
     */
    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    /**
     * Check whether specified value is prime
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
     * @param value to parse
     * @return instance of {@code ExtendedInteger} or
     * null in case specified value is null or the value does not contain a parsable integer
     */
    public static ExtendedInteger parseInt(char[] value) {
        int parsedValue = 0;
        int arrayLength = value.length;
        int firstCharacter = 1;
        int start = 0;

        if(arrayLength == 0)
            return null;

        if(value[0] == '-')
        {
            firstCharacter = -1;
            start = 1;
        }

        if(value[0] == '+')
        {
            start = 1;
        }

        for(int i = start; i != value.length; i++) {
            if (Character.isDigit(value[i]))
                parsedValue = parsedValue * 10 + Character.getNumericValue(value[i]);
            else return null;
        }

        parsedValue *= firstCharacter;
        return new ExtendedInteger(parsedValue);
    }

    /**
     * Parse specified string and create instance of {@code ExtendedInteger}
     * @param value to parse
     * @return instance of {@code ExtendedInteger} or
     * null in case specified value is null or the value does not contain a parsable integer
     */
    public static ExtendedInteger parseInt(String value) {
        if(value.isEmpty())
        {
            return null;
        }
        return ExtendedInteger.parseInt(value.toCharArray());
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
        return this.getValue() == value;
    }

    /**
     * Check whether current {@code ExtendedInteger} is equal to specified object
     * @return true if values are equal, false - otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;

        if(obj == this)
            return true;

        if(!(getClass() == obj.getClass()))
            return false;

        ExtendedInteger temp = (ExtendedInteger) obj;
        return temp.value == this.value;
    }

}
