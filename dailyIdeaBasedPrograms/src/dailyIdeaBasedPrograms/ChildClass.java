package dailyIdeaBasedPrograms;

public class ChildClass extends ParentClass {
	int s;

	public ChildClass() {
//		super();
		System.out.println("print the x "+s);
	}
	void show() {
		System.out.println("after overridden");
	}
	public void display() {
		System.out.println("child method");
	}

}
