package school.lemon.changerequest.java.extendedinteger;

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

        boolean Even = ((value & 1) == 0);
        return Even;
    }

    /**
     * Check whether specified value is odd
     *
     * @param value to check
     * @return true if value is odd, false - otherwise
     */
    public static boolean isOdd(int value) {
        boolean Odd = ((value & 1) == 1);
        return Odd;
    }

    /**
     * Binary method of exponentiation
     *
     * @param M   basis of degree
     * @param Key exponent
     * @param N   module
     * @param C   result
     */
    private static void pow_mod(int M, int Key, int N, int[] C) {
        if (Key == 0) {
            C[0] = 1;
            return;
        }
        if (Key == 1) {
            C[0] = M;
            return;
        }
        int i;
        for (i = 31; i > 0; i--)
            if (Key >>> i != 0) {
                i--;
                break;
            }

        long y = M;
        for (; i >= 0; i--) {
            y = (y * y) % N;
            if (((Key >>> i) & 1) == 1)
                y = (y * M) % N;
        }
        C[0] = (int) y;
    }


    /**
     * Leman`s test of number for simplicity
     *
     * @param P tested value
     * @param k number of itterations
     */
    private static boolean lemanTest(int P, int k) {
        int T = P - 1;
        int F = T >>> 1;
        int a, count = 0;
        int b[] = new int[1];

        Random rnd = new Random(System.currentTimeMillis());

        for (int i = 0; i < k; i++) {
            a = 2 + rnd.nextInt(P - 2);
            pow_mod(a, F, P, b);
            if (b[0] == T)
                count++;
            else if (b[0] != 1)
                return false;
        }
        if (count > 0)
            return true;
        return false;
    }

    /**
     * Check whether specified value is prime
     *
     * @param value to check
     * @return true if value is prime, false - otherwise
     */
    public static boolean isPrime(int value) {

        value = Math.abs(value);
        if (value < 2)
            return false;
        if (value == 2)
            return true;
        boolean IsPrime = lemanTest(value, 50);
        return IsPrime;
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

        Pattern p = Pattern.compile("^(-|\\+)?\\d+$");
        Matcher m = p.matcher(new String(value));
        if (!m.matches())
            return null;
        ExtendedInteger res = new ExtendedInteger(Integer.parseInt(new String(value)));
        return res;


        //  ExtendedInteger res = new ExtendedInteger(Integer.valueOf(new String(value)).intValue());
        // ExtendedInteger res = new ExtendedInteger(Integer.parseInt(new String(value)));
        //  return res;
    }

    /**
     * Parse specified string and create instance of {@code ExtendedInteger}
     *
     * @param value to parse
     * @return instance of {@code ExtendedInteger} or
     * null in case specified value is null or the value does not contain a parsable integer
     */
    public static ExtendedInteger parseInt(String value) {
        if (value == null || value.length() == 0)
            return null;

        Pattern p = Pattern.compile("^(-|\\+)?\\d+$");
        Matcher m = p.matcher(value);
        if (!m.matches())
            return null;
        ExtendedInteger res = new ExtendedInteger(Integer.parseInt(value));
        return res;

        //  ExtendedInteger res = new ExtendedInteger(Integer.valueOf(value).intValue());
        // ExtendedInteger res = new ExtendedInteger(Integer.parseInt(value));
        //return res;
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
        else {
            ExtendedInteger tmp = (ExtendedInteger) obj;
            if (tmp.intValue == this.intValue)
                return true;
            else
                return false;
        }
    }

}
