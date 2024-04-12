package methodsPart2;

public class StaticMethods {
	static int x,y,z;
	public static void multiplication()
	{
		x=20;
		y=30;
		z=x*y;
		System.out.println(z);
	}
	public static void substraction()
	{
		x=100;
		y=25;
		z=x/y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		StaticMethods.multiplication();
		StaticMethods.substraction();
	}

}
