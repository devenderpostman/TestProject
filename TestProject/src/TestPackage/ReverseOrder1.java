package TestPackage;

import java.util.Arrays;

import javax.print.attribute.standard.PrinterLocation;

public class ReverseOrder1 {

public static void main (String args[])
{
	String str= "Welcome";
	int strlength=str.length();
	String revstr[]=new String[strlength];
	int j=0;

for(int i=strlength;i>0;i--)
{
	
	revstr[i-1]=Character.toString(str.charAt(j));	
	System.out.println("revstr["+(i-1)+"]"+revstr[strlength-(j+1)]);
	j=j+1;
}
String delimiter = "";
 String arrstr = String.join(delimiter, revstr); // Reverse String= emocleW

 //String arrstr = Arrays.toString(revstr); // Reverse String= [e, m, o, c, l, e, W]

System.out.println("Reverse String= "+arrstr);

}
}
