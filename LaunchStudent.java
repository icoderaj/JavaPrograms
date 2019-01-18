class Student 
{
	String name;
	int roll;
	int marks;
	String school;

	void play()
	{
		System.out.println("Student is playing");

	}

	void study()
	{
		System.out.println("Student is studying");
	}

	void exam()
	{
		System.out.println("Student is giving exam");
	}

	void cycling()
	{
		System.out.println("Student is riding cycle");
	}
}

class LaunchStudent
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		s1.play();
		s2.cycling();
		
		new Student().exam();
		
		s2.study();
		s1.exam();

		new Student().exam();
		//HOW????

		new Student().play();
		new Student().study();

	}
}
