package p1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//import day2.Accountant;
//import day2.Developer;
//import day2.Employee;
//import day2.Project;

public class MainMapDemo {
		
		public static void main(String[] args) {
			
			//Camera c1 = new Camera("XYZ",100);
		//	Camera c2 = new Camera("ABC",200);
			//Camera c3 = new Camera("PQR",300);
			
			Map<String, List<Electronics>> elecMap = new HashMap<>();
			
			Electronics e1 = new Electronics(110,32,10,"ABC",10000);
			Electronics e2 = new Electronics(111,64,11,"ABC",20000);
			Electronics e3 = new Electronics(113,126,12,"ABC",30000);
						
			List<Electronics> cList = new ArrayList<>();
			cList.add(e1);
			cList.add(e2);
			cList.add(e3);
	
			
			
			
			
			elecMap.put("STR", cList);
			
			
		
			
			Iterator<String> itr = elecMap.keySet().iterator();
			
			while(itr.hasNext())
			{
				
				String ProductName = itr.next();
				
				
				if(ProductName.equals("STR"))
				{
					List<Electronics> product = elecMap.get(ProductName);
					
					for (Electronics device : product) 
					{
						if(device.getPrice()>=5000 && device.getPrice()<=8000)
						{
							System.out.println(device.brandName);
						}
					}
				}
			}
			
		}//end of main
		
		
}

