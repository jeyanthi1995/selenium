package Abstract1;

public class Abs1 extends Abs2{
	public void add()
	{
		System.out.println("addition");
	}
	public void sub()
	{
		System.out.println("subtraction");
	}
	public static void main(String[] args) {
		Abs1 a = new Abs1();
		a.add();
		a.sub();
		a.we();
		
	}

}
