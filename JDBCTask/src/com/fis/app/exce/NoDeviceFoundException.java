package com.fis.app.exce;

public class NoDeviceFoundException extends Exception {
	
private int id;
	
	public NoDeviceFoundException(String type,String brandName)
	{
		this.id = id;
	}
	
	public String toString()
	{
		return "Invalid Device"+id;
	}


}
