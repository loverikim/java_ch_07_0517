package com.loverikim.member;

public class Member {// 회원 1명을 담을 수 있는 자료구조 -> class 
	// 회원 한명당 id, pw, name, email, age 필드5개를 가지고 있는 구조
	// box 역할을 함
	//**** DTO(Data Transfer Object) 클래스 VO(Value Object) 클래스 ****	
	
	//------------------ 직접 작성 ---------------------------
	private String id;
	private String pw;
	private String name;
	private String email;
	private int age;	
	
//	public String id;
//	public String pw;
//	public String name;
//	public String email;
//	public int age;	
	
	// 위의 코드는 마음대로 수정할 수도 있음.
	// 접근이 안되게 감추어 놔야 함. 맘대로 수정이 불가능 하도록 --> 안전
	// 하지만 이렇게 해놓으면 숨겨놨기 때문에 쓸 수 없음.
	// --> 이럴 때 사용하는 것이 Getter와 Setter --> valueObject DTO(Date Transfer Object)
	
	public Member() {		
		super();
	}	
	
	
	//-------------------------- 생성자 ----------------------
	// 자동생성기능 source	
	public Member(String id, String pw, String name, String email, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	//--------------------- Getter, Setter -----------------
	// 자동생성기능 source
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}		
	
	
//	// Setter 세터
//	public void setId(String id) {
//		this.id = id;
//	}
//	
//	// Getter 세터
//	public String getId() {
//		return this.id;
//	}	
	
	

}
