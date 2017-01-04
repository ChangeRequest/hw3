package school.lemon.changerequest.java.extendedinteger;

public class ExtendedInteger {
    private int value;

    public ExtendedInteger(int value) {
        this.value = value;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value == 2)
            return true;
        if (value < 2 || value % 2 == 0)
            return false;
        for (int i = 3; i * i <= value; i++) {
            if (value % i == 0)
                return false;
        }
        return true;
    }

    public static ExtendedInteger parseInt(char[] value) {
        String newValue = new String(value);
        return ExtendedInteger.parseInt(newValue);
    }

    public static ExtendedInteger parseInt(String value) {
        if ("".equals(value) || value == null) return null;
        int intValue = 0;
        int j = 0;
        for (int i = value.length() - 1; i > 0; i--) {
            if (Character.isDigit(value.charAt(i))) {
                intValue += Character.getNumericValue(value.charAt(i)) * (int) Math.pow(10.0, j);
                j++;
            } else return null;
        }
        if (Character.isDigit(value.charAt(0))) {
            intValue += Character.getNumericValue(value.charAt(0)) * (int) Math.pow(10.0, j);

        } else if (value.startsWith("-")) {
            intValue = intValue * (-1);
        } else if (value.startsWith("+")) {
            intValue = Math.abs(intValue);
        } else return null;
        return new ExtendedInteger(intValue);
    }

    public int getValue() {
        return this.value;
    }

    public boolean isEven() {
        return isEven(getValue());
    }

    public boolean isOdd() {
        return isOdd(getValue());
    }

    public boolean isPrime() {
        return isPrime(getValue());
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!((obj) instanceof ExtendedInteger)) return false;
        return ((ExtendedInteger) obj).getValue() == this.value;
    }

}
