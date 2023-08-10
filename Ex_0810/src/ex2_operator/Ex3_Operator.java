package ex2_operator;

public class Ex3_Operator {

	public static void main(String[] args) {
//		비교연산자
//		변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자.
//		결과가 항상 true, false로 반환된다.

		int n1 = 10;
		int n2 = 20;
		boolean result;
		result = n1 < n2;

		System.out.println("n1 < n2 : " + result);

		result = n1 == n2; // 같으면 true, 다르면 false
		System.out.println("n1 == n2 : " + result);

		result = n1 != n2; // 다르면 true, 같으면 false
		System.out.println("n1 != n2 : " + result);

//		논리연산자
//		논리형 데이터를 통한 연산

//		&& : And의 의미를 가지고 있다. 앞 뒤의 연산이 모두 true여야 true를 반환한다.
//		T && T -> T
//		T && F -> F
//		F && T -> F
//		F && F -> F

		int a = 30;
		int b = 36;

//		&&는 앞쪽 연산이 false일 때 뒤쪽 연산을 수행하지 않고 넘어간다.

		result = (a - b) >= 5 && a > 30;
		System.out.println("&&연산 결과 : " + result);
		System.out.println("a의 값 : " + a);

//		|| : Or의 의미를 가지고 있다. 앞 뒤 하나만 true여도 true를 반환한다.
//		T && T -> T
//		T && F -> T
//		F && T -> T
//		F && F -> F		

		int i1 = 10;
		int i2 = 20;

		result = (i1 += 10) > 20 || i2 - 10 == 11;

//		Or 연산은 앞의 연산이 참이면 어차피 참이기 때문에 뒤의 연산을 진행하지 않는다.

		result = (i1 += 10) > 20 || i2 - 10 == 11;
		System.out.println("||연산 결과 : " + result);
		
//		not 연산
//		true를 false로 false를 true로 만드는 기능을 하는 연산자
		
	}

}
