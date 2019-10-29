package com.hk.cafe;

import java.util.Scanner;

public class Customer {
	private Scanner sc = new Scanner(System.in);

	public MenuItem order(MenuTable mt) {
		MenuItem result = null;

		mt.showMenuList();
		System.out.print("메뉴를 선택하세요 : ");
		int menuSelect = sc.nextInt();

		result = mt.selectMenu(menuSelect);

		return result;
	}

	public void drink(Coffee coffee) {
		/*
		if (coffee.getName() == null) {
			System.out.println("고객이 선택한 음료가 없다.");
		} else{
			System.out.println("<고객이 " + coffee.getName() + "을 마신다.>");
		}
		*/
		
		if (coffee == null) {
			System.out.println("고객이 선택한 음료가 없다.");
			return;
		}
		System.out.println("<고객이 " + coffee.getName() + "을 마신다.>");
	}
}
