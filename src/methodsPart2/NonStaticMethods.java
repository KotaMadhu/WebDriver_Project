package methodsPart2;

public class NonStaticMethods {
	int a,b,c;
	public void addition()
	{
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
	public void division()
	{
		a=50;
		b=5;
		c=a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		NonStaticMethods obj=new NonStaticMethods();
		obj.addition();
		obj.division();				

	}

}
