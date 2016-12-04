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
        for (int i = 2; i * i <= value; i++) {
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
        if (("").equals(value)) return null;
        StringBuilder sb = new StringBuilder();
        if (Character.isDigit(value.charAt(0)) || value.startsWith("-"))
            sb = sb.append(value.charAt(0));
        for (int i = 1; i < value.length(); i++) {
            if (Character.isDigit(value.charAt(i))) {
                sb = sb.append(value.charAt(i));
            } else return null;
        }
        return new ExtendedInteger(new Integer(value));
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
        return value > 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ExtendedInteger)) return false;
        ExtendedInteger extendedInteger = (ExtendedInteger) obj;
        return extendedInteger.getValue() > 0;
    }

}
