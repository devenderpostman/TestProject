package TestPackage;

public class ReverseOrder3 {

	public static void main(String[] args) {
		
		String str= "Welcome";    
		char ch[]=str.toCharArray();  
	    String rev="";  
	    
	    for(int i=ch.length-1;i>=0;i--)
	    {  
	        rev=rev+ch[i];  
	    }  
	    System.out.println("Reverse= "+rev);

	}  
	  
	
	}

