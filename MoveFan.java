class Fan
{
	String brand;
	int price;
	String colour;
	String type;

	void state()
	{
		System.out.println("The fan is in ON state");
	}

	void spin()
	{
		System.out.println("The fan is spinning to and fro");
	}

	
}

class MoveFan 
{
	public static void main(String[] args) 
	{
		Fan f1 = new Fan();

		new Fan().spin();

		Fan f2 = new Fan();

		f1.state();
		f2.spin();

		new Fan().state();
	}
}
