package TestPackage;

public class TestConstructor {
	int x, y,z;
	
	TestConstructor(int a, int b, int c )
	{
		x=a;
		y=b;
		z=c;
		
		System.out.println("x= "+x +" y= "+y+ " z= "+z);
	}
	
	public void maximum()
		{
		if(x>=y && x>=z)
		{
			System.out.println("X is greater");
		}
		else 
		if(y>x && y>z)
		{
			System.out.println("Y is greater");

		}
		else 
			{
				System.out.println("Z is greater");

			}
}
	public static void main(String args[])
	{
		
		System.out.println("Welcome to TestProject");
		
		TestConstructor cons=new TestConstructor(10,20,30);
		cons.maximum();
		
	}

}
