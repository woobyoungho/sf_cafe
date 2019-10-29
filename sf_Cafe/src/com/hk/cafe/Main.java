package com.hk.cafe;

public class Main {
	public static void main(String[] args) {
		MenuTable mt = new MenuTable();
		Customer cust = new Customer();
		Baristar br = new Baristar();
		
		MenuItem mi = cust.order(mt);
		
		if(mi != null) {
			System.out.println("주문한 커피 : "+ mi.getMenuName());
			Coffee coffee = br.makeCoffee(mi);
			cust.drink(coffee);
		}
		System.out.println("종료한다.");
	}
}
