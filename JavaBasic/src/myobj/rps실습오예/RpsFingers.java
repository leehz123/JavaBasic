package myobj.rps실습오예;

public class RpsFingers extends Fingers {
	

	@Override
	public int randomFingers() {
		randomFingers = (int)(Math.random() * 3 + 1); 
		return randomFingers;
	}

	public String getFingersName(int num) {
		switch(num) {
		case 1:
			return "가위";
		case 2: 
			return "바위";
		case 3:
			return "보";
		default: 
			return "error";
		}
	}
}
