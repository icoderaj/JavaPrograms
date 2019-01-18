class Dog 
{
	//A class has certain properties
	String name;
	String breed;
	int cost;
	String colour;

	//A class exhibit certain behaviours
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

//Program will execute if main() is present inside Dog class but the main() will have no meaning as a behaviour of Dog class
//Hence we have declared main() in another class => the file name should be same as the class name containing main() as the execution begins from main()
class LaunchDog
{
	public static void main(String args[])
	{
		//new operator will make JVM create an object of the given class
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		//many objects with unique names can call behaviours
		d1.sleep();
		d2.bark();
		d1.eat();
		d2.sleep();
		
		//An anonymous object
		new Dog().eat();
	}
}

