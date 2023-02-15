package quiz;

public class A04_Gildong {
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20; // 예전엔 최적화 한다고 byte에 담고 그랬는데 요즘은 그냥 int에 해도 됨.
		String tel = "010-1234-1234";
		double height = 178.5;
		double weight = 75; // 몸무게랑 키는 소수 발생할 수 있으니까
		String bloodType = "O"; // AB형도 있으니까! 그리고 큰따옴표 주의

		System.out.println("==========출력결과==========");
		System.out.println("이름	: " + name);
		System.out.println("나이	: " + age);
		System.out.println("Tel	: " + tel);
		System.out.println("키 	: " + height);
		System.out.println("몸무게		: " + weight);
		System.out.println("혈액형		: " + bloodType);

	}
}
