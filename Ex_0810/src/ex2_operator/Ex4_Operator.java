package ex2_operator;

public class Ex4_Operator {

	public static void main(String[] args) {
//		증감연산자
//		값을 1씩 증가시키거나 1씩 감소시키는 기능이 있는 연산자

//		선행증감
//		++변수, --변수

		int a = 10;
		System.out.println("a : " + ++a);
		System.out.println("a : " + --a);

//		후행증감

		int b = 10;
		System.out.println("b : " + b++);
		System.out.println("b : " + b);

		System.out.println("b : " + b--);
		System.out.println("b : " + b);

		int c = 12, d = 5, sum = 2;

		d *= c /= 4;
		sum += ++c * d-- / 4;
		System.out.println("sum : " + sum);

	}

}
