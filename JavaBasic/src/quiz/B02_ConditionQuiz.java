package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz {
	public static void main(String[] args) {
		// 1. int형 변수 a가 10보다 크고 20보다 작을 때 true
		int a = -5;
		System.out.println(a > 10 && a < 20);
		// 2. int형 변수 b가 짝수일 때 true
		int b = 4;
		System.out.println(b % 2 == 0);
		// 3. int형 변수 c가 7의 배수일 때 true
		int c = -21;
		System.out.println(c % 7 == 0);

		// 4. int형 변수 hour가 오후에 해당하는 시간일 때 = 0미만 24이상이 아니고, 12이상일 때 t
		int hour = 24;
		// !(hour<0) && !(hour>=24) && !(hour>=12)
		System.out.println(!(hour < 0 || hour >= 24) && (hour >= 12));
		// 여기서 0미만 24이상 범위 설정 주의!! ──┐0    24┌── 이런 형태니까 &&말고 ||써야 함! !A교!B =!(A합B)
		// System.out.println(hour >=12 && hour < 24); hour>0은 hour>=12랑 겹쳐서 없애도 됨.

		// 5. int형 변수 d와 e의 차이가 30일 떄 true
		int d, e;
		d = 70;
		e = 100;
		System.out.println((Math.abs(d - e) == 30));

		// 6. int형 변수 year가 400으로 나누어 떨어지거나, 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
		// 윤년 계산 공식
		int year = 2096;
		System.out.printf("%d년은 2월이 하루 더 있는 해인가요?", year);
		System.out.println((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));

		// 7. 민수가 철수보다 생일이 3달 빠르면 true
		int mBMonth, cBMonth;
		mBMonth = 7;
		cBMonth = 10;
		System.out.println(cBMonth - mBMonth == 3);
		System.out.println(mBMonth + 3 == cBMonth);
		// 근데 민수 생일이 11월이고 철수생일이 2월일 경우도 생각해야 함..
		System.out.println((mBMonth + 3) % 12 == cBMonth); // 이게 베스트 정답
		// 민수+3 말고 철수-3으로 해도 되지만 그렇게 하면 철수생일이 2월일 때 계산이 이상하게 됨.
		// 12를 더해주면 되긴 하는데 식이 더 길어지기만 함.
		System.out.println(cBMonth - 3 == mBMonth);
		System.out.println((cBMonth - 3 + 12) % 12 == 3);
		System.out.println(cBMonth - mBMonth == 3 || mBMonth - cBMonth == 9);

		// 8. boolean형 변수 powerOn이 false일 때 true
		boolean powerOn = false;
		System.out.println(!powerOn); // 세련! (powerOn==false)는 촌스러운버전

		// 9. 문자열 참조변수 str이 "yes"일 때 true

		System.out.println("yes를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println(str == "yes");
		// 참조형변수는 ==으로 비교하면 내용을 비교해주지 않음 ★★★
		// 아래 이유 설명------------------------------------------------------
		// 일단 String은 값이 아닌 주소를 저장하는 참조변수
		String str1 = "yes";
		String str2 = "yes";
		System.out.println(str1 == "yes"); // t
		System.out.println(str2 == "yes"); // t
		System.out.println(str1 == str2); // t
		// "yes"가 이미 만들어진 게 있으니 str1 도 str2도 똑같은 주소를 가리키게 됨.
		// ==은 주소값을 비교하기 때문에 똑같다고 나옴

		// 근데 여기서 new를 통해 스캐너로 새로운 주소를 억지로 만들어버리면
		System.out.println("yes를 입력하세요");
		String str3 = scanner.next();
		// str3은 str1과 str2의 주소와 다른 곳을 가리키게 되고 ==으로 비교하게 되면 다르다고 나오는 것.
		System.out.println(str3 == str1); // f
		System.out.println(str3 == str2); // f
		// 핵심은 String형을 ==으로 비교하면 '내용'이 아닌 '주소'를 비교한다는 것!

		// --------------------------------------------------------------------

		// 다시 말해 ==는 가지고 있는 주소값이 같은지 비교하고(같은 객체를 가리키고 있는지 비교)
		// 실제 값을 통해 비교하려면 해당 참조형 변수에 딸려 있는 .equals()를 사용한다.
		System.out.println(str1.equals(str3));

	}

}
