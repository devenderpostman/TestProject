package TestPackage;

import java.util.ArrayList;
import java.util.List;

public class CommonUncommon {

	public static void main(String[] args) {
		//first array list  
		ArrayList<String> firstList=new ArrayList<String>();  
		
		//adds elements to the arraylist  
		firstList.add("1");  
		firstList.add("2");  
		firstList.add("3");  
		firstList.add("4"); 
		firstList.add("5");
		firstList.add("6");
		
		System.out.println("First List= "+firstList);   //First List= [1, 2, 3, 4, 5, 6]
		
		
		//second array list      
		List<String> secondList=new ArrayList<String>();  
		
		//adds elements to the arraylist  
		secondList.add("1");  
		secondList.add("2");  
		secondList.add("3");  
		secondList.add("4");  
		secondList.add("7");
		System.out.println("Second List= "+secondList);  //Second List= [1, 2, 3, 4, 7]

		
			
		//prints the Common element of the both the list:
		 firstList.retainAll(secondList);
		 System.out.println("Common element in both the list ="+firstList); //Common element in both the list =[1, 2, 3, 4]

		 
		 //Count of common elements
		 System.out.println("Count of common elements= "+firstList.size()); //Count of common elements= 4
		 
		 //prints the Un-common element of the first list:
		 firstList.add("5");
		 firstList.add("9");
		 System.out.println("After add to first list= "+firstList);  //After add to first list= [1, 2, 3, 4, 5, 59]

		 firstList.removeAll(secondList);
		 System.out.println("Un-common element of the first list= "+firstList); //Un-common element of the first list= [5, 59]

		
		}  
		  
	}


