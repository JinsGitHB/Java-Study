import java.util.Scanner; // 1. import문 사용
public class Variable4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 2. Scanner 클래스 객체 생성
		
		System.out.printf("두자리 정수를 하나 입력해주세요>");
		String input = sc.nextLine(); // 입력받은 내용을 input 저장
		int num = Integer.parseInt(input); // 입력받은 내용을 int 타입의 값으로 변환
		
		System.out.println("입력내용 :"+ input); // 입력받은 문자열을 숫자로 변환
		System.out.printf("num=%d%n", num);
		
	}
}
