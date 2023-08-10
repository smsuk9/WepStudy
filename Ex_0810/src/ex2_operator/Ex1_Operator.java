package ex2_operator;

public class Ex1_Operator {

	public static void main(String[] args) {
//		연산자
//		연산기능이 있는 기호
//		1. 산술연산자 : +, -, *, /(몫), %(나머지)
//		2. 비교연산자 : >, <, >=, <=, ==, !=
//		3. 논리연산자 : &&, ||, !
//		4. 비트연산자 : &, |, ^, ~
//		5. 시프트연산자 : >>, <<
//		6. 증감연산자 : ++, --
//		7. 대입연산자 : =, +=, -=, *=, /=, %=
//		8. 삼항연산자 : ?, :

//		산술연산자
//		사치기연산(+, -, *, /)와 나머지 값을 구하는 %연산자로 나뉜다.

		int n1, n2, n3; // 3개를 동시에 선언
		n1 = 20;
		n2 = 7;
		n3 = n1 + n2;

		System.out.println("n3 = " + n3);

		n3 = n1 - n2;
		System.out.println("n3 = " + n3);
		
		n3 = n1 / n2;
		System.out.println("n3 = " + n3);
		
		n3 = n1 % n2;
		System.out.println("n3 = " + n3);

	}

}
