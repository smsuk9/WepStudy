package ex2_operator;

public class Ex5_Operator {

	public static void main(String[] args) {
//		비트연산자
//		비트단위(2진수)로 계산하는 연산자.
		int a = 10; // 1010
		int b = 7; // 0111
		int c = a & b;
//		& : 논리곱(and) - 두 값이 모두 1일때 1, 나머지는 0
		System.out.println("논리곱 : " + c);

//		| : 논리합(or) - 둘 중 하나만 1이어도 1, 나머지는 0
		c = a | b;
		System.out.println("논리합 : " + c);

//		^ : 배타적or(xor) - 서로 달라야 1 , 같으면 0
		c = a ^ b;
		System.out.println("배타적 or : " + c);

//		~ : not - 1을 0으로 0을 1로 바꿔주는 연산
		c = ~a;
		System.out.println("not a : " + c);

//		1010 -> 0101
//				+		  1
//					0110

//		시프트 연산자.
//		왼쪽이나 오른쪽으로 비트를 옮기는 연산자.
		System.out.println("a << 1 : " + (a << 1));
		System.out.println("a >> 1 : " + (a >> 1));
	}

}
