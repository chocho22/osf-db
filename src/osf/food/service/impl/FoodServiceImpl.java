package osf.food.service.impl;

import java.util.ArrayList;
import java.util.List;

import osf.food.dao.FoodDAO;
import osf.food.dao.impl.FoodDAOImpl;
import osf.food.service.FoodService;
import osf.food.vo.FoodVO;

public class FoodServiceImpl implements FoodService {
	private FoodDAO fdao = new FoodDAOImpl();
	@Override
	public List<FoodVO> selectFoodList(FoodVO food) {
		//
		return fdao.selectFoodList(food);
	}
	@Override
	public FoodVO selectFood(Integer foodNum) {
		// TODO Auto-generated method stub
		return fdao.selectFood(foodNum);
	}
	@Override
	public int updateFood(FoodVO food) throws Exception {
		List<FoodVO> tmpFoodList = fdao.selectFoodList(food);
		List<String> list = new ArrayList<>();
		for(FoodVO fvo : tmpFoodList) {
			list.add(fvo.getFoodName());
		}
		if (list.indexOf(food.getFoodName()) != -1) {
			throw new Exception("이름 중복!!!");
		}
		return fdao.updateFood(food);
	}
	@Override
	public int deleteFood(FoodVO food) throws Exception {
		FoodVO tmpFood = fdao.selectFood(food.getFoodNum());
		if(tmpFood==null) {
			throw new Exception("이미 삭제된 음식입니다. ");
		}
		return fdao.deleteFood(food);
	}
	@Override
	public int insertFood(FoodVO food) throws Exception {
		List<FoodVO> tmpFoodList = fdao.selectFoodList(food);
		if (tmpFoodList.size() != 0) {
			throw new Exception("중복!!!");
		}
		return fdao.insertFood(food);
	}
	
	
	public static void main(String[] args) {
		FoodService fs = new FoodServiceImpl();
		List<FoodVO> foodList = fs.selectFoodList(null);
		System.out.println(foodList);
		FoodVO food = new FoodVO();
		food.setFoodName("족발");
		foodList = fs.selectFoodList(food);
		System.out.println(foodList);
		
//		food.setFoodNum(3);
//		food.setFoodName("족발아이스크림");
//		food.setFoodPrice(30000);
//		int cnt =0;
//		try {
//			cnt = fs.updateFood(food);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("수정 건 수 : ");
//		try {
//			int cnt = fs.insertFood(food);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		food = new FoodVO();
		food.setFoodNum(3);
		try {
			int cnt1 = fs.deleteFood(food);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
