package com.fis.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.fis.app.exce.NoDeviceFoundException;
import com.fis.app.model.ElectronicDevice;

public class ElectronicDAOImp implements IElectronicsDeviceDAO{
	
	Connection con = null;

	String insertDeviceQuery = "insert into fisapp.electronic values(?,?,?,?,?,?)";
	String selectAllDevice = "select * from fisapp.electronic";
	String selectDevicesBasedOnBrandNameAndType = "select * from fisapp.electronic where DeviceType = ? and BrandName = ?";

	@Override
	public boolean addDevice(ElectronicDevice device) throws Exception{

		con = DatabaseUtil.getConnection();
		boolean isInserted = false;
		if (con != null) {

			// Step1 : extract device details from e object
			int id = device.getDeviceId();
			String type = device.getDeviceType();
			String brand = device.getBrandName();
			int cost= device.getCost();
			int power=device.getPower();
			String color = device.getColor();

			// Step 2 :- write the code to create complete insert Query with data
			PreparedStatement ps = con.prepareStatement(insertDeviceQuery);
			ps.setInt(1, id);
			ps.setString(2, type);
			ps.setString(3, brand);
			ps.setInt(4,cost);
			ps.setInt(5, power);
			ps.setString(6, color);
			

			// Step 3 : execute Query
			int i = ps.executeUpdate(); // only works with insert , update & delete

			if (i > 0)
				isInserted = true;

		}

		return isInserted;
	}
	
	@Override
	public List<ElectronicDevice> getAllDevices() throws Exception {
		con = DatabaseUtil.getConnection();
		List<ElectronicDevice> deviceList = new ArrayList<>();
		if (con != null) {

			PreparedStatement ps = con.prepareStatement(selectAllDevice);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ElectronicDevice temp = new ElectronicDevice(); // default device

				temp.setDeviceId(rs.getInt(1));
				temp.setDeviceType(rs.getString("DeviceType"));
				temp.setBrandName(rs.getString("BrandName"));
				temp.setCost(rs.getInt("Cost"));
				temp.setPower(rs.getInt("Power"));
				temp.setColor(rs.getString("Color"));
				
				

				deviceList.add(temp);
			}

		}
		return deviceList;
	}
	
	@Override
	public ElectronicDevice getDevicesBasedOnBrandNameAndType(String type,String brandName) throws Exception {
		con = DatabaseUtil.getConnection();
		ElectronicDevice e = null;
		if (con != null) {

			PreparedStatement ps = con.prepareStatement(selectDevicesBasedOnBrandNameAndType);
			ps.setString(2, type);
			ps.setString(3, brandName);

			ResultSet rs = ps.executeQuery();
			boolean isFound = false;
			while (rs.next()) {
				isFound = true;
				ElectronicDevice temp = new ElectronicDevice(); // default emp,

				temp.setDeviceId(rs.getInt(1));
				temp.setDeviceType(rs.getString("DeviceType"));
				temp.setBrandName(rs.getString("BrandName"));
				temp.setCost(rs.getInt("Cost"));
				temp.setPower(rs.getInt("Power"));
				temp.setColor(rs.getString("Color"));
				
				e = temp;
			}

			if (!isFound)
				throw new NoDeviceFoundException(type,brandName);

			
		}
		return e;
	}

	@Override
	public ElectronicDevice changeDevicePrice(int deviceId, int newPrice) throws NoDeviceFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ElectronicDevice changeDeviceRating(int deviceId, int newRating) throws NoDeviceFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteDevice(int deviceId) throws NoDeviceFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List getSumofPriceBasedOnType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	/*@Override
	public boolean deleteEmployee(int id) throws SQLException, EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}*/


}
