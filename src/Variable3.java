
public class Variable3 {
	   
	public static void main(String[] args) {
		System.out.printf("age:%d",14); // 줄바꿈 x
		System.out.printf("age:%d%n",14); // %d = 14 , %n 줄바꿈
		
		// age:%d = 14 year:%d = 2016
		System.out.printf("age:%d year:%d%n", 14, 2016); 
		
		String url = "www.codingchobo";
		float f1 = .10f; 
		float f2 = 1e1f; // e 뒤에 소수점
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1=%f, %e, %g%n",f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n",f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n",f3, f3, f3);
		
		// %f 소수점 아래 6자리까지 출력 7자리부터 반올림 
		// %e 지수형태로 출력
		// %g 값을 간략하게 표현할때 사용
		
		System.out.printf("d=%14.10f%n", d);
		
		// %전체자리.소수점아래자리f * 앞자리 빈자리는 0으로 채움
		// %전체14자리.소수점아래10자리f 
		// 출력 d =   1.2345678900 
		
		System.out.printf("[%s]%n", url);
		System.out.printf("[%25s]%n", url); 
		System.out.printf("[%-25s]%n", url); // 왼쪽 정렬
		System.out.printf("[%.7s]", url); //왼쪽에서 7글자만 출력
	}
}
