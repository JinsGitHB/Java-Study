
public class Variable2 {
	
	public static void main(String[] args) {
		//int integer ����
		int a = 1;
		System.out.println(a);
		a = 2;
		System.out.println(a);
		
		int ex_1 = 1+1;
		
		//double �Ǽ�
		double d = 1.23456789;
		System.out.println(d);
		
		//��� constant - ����ó�� ������ �����ϳ� ���� ������ �Ұ�
		final int c = 10;
		System.out.println(c);
		
		//���ͷ� literal �Ϲ������� ����ϴ� '���'��� �ܾ �ڹٿ����� ���ͷ��̶� Ī�Ѵ� (������ ������ �̹� ���� �Ʊ� ����)
		
		//ex. year ���� 2021 ���ͷ� thisYear ���
		int year = 2021;
		final int thisYear = 2082;
		
		//char character ���� ('' ��������ǥ ���) ** ���� ����ǥ �ȿ��� �ݵ�� �ϳ��� ���ڰ� �ʿ���.
		char ch = 'e';
		
		//String ���ڿ� ("" ū����ǥ ���)
		String str = "hi";
		
		//tmp temporary �ӽ��� ���� �����ϱ� ���� ����
		int q = 2,p = 4;
		System.out.println("q = " + q); // a = 2
		System.out.println("p = " + p); // b = 4
		
		int tmp;
		tmp = q; // 1. q�� ���� tmp�� ����
		q = p; // 2. p�� ���� q�� ����
		p = tmp; // 3. tmp�� ���� y�� ����
		
 		System.out.println("q="+q);  // q = 4
 		System.out.println("p="+p);  // p = 2
 		
 		// primitive type �⺻�� ���� (boolean, char, byte, short, int, long, float, double) 
 		// ����� ���� ���� �� ����
 		// reference type ������ ���� (8���� �⺻�� ������ ������ ������) 
 		// ��ü�� �ּҸ� ����
		
	}
}
