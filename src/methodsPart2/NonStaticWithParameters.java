package methodsPart2;

public class NonStaticWithParameters {
	
	public static void addition(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}

	public String verify_String(String str1,String str2)
	{
		String res;
		if(str1.equalsIgnoreCase(str2)) {
			res="Both Strings are Equal";
		}
		else {
			res="Both Strings are not Equal";
		}
		return res;
	}
	public boolean compare_Values(int a,int b) {
		if(a==b) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		NonStaticWithParameters obj=new NonStaticWithParameters();
		String a=obj.verify_String("Hi Madhu", "Hi Darling");
		System.out.println(a);
		System.out.println(obj.compare_Values(10, 10));
		
		NonStaticWithParameters.addition(20, 25);
				

	}

}
