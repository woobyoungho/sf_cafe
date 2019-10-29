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
}
