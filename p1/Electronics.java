package p1;

public class Electronics {
	int power,memory,weight,price;
	String bluetooth,brandName;
public Electronics()
{
	
}
Electronics(int power,int memory,int weight,String bluetooth,int price)
{
	this.power=power;
	this.memory=memory;
	this.weight=weight;
	this.bluetooth=bluetooth;
	this.price = price;
}
public String getBrandName() {
	return brandName;
}
public void setBrandName(String brandName) {
	this.brandName = brandName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

public int getPower() {
	return power;
}
public void setPower(int power) {
	this.power = power;
}
public int getMemory() {
	return memory;
}
public void setMemory(int memory) {
	this.memory = memory;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public String getBluetooth() {
	return bluetooth;
}
public void setBluetooth(String bluetooth) {
	this.bluetooth = bluetooth;
}
public void PowerInput()
{
	power=power*10;
	System.out.println("Power -"+power);
}
}
