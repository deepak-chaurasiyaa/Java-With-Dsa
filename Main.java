// Main Classs to print Hellow world on the screen
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // I'm a single line comment
        /*
         * I am a multiline
         * comment
         */

        // Literals => Literals are data used to represent fixed values. They can be
        // used directly in the code for example
        int a = 1;
        float b = (int) 2.5;
        char c = 'F';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // 1. Integer Literals => Integer literals are numeric values (associated with
        // numbers) without any fractional or exponential part. There are 4 types of
        // integer literals in Java.
        // 1. binary Literals => binary (base 2)
        // 2. Deciaml Literals => decimal(base 10)
        // 3. Octal Literals => octal(base 8)
        // 4. HexaDecimal Literals => (base 16)
        // For Example
        int binaryNumber = 0b10110; // 0b represents Binary number.
        int decimalNumber = 30;
        int octalNumber = 03745; // 9 represents Octal number.
        int hexaDecimalNumber = 0x349F93; // 0x Represents hexadecimal number.

        // In Java Binary representation starts with 0b, Octal representation starts
        // with 0 and Hexadecimal representation starts with 0x;

        System.out.println(binaryNumber);
        System.out.println(decimalNumber);
        System.out.println(octalNumber);
        System.out.println(hexaDecimalNumber);

        // Floating Point literals.
        
        double myDouble = 3.5;
        float myFloat = 3.5F;
        double myDoubleScientific = 3.445e2;

        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myDoubleScientific);
    }

}
