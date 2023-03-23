package TestPackage;


public class ReverseOrder2 {

	public static void main(String[] args) {
		String str= "Welcome";
		StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	   // System.out.println("Reverse= "+sb); // is also correct

	    String rev= sb.toString(); 
	    System.out.println("Reverse= "+rev);

	}

}
