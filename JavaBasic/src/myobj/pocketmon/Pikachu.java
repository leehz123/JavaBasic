package myobj.pocketmon;

public class Pikachu extends Pocketmon { //상속을 받으면 능력치 변수가 생기쥐
	
	static String defaultName = "Pikachu";

	public Pikachu() {
		super( //부모(Pocketmon)의 생성자로 보냄 >> 포켓몬의 능력치별로 값이 채워지는 것. 
				//nickname(defaultName),  //이거 일일이 이름 쳐넣기 번거로우니까 그냥 defaultName으로 한다 했던 것 같음
				//Pocketmon(부모)에 있는 메서드 호출
				//아.. defaultName왜 썻는지 모르겠네 
				//defaultName 을 안 쓰면 null이 전달돼서 보기 싫어짐 삼항연산자로 어쩌고 해서 t면 nickname()을 다시 호출해야 하고 f면 null을 해줘야 하니까 그것 도 싫음
				//생성자에 무리해서 넣어주려 해서 defaultName이 필요햇던 거지 
				//그게 아니고 천천히 아래에 입력 받고 그러면 굳이 이럴 필요 없대 
				
				defaultName, 
				(int)(Math.random() * 50 + 100),
				(int)(Math.random() * 50 + 100),
				(int)(Math.random() * 50 + 100),
				(int)(Math.random() * 50 + 100),
				(int)(Math.random() * 50 + 100),
				(int)(Math.random() * 50 + 100)
		);
		
	}
	
	
	public void thunder() {
		System.out.println(name + "는 번개 공격이 있습니다. 데미지는" + sAtk * 1.5 +  "입니다.");
		
	}
}
