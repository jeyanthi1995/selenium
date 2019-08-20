package Java;

public class Tech extends Students {
	public void add() {
System.out.println("Child class");
	}
	public static void main(String[] args) {
		Tech t=new Tech();
		t.add();
		Students s=new Students();
		s.add();
		t.sub();
	}
}