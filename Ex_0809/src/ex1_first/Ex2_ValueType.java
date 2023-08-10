package ex1_first;

public class Ex2_ValueType {

	public static void main(String[] args) {
//		자료형 : 데이터를 담는 컵의 크기와 재질 같은 느낌이다.
//		정수형 : byte		-	1byte		-128 ~ 127
//				   short		-	2byte		-32,768 ~ 32,767
//				   int			-	4byte		-21,4748,3648 ~ 21,4748,3647
//				   long		-	8byte		-900경 ~ 900경
//		문자형 : char		-	2byte
//		실수형 : float		-	4byte
//				  double		-	8byte
//		논리형 : boolean	-	1bit		true(참), false(거짓)

//		변수
//		자료형이 데이터를 담기 위한 컵의 재질과 크기라면
//		변수는 데이터를 실제로 담기 위한 컵을 만드는 과정

//		변수의 선언
//		비어있는 컵을 만드는 과정
//		자료형 변수명;

//		값의 대입
//		만들어져 있는 컵에 물(데이터)을 넣는 과정
//		변수명 = 데이터;

//		변수의 초기화(Initialize)
//		선언 + 대입
//		자료형 변수명 = 데이터;

//		변수명 명명 규칙
//		1. 숫자가 첫글자로 올 수 없다.
//		2. 대소문자를 구별한다. (name, Name)
//		3. _를 제외하고는 특수문자가 들어갈 수 없다.
//		4. 예약어 금지(int, float, char, if, for, switch...)
//		5. 의미 있는 이름으로 짓기

//		논리형
//		true, false 두가지 데이터만 존재한다.
		boolean b = true;
		System.out.println("b의 값 : " + b);

//		boolean b1 = 1;	//자료형의 값이 올바르지 않아서 오류

//		문자형
//		' '안에 들어있는 한글자
		char ch = 'A';
		System.out.println("ch의 값 : " + ch);

		char ch1 = 65; // 정수인데 어떻게 문자형 변수에 들어가는가...
		System.out.println("ch1의 값 : " + ch1);

//		정수형
//		byte by = 128;	//byte자료형의 표현범위를 벗어났기 때문에 오류

		byte by = 127;
		short s = 32767;
		int n = 550;

		System.out.println("by의 값 : " + by);
		System.out.println("s의 값 : " + s);
		System.out.println("n의 값 : " + n);
		
//		실수형(소수)
		float f = 3.14f;
//		자바는 실수자료형을 기본적으로 double을 채택하고 있다.
	}

}
