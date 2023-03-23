package TestPackage;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNum {
	
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int i=0;
		int [] arr=new int [n];
		while(i<n)
		{
			arr[i]=Integer.parseInt(scan.nextLine());
			i++;
		}
	    System.out.println("Missing Number is ="+findMissing(arr,n));

}
	public static int findMissing(int arr[],int n)
	{
		Arrays.sort(arr);
		int misNum=arr[0];
		for(int i=0;i<n;i++)
		{
			if(misNum!=arr[i])
			{
			return misNum;	
			}
			else
				misNum++;
		}
		return -1;
		
	}
} // test github
