package com.fis.app.dao;

import java.util.List;

import com.fis.app.exce.NoDeviceFoundException;
import com.fis.app.model.ElectronicDevice;

public interface IElectronicsDeviceDAO {

	
	public boolean addDevice(ElectronicDevice device) throws Exception;
	public List<ElectronicDevice> getAllDevices() throws Exception;
	
	public ElectronicDevice changeDevicePrice(int deviceId,int newPrice)throws NoDeviceFoundException;
	public ElectronicDevice changeDeviceRating(int deviceId,int newRating)throws NoDeviceFoundException;
	
	public boolean deleteDevice(int deviceId)throws NoDeviceFoundException;
	
	public List<ElectronicDevice> getDevicesBasedOnBrandNameAndType(String type,String brandName);
	//public int countDeviceType(String type);
	public List getSumofPriceBasedOnType(String type);
	
	
	
}
