package ex1_casting;

public class Ex2_Demotion {

	public static void main(String[] args) {

//		큰 자료형을 작은 자료형에다 대입하는 것
//		Demotion하는법 : (자료형)변수 or 데이터
		char c = 'B'; // 2byte
		int n = c + 1; // 여기까지는 자동형변환

		c = (char) n; // c는 2byte n은 4byte이므로 오류 발생

		System.out.println("c의 값 : " + c);

		float f = 5.5f;
		int n1 = 0;

//		f = n1;	//0	->		0.0

		n1 = (int) f; // 같은 4byte라도 자료형이 다르면 캐스팅을 하는게 원칙
		System.out.println("n1 = " + n1);
		
//		실수에서 정수로 형변환을 할때는 소수점이하 부분이
//		유실될 수 있기 때문에 주의해야 한다.
		
		byte b1 = 100;
		byte b2 = 20;
		byte b3 = (byte)(b1 + b2);
		
//		byte의 표현범위가 127까지 밖에 안되다보니 byte끼리의
//		연산은 127을 넘기는 경우가 많았다.
//		이런 상황을 대비하여 자바 개발자들은 byte끼리 연산이
//		수행될 때 int형으로 값을 받도록 만들었다.
	}

}
