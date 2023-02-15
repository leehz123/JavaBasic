
public class C12_InstanceLifeCycle {
/*
# 인스턴스 생성시 자동으로 실행되는 코드들의 실행 순서
1. 첫 실행 시 스태틱 블록이 실행 (클래스가 메모리에 올라갈 때 static 블록이 실행됨)
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
2. 인스턴스 생성
3. 인스턴스 블록 실행
4. 생성자 실행 

 */
	public static void main(String[] args) {
		
		System.out.println("프로그램 실행");
		//스태틱 영역은 무조건 메모리에 실어놓는 것이 아니라 ★해당 클래스가 최초로 사용되는 시점★에 메모리에 실리게 된다.
		System.out.println(InstanceLife.a);
		
		
		new InstanceLife();
		new InstanceLife();
		new InstanceLife();
		// 스태틱블록 - 인스턴스 블록 - 생성자 실행 / - 인스턴스 블록 - 생성자 실행 / - 인스턴스 블록 - 생성자 실행 ...
		// 그리고 스태틱은 첫 실행시에만 실행되므로, 두 번째 실행부터는 실행되지 않음. 
		
		System.out.println("프로그램 종료");

	}
}

class InstanceLife {
	static int a;
	static { //스태틱 블록은 클래스 언급시 메모리에 로드됨
		System.out.println("1. 스태틱 초기화 블록 실행");
	}
	
	{
		System.out.println("2. 인스턴스 초기화 블록 실행");
	}
	
	InstanceLife() {
		System.out.println("3. 생성자 블록 실행");
	}

}