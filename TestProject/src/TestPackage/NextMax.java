package TestPackage;

import java.util.Arrays;
import java.util.Scanner;

public class NextMax {
	
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
	    System.out.println("Second Highest Number is ="+findMissing(arr,n));

}
	public static int findMissing(int arr[],int n)
	{
		Arrays.sort(arr);
		int misNum=arr[n-2];
		for(int i=n-1;i>0;i--)
		{
			if(misNum>arr[i])
			{
			return misNum;	
			}
			/*else
				return -1;*/
		}
		return -1;
		//return misNum;
		
	}
}
