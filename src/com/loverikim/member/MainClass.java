package com.loverikim.member;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
		Member member1 = new Member();		
		member1.setId("tiger");		
		member1.setName("홍길동");
		member1.setPw("12345");
		member1.setEmail("hong@abc.com");
		member1.setAge(27);
		
//		member1.id = "tiger";
//		member1.pw = "12345";
//		member1.name = "홍길동";
//		member1.email = "hong@abc.com";
//		member1.age = 27;
		
		Member member2 = new Member();
		member2.setId("lion");
		member2.setName("이순신");
//		member2.id = "lion";
//		member2.pw = "67894";
//		member2.name = "이순신";
//		member2.email = "lee@abc.com";
//		member2.age = 33;
		
		Member member3 = new Member("cat","88888","김유신","white@abc.com", 37);
		// 생성자를 사용하여 초기화
		
//		
		System.out.println("회원1ID: "+member1.getId());
		System.out.println("회원1이름: "+member1.getName());
		System.out.println("회원1나이: "+member1.getAge());
		System.out.println(" ");
		
		System.out.println("회원2ID: "+member2.getId());
		System.out.println("회원2이름: "+member2.getName());		
//		System.out.println("회원2: "+member2.name);
		System.out.println(" ");
		
		System.out.println("회원3email: "+member3.getEmail());
		// 		
	}

}
