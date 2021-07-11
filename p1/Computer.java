package p1;

public class Computer extends Electronics{
	int power;
	public Computer(int pw)
	{
		power=pw;
	}
	public void getpower()
	{
		power=-10;
		System.out.println("Computer power" +power);
	}
}
