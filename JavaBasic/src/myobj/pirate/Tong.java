package myobj.pirate;

//통아저씨 게임을 하려면 통이 필요하지
public class Tong {
	boolean[] slot = new boolean[GAME_SIZE]; //통아저씨 통에는 구멍이 뚫려 있지(통아저씨의 속성) | 찔렀던 걸 다시 안 찌르기 위한 배열
	final static int GAME_SIZE = 20;
	int[] launch = new int[2]; //발사 인덱스0번과 1번에 든 값 중에 사용자가 입력한 값과 같은게 있으면 발사!
	
	public Tong() { 
		this.rewind();
	}
	
	//당첨 번호를 새로 세팅하기 위해 통을 새거로 바꿀 순 없잖아? 당첨번호 세팅 내용 그대로 잘라다가 rewind()를 만들고 붙여넣기. 
	//새 게임 시작할 때 통아저씨 감아주기 메서드			
				//동작에 이름을 붙여서 개념화하는게 객체지향
	public void rewind() {  
		//슬롯 초기화
		slot = new boolean[GAME_SIZE];
		//당첨번호 새로 세팅!
		launch[0] = (int)(Math.random() * GAME_SIZE);
		while(true) {
			launch[1] = (int)(Math.random() * GAME_SIZE);
			if(launch[0] != launch[1]) { //똑같은 번호 안 걸리게 똑같은 번호 아닐 때까지 뽑기 
				break;
			}
		}
	}
	
	/**  자세한 주석 _ 이러고 stab(메소드명)에 마우스 올리면 설명 나옴!
	 @param slotIndex - 찌르고 싶은 번호를 매개변수로 전달해야 합니다. 
	 @return 
	 당첨번호를 선택한 경우 -1. 올바르게 찌르고 살아남은 경우 1. 
	 찔렀던 곳을 다시 찌르거나 유효하지 않은 번호를 입력한 경우 0.
	 */
 	public int stab(int slotIndex) { //통을 찌를 수 있음 찌른다 메서드
 		if (launch[0] == slotIndex || launch[1] == slotIndex) { //통아저씨가 발사되면 -1 라톤
 				return -1;
 		}	else if (slotIndex < 0 || slotIndex >= GAME_SIZE) {
 				return 0;
 		}	else if (!slot[slotIndex]) {
 				slot[slotIndex] = true;
 				return 1;
 		}	else {
 			return 0;
 		}
 	}
 	
 	
 	
 	public void print() {
 		for(int i = 0; i < GAME_SIZE; ++i) {
 			
 			if(!slot[i]) {
 				System.out.printf("%02d\t", i + 1);
 			} else {
 				System.out.println("[XX]\t");
 			}
 			if( i % 5 == 4) {
 				System.out.println();
 			}
 		}	
 	}
	
}
