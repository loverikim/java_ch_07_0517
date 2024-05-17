package com.loverikim.exer;

public class TestPublic {
	// 내,외부 패키지에서 클래스 자유롭게 사용 가능
	// public에서 private로 변경하면 출력되는 오류
	//Illegal modifier for the class TestPublic; only public, abstract & final are permitted

	public String name; // 어느 곳에서나 사용가능
	private String hobby = "영화감상"; // 해당 클래스 안에서만 사용가능한 멤버변수
	
	public void pringName() {
		System.out.println(hobby); // 내부에서만 사용하기 때문에 보안 안전함.
	}
	
	
	


}
