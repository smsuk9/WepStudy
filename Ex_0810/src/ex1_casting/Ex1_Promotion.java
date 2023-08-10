package ex1_casting;

public class Ex1_Promotion {

	public static void main(String[] args) {

//		형변환(Casting)
//		하나의 자료형에서 다른 자료형으로 데이터의 타입을 바꾸는 걸 말한다.

//		자동형변환(Promotion)	-	묵시적 형변환
//		크기가 작은 자료형의 데이터를 크기가 큰 자료형으로 변환

//		강제형변환(Demotion)	-	명시적 형변환
//		크기가 큰 자료형의 데이터를 크기가 작은 자료형으로 변환

		double d = 100.5; // 8byte
		int n = 200; // 4byte

		d = n;

		System.out.println("d = " + d);

		char c = 'A'; // 2byte
		int i = 100; // 4byte

		i = c;

		System.out.println("i = " + i);
	}

}
