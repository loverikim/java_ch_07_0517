package com.loverikim.test;

import java.util.Calendar;
import java.util.spi.CalendarNameProvider;

import com.loverikim.exer.TestPublic;

//import com.loverikim.exer.*; 전체를 불러올 때

//패키지를 import
import com.loverikim.exer.Worker;//자동 생성시에 알아서 자동으로 뜸.

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다른 패키지에 있는 클래스를 불러올 때는 자동완성을 사용하라.
		Worker worker1 = new Worker();
		
		Calendar calender;
		
		CalendarNameProvider calendarNameProvider;
		
		CalendarNameProvider calendarNameProvider2;
		
		TestPublic testPublic = new TestPublic();
		
		testPublic.name = "홍길동";
//		testPublic.hobby = "영화감상"; //private멤버변수(필드)로 만들었기 때문에 사용 불가능.
	}

}
