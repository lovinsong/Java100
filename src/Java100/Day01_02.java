package Java100;

public class Day01_02 {
	public static void main(String[] args) {

		// 1: ���� ����
		int a;		//--- ������ ����� ���� �̸��� a�� ������
		int b; int c = 90;
		double d;	//--- �Ǽ��� ����� ���� �̸��� d�� ������
		char e;		//--- ���ڰ� ����� ���� �̸��� e�� ������
		
		// 2: ����� ������ ���� ����
		a = 10;
		d = 10;		//-- ���� 10�� �Է��ϸ� 10.0���� ���	
		e= 'A';		//--- �ֵ���ǥ�ϸ� ���� --> Ȭ����ǥ
		
		// 3: ���
		System.out.println(a);
		//System.out.println(b); Err
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		// 4: ���� �� ���� ���� �� �ʱ�ȭ --> ���� �� ���� ����
		// 4-1
		  int w; // ���� X --> �Ⱦ��µ� �� ����?
		  int x0,y0,z0= 900; // c�� �ʱ�ȭ�� �ǰ� a, b�� �ʱ�ȭ �ȵ�
		  System.out.println(z0);
		// 4-2
		int x, y, z;
		x = 900;
		y = 900;
		z = 900;
		System.out.println("[4-2]" + x + "-" + y + "-" + z);
		
		//4-3
		int x1 = 300, y1 = 400, z1 = 500;
		System.out.println("[4-3]" + x1 + "-" + y1 + "-" + z1);
		
		//4-4 : ���� ������ �ʱ�ȭ
		//String str1, str2, str3 = "korea";
		//System.out.println(str3);
		
		String str1, str2, str3;
		str1 = str2 = str3 = "korea";
		System.out.println("4-4 ���� ���ڿ� ���� �Ѳ����� �ʱ�ȭ : " + str1 + "-" + str2 + "-" + str3);
		
		int i,j,k;
		i = j = k = 100;
		System.out.println("4-4 ���� ������ ���� �Ѳ����� �ʱ�ȭ : " + i + "-" + j + "-" + k);
		
		
	}
}
