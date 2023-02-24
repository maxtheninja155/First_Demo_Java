public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //This is all the primitive data types, in order of size.

        boolean a = true; // 1 bit
        //These are for whole numbers
        byte b = 127; // 1 byte
        short c = 32767; // 2 bytes
        int d = 2000000000; // 4 bytes
        long e = 9000000000000000000L; // 8 bytes

        //These are for fractional numbers
        float f = 3.1234567f; // 4 bytes
        double g = 5.123456789123456; // 8 bytes

        char h = 'c'; // 2 bytes

        //Not a primitive type, this is a reference type.
        String name = "John"; // Size varies, because it stores a sequence of characters.

        System.out.println("Hello " + name);

    }
}