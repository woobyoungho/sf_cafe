package com.hk.cafe;

public class Baristar {

	public Coffee makeCoffee(MenuItem mi) {
		
		CaramelMakkiaTto caramel = new CaramelMakkiaTto(mi);
		Espresso espre = new Espresso(mi);
		Americano ameri = new Americano(mi);
		Cappuchino cappu = new Cappuchino(mi);
		//클래스를 객체로 가져오는 것
		 
		if (mi.getMenuName() == "카라멜 마끼야또") {
			return caramel;
		} else if(mi.getMenuName() == "에스프레소") {
			return espre;
		} else if(mi.getMenuName() == "아메리카노") {
			return ameri;
		} else {
			return cappu;
		}
		
		
		/*
		switch (mi.getMenuName()) {
		case "카라멜 마끼야또":
			return new CaramelMakkiaTto(mi);
		case "에스프레소":
			return new Espresso(mi);
		case "아메리카노":
			return new Americano(mi);
		case "카푸치노":
			return new Cappuchino(mi);
		default:
			return null;
		}
		*/
	}
}
