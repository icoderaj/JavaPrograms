class Dog 
{
	//has properties
	String name;
	String breed;
	int cost;
	String colour;

	//does behaviours
	void bark()
	{
		System.out.println("Dog is barking.");
	}

	void sleep()
	{
		System.out.println("Dog is sleeping.");
	}

	void eat()
	{
		System.out.println("Dog is eating");
	}

}

class LaunchDog
{
	public static void main(String args[])
	{
		Dog d1 = new Dog();
		Dog d2 = new Dog();

		d1.sleep();
		d2.bark();
		d1.eat();
		d2.sleep();
		
		//Only 1 anonymous object
		new Dog().eat();
	}
}

