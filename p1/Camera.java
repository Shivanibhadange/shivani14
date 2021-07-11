package p1;

public class Camera {
	int power;
	String bluetooth;
	public Camera(String bt, int pw)
	{
		power=pw;
		bluetooth=bt;
	}
	public void getpower()
	{
		power=-20;
		System.out.println("Camera power" +power);
	}
}
