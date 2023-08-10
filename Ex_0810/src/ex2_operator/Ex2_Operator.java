package ex2_operator;

public class Ex2_Operator {

	public static void main(String[] args) {

//		대입연산자
//		항상 우변의 값을 좌변에 대입한다 라고 생각하자
//		복학대입연산자
//		산술연산자 + 대입연산자
//		+=, -=, ...

		int n1 = 10;
		int n2 = 7;
		System.out.println("= 연산자 : n1 = " + n1 + ", n2 = " + n2);

//		n1+= b2 -> n1 = n1 + n2
		System.out.println("+= 연산자 : n1 += n2 = " + (n1 += n2));

		System.out.println("n1 : " + n1);

//		n1 -= n2; -> n1 = n1 - n2
		System.out.println("-=연산자 : n1 -= n2 = " + (n1 -= n2));

		System.out.println("n1 : " + n1);

//		n1 *= n2; -> n1 = n1 * n2
		System.out.println("*=연산자 : n1*=3 = " + (n1 *= 3));
	}

}
