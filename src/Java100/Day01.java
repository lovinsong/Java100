package Java100;

public class Day01 {
	
	//변수, 코드 키워드
	/*
	  접근제한자 클래스선언 클래스이름 {
	  	접근제한자 static 반환타입 메서드이름(파라미터){
	  		// 구현할 코드 작성
	  	}
	  }
	  
	  1)접근제한자	--> public, private, protected, default
	  			--> 클래스나 메서드에 접근할 수 있는 범위를 지정 --> 접근제한자, 접근제어자
	  			--> private > protected > public
	  2)클래스선언	--> class
	  			--> 객체를 생성하는 특, 프레임, 공장, 템플릿
	  3)클래스이름	--> 카멜케이스(단어와 단어 사이의 구분 --> 대문자)
	  4)메서드이름	--> 메서드란? --> 함수 --> 어떤 특정한 동작이나 작업, 행위 등을 수행하는 것.
	 */
	
	//메인, 메인 메서드, 주의점
	/*
	 1)메인메서드	--> main() --> 만약 다르게 작성하면 기본 메서드를 찾을 수 없다라고 에러발생 --> 기본 메서드(main) 작성하라고함.
	  			--> 자바 프로그램이 실행되면 제일 먼저 메인 메서드를 찾아서 실행.
	  			--> 길게 작성된 소스에서 그 프로그램의 시작이 어딘지 알 수 없으면 안되므로 시작점을 알려주는 용도 --> entry point --> main()
	  		
	 2)파라미터스	--> 메서드(함수) 호출시 하나 or 둘 이상의 파라미터 값을 넣어서 호출할 수 있음.
	 			--> 그러한 인수(파라미터)들의 값을 저장할 변수(바구니)들을 명시.
	 			--> String --> 문자열 --> [] 배열 --> args --> argument(논의, 논쟁, 언쟁, 말다툼, 주장; 인수, 독립변수)
	 
	 3)반환할타입	--> return type --> 반환할 값이 있냐? 없냐? --> 없으면 void(빈공간, 공허함, empty)
				--> 이 메서드(함수)는 호출하면 결과로써 특별히 반환되는 값은 없이 수행되는 메서드.
	 */
	
	// 메인, 메인메서드, static, 키워드
	/*
	  - static으로 선언된 함수(메서드)나 변수는 자바 버추얼 머신에서 인스턴스 객체의 생성 없이 호출할 수 있다.
	  - 쉽게말해서, 객체 생성없이 해당 함수(메서드)를 호출해서 사용할 수 있다.
	  - 자바 프로그램을 실행하면 static으로 지정된 메서드를 찾아서 먼저 메모리에 할당시킨다.
	  - static으로 지정된 메서드가 여러개인 경우에는 객체를 생성하는 것과 상관없이 모두 메모리에 할당시킨다.
	  - 그런 후에, "main"으로 이름이 만들어진 메서드가 있는지를 찾아서 그 메서드를 가장 먼저 시작점의 메서드로써 호출을 하게 된다.
	 */

	//변수, 선언, 개념
	/*
	  1. 변수란 무엇인가?
	  		--> 바구니다. --> 데이터를 저장하는 메모리 공간이다. --> 변하는 수.
	  
	  2. 변수 선언이란 무엇인가?
	  		--> 변수를 사용하기 위해서는 먼저 변수의 타입에 맞는 선언을 해줘야 한다.
	  // 정수형의 변수를 사용하고자 한다면 --> 먼저 정수형 타입의 자료형을 선언해주고 사용해야 한다. --> 데이터타입(자료형)에 대해서는 뒤에..
	  
	  3. 변수의 용도?
	  		--> 저장 --> 어떤 연산을 수행할 때 값들을 저장해놓아야 하는데 그때 변수(바구니)를 활용한다.
	  		
	  4. 왜필요한가?
	 */
	
	// 데이터 타입, 자료형. type
	/*
	 1. 크게 봤을때 --> 기본형 타입, 참조형 타입
	 
	 2. 기본형타입(PrimitiveData Type) --> 8개
	 	정수형 --> byte(1byte), short(2byte), int(4byte), long(8byte)
	 	실수형 --> float(4byte), double(8byte)
	 	문자형 --> char(2byte)
	 	부울형(논리형 : 참 or 거짓) --> boolean(1byte) -->true, false
	 
	 3. 참조형 타입(Reference Data Type) --> 위 기본형에 속하지 않는 데이터형들.
	 // 대표적인 것들 --> 클래스(class), 배열(array), 인터페이스(interface), 문자열(String/immutable)
	 // 참조형 변수의 특징 --> 데이터가 저장된 메모리의 주소 값을 저장하는 변수이다.
	*/
	
	//자바의 Primitive Data Type의 바이트 크기와 비트 크기를 출력하는 코드를 구현하시오.
	public static void main(String[] args) {
		//byte, short, int, long, char
		System.out.println(Byte.BYTES); //-- 바이트 계산
		System.out.println(Byte.SIZE);	//-- 비트 계산
		
		System.out.println("byte  : " + Byte.BYTES + "(바이트)" + " --> " + Byte.SIZE + "(비트)  " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("Short : " + Short.BYTES + "(바이트)" + " --> " + Short.SIZE + "(비트) " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("int   : " + Integer.BYTES + "(바이트)" + " --> " + Integer.SIZE + "(비트) " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("long  : " + Long.BYTES + "(바이트)" + " --> " + Long.SIZE + "(비트) " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		System.out.println("char  : " + Character.BYTES + "(바이트)" + " --> " + Character.SIZE + "(비트) " + Character.MIN_VALUE + " ~ " + Character.MAX_VALUE);
		System.out.println("char  : " + Character.BYTES + "(바이트)" + " --> " + Character.SIZE + "(비트) " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
	}
}
