public class Dog extends Animal
{
	public String name;
	public int legs; 

	public Dog (String n, int l)
	{
		super(l);
		name = n;
		legs = l;
	}

	public String toString()
	{
		return name+ ", " + legs;
	}


}
