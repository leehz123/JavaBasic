package myobj.pocketmon;

public class Pichu extends Pocketmon {
	static String defaultName = "Pichu";
	
	public Pichu() {
		super(
				//nickname(defaultName), //이것도 일일이 이름 쳐넣기 번거로우니까 그냥 defaultName으로 한다 했던 것 같음
				defaultName,
				(int)(Math.random() * 50 + 70),
				(int)(Math.random() * 50 + 70),
				(int)(Math.random() * 50 + 70),
				(int)(Math.random() * 50 + 70),
				(int)(Math.random() * 50 + 70),
				(int)(Math.random() * 50 + 70)
		);	
		
		//닉네임을 바꾸시겠습니까?
		this.name = nickname(defaultName);
		//이렇게 하면 정상작동 함. 근데 dafaultName자리에 getName()를 넣으려 하면 에러가 난다는 것. 
	}
	
	//만약 여기에 getName()이 있고
	public String getName() {
		return "name";
	}
	
	public void tackle() {
		System.out.printf(name + "은 몸통박치기로 " + atk  * 0.7 + "의 데미지를 입혔다. ");
	}
}
