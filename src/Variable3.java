
public class Variable3 {
	   
	public static void main(String[] args) {
		System.out.printf("age:%d",14); // �ٹٲ� x
		System.out.printf("age:%d%n",14); // %d = 14 , %n �ٹٲ�
		
		// age:%d = 14 year:%d = 2016
		System.out.printf("age:%d year:%d%n", 14, 2016); 
		
		String url = "www.codingchobo";
		float f1 = .10f; 
		float f2 = 1e1f; // e �ڿ� �Ҽ���
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1=%f, %e, %g%n",f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n",f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n",f3, f3, f3);
		
		// %f �Ҽ��� �Ʒ� 6�ڸ����� ��� 7�ڸ����� �ݿø� 
		// %e �������·� ���
		// %g ���� �����ϰ� ǥ���Ҷ� ���
		
		System.out.printf("d=%14.10f%n", d);
		
		// %��ü�ڸ�.�Ҽ����Ʒ��ڸ�f * ���ڸ� ���ڸ��� 0���� ä��
		// %��ü14�ڸ�.�Ҽ����Ʒ�10�ڸ�f 
		// ��� d =   1.2345678900 
		
		System.out.printf("[%s]%n", url);
		System.out.printf("[%25s]%n", url); 
		System.out.printf("[%-25s]%n", url); // ���� ����
		System.out.printf("[%.7s]", url); //���ʿ��� 7���ڸ� ���
	}
}
