package school.lemon.changerequest.java.extendedinteger;

/**
 * Integer representation with some additional features
 */
public class ExtendedInteger {
    private int value;

    public ExtendedInteger(int value) {
        this.value = value;
    }


    public static boolean isEven(int value) {
        return ((value & 1) == 0);
    }

    public static boolean isOdd(int value) {
        return (value % 2 != 0);
    }

    public static boolean isPrime(int value) {
        if (value == 2) return true;
        if (value < 2 || value % 2 == 0) return false;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static ExtendedInteger parseInt(char[] value) {
        if (value == null || value.length == 0) return null;
        String newValue = new String(value);
        StringBuilder str = new StringBuilder();
//        switch (newValue.charAt(0){
//            case (newValue.startsWith("-")):
//        }
        if (Character.isDigit(newValue.charAt(0)) || newValue.startsWith("-") || newValue.startsWith("+")) {
            str = str.append(newValue.charAt(0));
        }
//        if (newValue.startsWith("+")){
//
//        }
        else return null;
        for (int i = 1; i < newValue.length(); i++) {
            if (Character.isDigit(newValue.charAt(i))) {
                str = str.append(newValue.charAt(i));
            } else return null;
        }
        ExtendedInteger newInt = new ExtendedInteger(new Integer(newValue));
        return newInt;
    }


    public static ExtendedInteger parseInt(String value) {
        if (("").equals(value)) return null;
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
        } else if(value.startsWith("+")) {}
        else return null;
        ExtendedInteger newInt = new ExtendedInteger(intValue);
        return newInt;
    }


    public int getValue() {
        return this.value;
    }


    public boolean isEven() {
        return isEven(this.value);
    }


    public boolean isOdd() {
        return isOdd(this.value);
    }


    public boolean isPrime() {
        return isPrime(this.value);
    }


    public boolean equals(int value) {
        return this.value == value;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!((obj) instanceof ExtendedInteger)) return false;
        return ((ExtendedInteger) obj).getValue() == this.value;

    }

    @Override
    public String toString() {
        return "ExtendedInteger{" +
                "value=" + value +
                '}';
    }

    public static void main(String[] args) {
char [] arr = {1,2,3};
        System.out.println((parseInt(arr)));
    }


}