package TestPackage;

import java.util.ArrayList;
import java.util.List;

public class NotMatchWithFirstList {

	public static void main(String[] args) {
		//first array list  
		ArrayList<String> firstList=new ArrayList<String>();  
		
		//adds elements to the arraylist  
		firstList.add("Apple");  
		firstList.add("Pears");  
		firstList.add("Guava");  
		firstList.add("Mango");  
		
		System.out.println(firstList);  
		
		
		//second array list      
		List<String> secondList=new ArrayList<String>();  
		
		//adds elements to the arraylist  
		secondList.add("Apple");  
		secondList.add("Pears");  
		secondList.add("Papaya");  
		secondList.add("Mango");  
		
		System.out.println(secondList);  
		
        secondList.removeAll(firstList);
		
      //prints the element of second list which does not match with the element of the first list  

		System.out.println(secondList);  
		}  
		  
	}


