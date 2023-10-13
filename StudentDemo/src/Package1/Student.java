package Package1;

public class Student {
	int rollno;
	int age;

	public void display1()
	{
	
		System.out.println("Welcome to all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	
	}
	public static void main(String[] args)
	{
		Student obj=new Student();
		obj.display1();
		obj.display2();
		obj.rollno=12;
		obj.age=24;
		System.out.println(obj.rollno);
		System.out.println(obj.age);
		
	}
	

}
