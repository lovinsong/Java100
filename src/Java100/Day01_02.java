package Java100;

public class Day01_02 {
	public static void main(String[] args) {

		// 1: 변수 선언
		int a;		//--- 정수가 저장될 변수 이름을 a로 만들어라
		int b; int c = 90;
		double d;	//--- 실수가 저장될 변수 이름을 d로 만들어라
		char e;		//--- 문자가 저장될 변수 이름을 e로 만들어라
		
		// 2: 선언된 변수에 값을 대입
		a = 10;
		d = 10;		//-- 정수 10을 입력하면 10.0으로 출력	
		e= 'A';		//--- 쌍따옴표하면 에러 --> 홑따옴표
		
		// 3: 출력
		System.out.println(a);
		//System.out.println(b); Err
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		// 4: 여러 개 변수 선언 및 초기화 --> 선언 후 값을 셋팅
		// 4-1
		  int w; // 에러 X --> 안쓰는데 왜 선언?
		  int x0,y0,z0= 900; // c만 초기화가 되고 a, b는 초기화 안됨
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
		
		//4-4 : 같은 값으로 초기화
		//String str1, str2, str3 = "korea";
		//System.out.println(str3);
		
		String str1, str2, str3;
		str1 = str2 = str3 = "korea";
		System.out.println("4-4 여러 문자열 변수 한꺼번에 초기화 : " + str1 + "-" + str2 + "-" + str3);
		
		int i,j,k;
		i = j = k = 100;
		System.out.println("4-4 여러 정수형 변수 한꺼번에 초기화 : " + i + "-" + j + "-" + k);
		
		
	}
}
