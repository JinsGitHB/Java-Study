import java.util.Scanner; // 1. import�� ���
public class Variable4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 2. Scanner Ŭ���� ��ü ����
		
		System.out.printf("���ڸ� ������ �ϳ� �Է����ּ���>");
		String input = sc.nextLine(); // �Է¹��� ������ input ����
		int num = Integer.parseInt(input); // �Է¹��� ������ int Ÿ���� ������ ��ȯ
		
		System.out.println("�Է³��� :"+ input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		System.out.printf("num=%d%n", num);
		
	}
}
