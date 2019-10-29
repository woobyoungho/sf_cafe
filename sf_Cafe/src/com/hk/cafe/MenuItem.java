package com.hk.cafe;

public class MenuItem {
	//private static int count;
	private final String menuName;
	private final int menuPrice;

	public MenuItem(String menuName, int menuPrice) {
		//count++;
		this.menuName = menuName;
		this.menuPrice = menuPrice;
	}
	
	//static 붙인 메소드는 final 변수 선언할 수 없다.
	//따라서 final 변수 사용안하면 그냥 static 메소드 생성 -> 속도 향상
	//밑에 주석 메소드는 count용
	/*
	public static void showCount() {
		System.out.println("count : " + count);
	}
	*/
	
	public String getMenuName() {
		return menuName;
	}
	
	public int getMenuPrice() {
		return menuPrice;
	}
	
	@Override
	public String toString() {
		return String.format("%s -> (%,d원)", menuName, menuPrice);
	}

}














