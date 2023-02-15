
public class B04_Switch {
	/*
	 # switch-case문 
	 ()안의 연산 결과에 따라 실행할 코드를 결정하는 문법 
	 ()안에 boolean타입 대신 다른 타입을 사용
	 if문으로 완벽하게 대체할 수 있기 때문에 많이 사용하지는 않는다. 
	 break가 없으면 break를 만날 때까지 내려가면서 모든 case를 실행한다. (break: 아 밑에거 실행하지 말라고? 알겠어~) 
	 , 를 사용해 하나의 케이스에 여러 값을 추가할 수 있다. >> ??? 실행 안됨 없던걸로 하기 case 3: case 4: case 5: 이렇게 나열하기.
	 default:는 if문의 else 같은 역할을 한다. 
	 위에서 하나도 실행 안 되면 default가 실행됨.
	 */
	public static void main(String[] args) {
		int num = 23;
		switch (num) {
		case 0:
			System.out.println("num이 0입니다.");
			break;
		case 1:
			System.out.println("num이 1입니다.");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("num이 2 or 3 or 4입니다.");
			break;
		default:
			System.out.println("위의 case에 모두 해당하지 않아 실행됩니다.");
			break;
		}

	}
}
