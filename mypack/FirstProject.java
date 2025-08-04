package mypack;
import java.util.*;

public class FirstProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
        String name = sc.next();
        int No = sc.nextInt();
        int age= sc.nextInt();
        float per = sc.nextFloat();
        char gender = sc.next().charAt(0);
        
        System.out.println("Name: "+ name);
        System.out.println("Roll No: "+ No);
        System.out.println("Age: "+ age);
        System.out.println("Percentage: "+ per);
        System.out.println("Gender: "+  gender);
        sc.close();
	}

}
