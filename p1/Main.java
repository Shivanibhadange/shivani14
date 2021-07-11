package p1;

public class Main {
	public static void main(String args[])
	{
		Laptop lp=new Laptop(400);
		Computer cm=new Computer(300);
		Camera ca=new Camera("XYZ",50);
		
		lp.getpower();
		cm.getpower();
		ca.getpower();
		
		
		System.out.println("  ");
	}

}
