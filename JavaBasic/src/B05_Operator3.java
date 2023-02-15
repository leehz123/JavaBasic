
public class B05_Operator3 {
	/*
	 # 대입 연산자 
	 = : 왼쪽의 변수에 오른쪽의 값을 대입한다.
	  
	 # 복합 대입 연산자 
	 += : 해당 변수에 값을 누적시키는 연산 +=, -=, *=, /= , ...
	 
	 #단항 연산자 
	 해당 변수에 값을 1씩 누적시키는 연산 
	 ++, --의 위치에 따라서 결과가 달라진다. 
	 후위연산은 해당 줄의 모든 명령을 실행한 후에 값이 변한다. 
	 전위연산은 해당 줄의 명령을 실행하기 전에 값이 변한다.
	 */
	public static void main(String[] args) {
		int num = 100;

		num += 5;
		// num = num + 5;
		num /= 5; // num = num + 5;
		num *= 5; // num = num * 5;
		num %= 5; // num = num % 5;

		System.out.println(num); // 105

		num = 10;
		num++; // 는 num = num + 1;과 같다.
		System.out.println(num);
		++num;
		System.out.println(num);

		num--; // 는 num = num - 1;과 같다.
		System.out.println(num);
		--num;
		System.out.println(num);

		num = 20;
		num++;
		System.out.println(num);
		// 20으로 출력된 후(이 줄의 명령어를 다 실행한 후)에 1증가해서 num=21;이 됨.
		// 단항연산자의 위치에 따라 결과가 달라진다.

		num = 20;
		System.out.println(num--); // 20
		num = 20;
		System.out.println(--num); // 19
	}
}
