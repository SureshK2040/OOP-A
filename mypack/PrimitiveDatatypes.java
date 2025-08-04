package mypack;

public class PrimitiveDatatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;
        short s = 1000;
        int i = 100000;
        long l = 10000000L;
        float f = 10.5f;
        double d = 99.99;
        char c = 'A';

        // Display values and sizes
        System.out.println("byte value: " + b + ", Size: " + Byte.SIZE + " bits");
        System.out.println("short value: " + s + ", Size: " + Short.SIZE + " bits");
        System.out.println("int value: " + i + ", Size: " + Integer.SIZE + " bits");
        System.out.println("long value: " + l + ", Size: " + Long.SIZE + " bits");
        System.out.println("float value: " + f + ", Size: " + Float.SIZE + " bits");
        System.out.println("double value: " + d + ", Size: " + Double.SIZE + " bits");
        System.out.println("char value: " + c + ", Size: " + Character.SIZE + " bits");
	}

}
