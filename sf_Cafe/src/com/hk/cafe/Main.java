package com.hk.cafe;

public class Main {
	public static void main(String[] args) {
		MenuTable mt = new MenuTable();
		Customer cust = new Customer();
		
		MenuItem mi = cust.order(mt);
		if(mi != null) {
			System.out.println("주문한 커피 : "+ mi.getMenuName());
		}
		System.out.println("종료한다.");
	}
}
