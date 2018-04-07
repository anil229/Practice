package dailyIdeaBasedPrograms;

public class SingleTon {
	int singleton;
   private SingleTon() {}
	private static SingleTon obj;
	static {
		obj=new SingleTon();
	}
	public static SingleTon getObj() {
		return obj;
	}
	

}
