package dailyIdeaBasedPrograms;

public class Student  {
String name;
int age;
int cls;
public Student(String name, int age, int cls) throws LessAgeException  {
	try {
	this.name = name;
	this.age = age;
	this.cls = cls;
	if(age<12 && cls<=7) {
		throw new LessAgeException();
	}
	if(age<14 && cls<=9) {
		throw new LessAgeException();
	}
	if(age<17 && cls==12) {
		throw   new LessAgeException();
	}
		
	}finally {System.out.println("Go back \n");}
	
}
public String toString() {
	return "the student named "+name+" of age "+age+" is eligible to class "+cls;
	
}
}
