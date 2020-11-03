package syntax;

public class AreteansTest {
    private byte byteNumber;   // 1  byte
    private int integer;   // 4  bytes
    private char character;   // 2  bytes
    private short shortInteger;   // 2  bytes
    private long longInteger;   // 8  bytes
    private float floatDecimal;   // 4  bytes
    private double doubleDecimal;   // 8  bytes
    private boolean aBoolean;   // 1  bit

    public void printDummy() {
        byteNumber = 1;
        integer = 10;
        character = 'a';
        shortInteger = 1;
        longInteger = 10L;
        floatDecimal = 1.0f;
        doubleDecimal = 1.0;
        aBoolean = true;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "byte: " + byteNumber +
                ", int: " + integer +
                ", char: " + character +
                ", short: " + shortInteger +
                ", long: " + longInteger +
                ", float: " + floatDecimal +
                ", double: " + doubleDecimal +
                ", boolean: " + aBoolean;
    }

    public void printSequence(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public int findLargerNum(int x, int y) {
        if (x > y)
            return x;
        return y;
    }
}
