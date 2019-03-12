package osf.food;

import java.util.HashMap;
import java.util.Map;

import osf.food.controller.FoodController;
import osf.food.dao.FoodDAO;
import osf.food.dao.impl.FoodDAOImpl;
import osf.food.vo.FoodVO;

public class Execute {
	private FoodController fc = new FoodController();
	
	
	public static void main(String[] args) {
		FoodDAO fdao = new FoodDAOImpl();
		Map<String, String> req = new HashMap<>();
		Map<String, Object> res = new HashMap<>();
		Execute e = new Execute();
		
		try {
//			req.put("cmd", "list");
//			e.fc.doGet(req, res);
//			System.out.println(res);
//			
//			req=new HashMap<>();
//			res=new HashMap<>();
//			req.put("cmd", "food");
//			req.put("foodNum", "1");
//			e.fc.doGet(req, res);
//			System.out.println(res);
			
//			req=new HashMap<>();
//			res=new HashMap<>();
//			req.put("cmd", "insert");
//			req.put("foodName", "카라멜");
//			req.put("foodPrice", "2000");
//			e.fc.doPost(req, res);
			
//			req=new HashMap<>();
//			res=new HashMap<>();
//			req.put("cmd", "update");
//			req.put("foodName", "곱창");
//			req.put("foodNum", "4");
//			req.put("foodPrice", "20000");
//			e.fc.doPost(req, res);
//			System.out.println(res);
			
//			req=new HashMap<>();
//			res=new HashMap<>();
//			req.put("cmd", "delete");
//			req.put("foodNum", "1");
//			e.fc.doPost(req, res);
			req=new HashMap<>();
			res=new HashMap<>();
			req.put("cmd", "list");
			e.fc.doGet(req, res);
			System.out.println(res);

			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
		
			

		
		
	}
}
