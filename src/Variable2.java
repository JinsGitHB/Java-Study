
public class Variable2 {
	
	public static void main(String[] args) {
		//int integer 정수
		int a = 1;
		System.out.println(a);
		a = 2;
		System.out.println(a);
		
		int ex_1 = 1+1;
		
		//double 실수
		double d = 1.23456789;
		System.out.println(d);
		
		//상수 constant - 변수처럼 지정이 가능하나 이후 변경이 불가
		final int c = 10;
		System.out.println(c);
		
		//리터럴 literal 일반적으로 사용하는 '상수'라는 단어를 자바에서는 리터럴이라 칭한다 (상수라는 개념이 이미 정의 됐기 때문)
		
		//ex. year 변수 2021 리터럴 thisYear 상수
		int year = 2021;
		final int thisYear = 2082;
		
		//char character 문자 ('' 작은따옴표 사용) ** 작은 따옴표 안에는 반드시 하나의 문자가 필요함.
		char ch = 'e';
		
		//String 문자열 ("" 큰따옴표 사용)
		String str = "hi";
		
		//tmp temporary 임시의 값을 저장하기 위한 변수
		int q = 2,p = 4;
		System.out.println("q = " + q); // a = 2
		System.out.println("p = " + p); // b = 4
		
		int tmp;
		tmp = q; // 1. q의 값을 tmp에 저장
		q = p; // 2. p의 값을 q에 저장
		p = tmp; // 3. tmp의 값을 y에 저장
		
 		System.out.println("q="+q);  // q = 4
 		System.out.println("p="+p);  // p = 2
 		
 		// primitive type 기본형 변수 (boolean, char, byte, short, int, long, float, double) 
 		// 계산을 위한 실제 값 저장
 		// reference type 참조형 변수 (8개의 기본형 변수를 제외한 나머지) 
 		// 객체의 주소를 저장
		
	}
}
