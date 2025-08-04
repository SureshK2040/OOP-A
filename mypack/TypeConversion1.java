package mypack;
import java.util.*;
public class TypeConversion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();
        int n = (int) d;
        System.out.println("double value: " + d);
        System.out.println("int value: " + n);
        sc.close();
	}

}
