package myobj;

public class Defender extends Person {
	
	@Override
	public void sayHi() {
		System.out.println(name + "씨가 방패를 퉁퉁 두드리며 인사합니다. ");
	}
	
	public void block () {
		System.out.println(name + "씨는 방패로 화살을 막았습니다. ");
	}
	
	public void bash() {
		System.out.println(name + "씨는 방패로 앞에 있는 사람을 때렸습니다. ");
	}
 }
