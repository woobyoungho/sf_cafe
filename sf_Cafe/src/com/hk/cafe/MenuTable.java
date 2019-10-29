package com.hk.cafe;

import java.util.*;

public class MenuTable {
	// MenuItem 객체 주소값을 최소 4개 이상 저장할 수 있는 객체 생성!
	private List<MenuItem> menuList = new ArrayList<MenuItem>();

	public MenuTable() {
		init();
	}

	public void init() {
		menuList.add(new MenuItem("아메리카노", 1500));
		menuList.add(new MenuItem("카푸치노", 2000));
		menuList.add(new MenuItem("카라멜 마끼야또", 2500));
		menuList.add(new MenuItem("에스프레소", 2500));
	}

	public void showMenuList() {
		System.out.println("------< Menu >------");
		int i = 1;
		for (MenuItem mi : menuList) {
			System.out.printf("%d. %s\n", i++, mi);
		}
		System.out.println();
	}

	// 메뉴 선택
	public MenuItem selectMenu(int idx) {
		int targetIdx = idx - 1;
		if (targetIdx < 0 || targetIdx >= menuList.size()) {
			return null;
			// 반환형이 MenuItem이기 때문에 return null; 사용
			// 반환형이 void이면 return; 사용
		}
		return menuList.get(targetIdx);
	}

}
