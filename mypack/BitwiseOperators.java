package mypack;
import java.util.*;
public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a & b = " + (a & b) + " (Binary: " + Integer.toBinaryString(a & b) + ")");
        System.out.println("a | b = " + (a | b) + " (Binary: " + Integer.toBinaryString(a | b) + ")");
        System.out.println("a ^ b = " + (a ^ b) + " (Binary: " + Integer.toBinaryString(a ^ b) + ")");
        System.out.println("a << 1 = " + (a << 1) + " (Binary: " + Integer.toBinaryString(a << 1) + ")");
        System.out.println("a >> 1 = " + (a >> 1) + " (Binary: " + Integer.toBinaryString(a >> 1) + ")");
        sc.close();
	}

}
