package com.hk.cafe;

public class Coffee {
	private final String name;
	//생성자 특징
	//1. 리턴타입이 없다.
	//2. 클래스 명과 똑같다.
	
	//MenuItem 객체 주소값을 받는 생성자를 만든다.
	//MenuItem에 들어있는 메뉴명값을 name에 복사해주는 기능이 있는 생성자
	public Coffee(MenuItem mtName) {
		//super();
		//coffee의 부모 클래스는 오브젝트 클래스이기 때문에
		//굳이 super(); 쓰지 않아도 된다.
		this.name = mtName.getMenuName();
	}
	
	public String getName() {
		return name;
	}
}
