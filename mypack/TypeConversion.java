package mypack;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int num= 243;
		    long l = num;
		    float deci =l;
		    System.out.println("Original value:"+num);
		    System.out.println("Converted to long:"+l);
		    System.out.println("Converted to float:"+deci);
		    if(deci==num) {
		      System.out.println("No data is lost");
		    }
		    else {
		      System.out.println("Data is lost");
		    }
		   
	}

}
