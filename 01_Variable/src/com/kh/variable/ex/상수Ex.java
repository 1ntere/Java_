package com.kh.variable.ex;
		//   VariableEx4 => 상수Ex
public class 상수Ex {
	// 메인 메서드 : 자바 프로그램 실행하는 구문
	public static void main(String[] args) {
		// 상수 : 한 번 값을 기록하면 값을 바꿀 수 없는 변수
		// 상수 키워드 : final
		
		// 상수명 작성 : 대문자로 작성, 연결되는 단어 사이는 _ 로 구분
		// 상수를 대문자로 표기하는 것은 자바에서 개발자 간의 규칙
		
		final double PI = 3.1415926535;
		// final이 없이 double pi = 3.1415926535; 일때는 pi가 변수
		// pi가 나중에 변할 수 있음
		// final double PI = 3.1415926535;로 하면
		// PI는 변하지 않는 상수라는 의미
		System.out.println("상수로 표기한 PI : "+PI);
		
		final int MIN = 0;
		final int MAX = 100;
		// MIN은 최소값, MAC는 최대값
		
		// 상수로 지정된 값을 변경하려 하면 에러가 발생
		
		// 상수 final을 사용해서 String으로 "Hello World" 넣어보기
		// 우리 회사에 들어오는 사람들 한테는 Hello World 문구로 보여주고
		// 출력되는 문구가 변경되지 않게 하고 싶을 때
		final String GREETING = "Hello World";
		System.out.println(GREETING);
	}

}
