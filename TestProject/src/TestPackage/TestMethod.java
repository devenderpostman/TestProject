package TestPackage;

public class TestMethod {
	int x, y,z;
	
	void m1(int a, int b, int c )
	{
		x=a;
		y=b;
		z=c;
		
		System.out.println("x= "+x +" y= "+y+ " z= "+z);
	}
	
	public void maximum()
		{
		if(x==y && y==z)
		{
			System.out.println("All are equal");
		}
		else
		if(x>y && x>z)
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
		
		TestMethod cons=new TestMethod();
		cons.m1(10,20,30);
		cons.maximum();
		
	}

}
