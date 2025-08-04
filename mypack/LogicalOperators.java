package mypack;
import java.util.*;
public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int n1 = 3; 
        final int n2 = 5;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if ((num % n1 == 0) && (num % n2 == 0)) {
            System.out.println(num + " is divisible by both 3 and 5");
        } else {
            System.out.println(num + " is not divisible by both 3 and 5");
        }
        sc.close();
	}

}
