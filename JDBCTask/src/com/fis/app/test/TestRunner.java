package com.fis.app.test;


import java.util.List;

import com.fis.app.dao.ElectronicDAOImp;
import com.fis.app.dao.IElectronicsDeviceDAO;
import com.fis.app.model.ElectronicDevice;


public class TestRunner{

			public static void main(String[] args) {
			
			try {
				
				// Animal a = new Dog();
				IElectronicsDeviceDAO dao = new ElectronicDAOImp();
				
				/*ElectronicDevice elec = new ElectronicDevice(04,"Laptop2","HP", 80000,4500,"gray");
				
				boolean a = dao.addDevice(elec);
				System.out.println(a);
			*/
				
				
				List<ElectronicDevice> list = dao.getAllDevices();
				
				list.stream().forEach((e1)->System.out.println(e1));
							
				//ElectronicDevice e = dao.get(1114);
				//System.out.println(e);
		
				
			} catch (Exception e) {
				System.out.println(" Problem "+e);
			}
		}
	}
