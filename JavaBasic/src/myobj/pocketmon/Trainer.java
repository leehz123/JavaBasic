package myobj.pocketmon;

public class Trainer {  //아 얘는 포켓몬 상속 안 받았네 트레이너가 포켓몬이 될 수 없으니까.. 
	//Pocketmon[] own_pocketmon = new Pocketmon[6];이건 클래스가 참조형식이라 가능한 건가봄
	
	String name;
	
	//▒▒▒▒▒▒▒▒▒▒▒트레이너 이름 설정하는 메서드▒▒▒▒▒▒▒▒▒▒▒
	public Trainer(String name) {  //생성자로 만들어봄
		this.name = name;
	}	//근데 이거 왜 이용 안 함? '지우'라고 나오는 게 없네f
	//▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
	
	
	//▒▒▒▒▒▒▒가방(배열) 안에 포켓몬 몇 마리 들었는지 세서 초과하면 알려주면서 게임 종료시키고, 포켓몬 잡을 때마다 배열 안에 포켓몬(+스탯정보) 추가하는 메서드▒▒▒▒▒▒▒
	Pocketmon[] own_pocketmon = new Pocketmon[6];          //▲이것도 업캐스팅이래! 그래서 포켓몬 고유의 기능을 사용할 수 없게 된대
	//여기에 포켓몬 200마리가 구분 없이 들어오게 하기 위한 것이 상속이다. 
	//(아 이말 머였더라 이해 했었는데 까먹음 그니까 라이츄도 되고 파이리도 되고 피카츄1도 되고 피카츄 2도 된다는 거 같은데?) 
	int index = 0;
	//▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒포켓몬 잡는 메서드▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
	public void catchPocketmon(Pocketmon poke) {
		//포켓몬 잡다가 가방에 6마리 차면 이제 더 못 잡는다고 알려주고 프로그램 종료
		if (index == 6) {
			System.out.println("주머니가 가득 차서 " + poke.name + "을 놓아주었습니다!");
			return;
		}
		own_pocketmon[index++] = poke; //잡은 포켓몬(+정보) 배열 안에 넣어주기 
	}
	//▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
	
	
	//▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒가방에 든 각각의 포켓몬들에 대한 정보를 출력하는 메서드 ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
	//가방(배열) 안에 담긴 포켓몬들의 정보를 순서대로 꺼내서 printStats()메서드(부클=Pocketmon 안에 있음) 안에 든 printf()함수로 출력
	public void printOwn() {
		for(int i = 0; i < index; ++i) {
			own_pocketmon[i].printStats();
		}
	}
	//▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒

	
	
	
	//이번엔 실행을 Trainer클래스에서 해보쟈~
	public static void main(String[] args) {
		
		Trainer t = new Trainer("지우");
		t.catchPocketmon(new Pocketmon("이상해씨" , 1, 2, 3, 4, 5, 6)); 
		//정당한 방법으로 얻지 않은 포켓먼
		
		//포켓몬 잡는 메서드 catchPocketmon(). (Trainer클래스에 있음)
		t.catchPocketmon(new Pikachu()); 
		t.catchPocketmon(new Pikachu());
		t.catchPocketmon(new Pikachu());
		t.catchPocketmon(new Pichu());
		t.catchPocketmon(new Pichu()); //여기서부터 주머니 가득차서 포켓몬 놔줬다고 뜰 것. public void catchPocketmon(Pocketmon poke) { if문 발동
		//정당한 방법으로 얻은 포켓먼들
		
		
		t.printOwn();  //여태까지 잡은 포켓몬 목록 스탯과 함께 출력?
		
		
//		Pikachu pika = new Pikachu();
//		pika.printStats();
//
//		Pichu pichu = new Pichu();
//		pichu.tackle();
//		pichu.printStats(); //엥 닉넴 입력 안 했는데 왜 지멋대로 쳐 나와▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲ 
//		
	}
}

