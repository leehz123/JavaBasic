package myobj.rps�ǽ�����;

public class RpsFingers extends Fingers {
	

	@Override
	public int randomFingers() {
		randomFingers = (int)(Math.random() * 3 + 1); 
		return randomFingers;
	}

	public String getFingersName(int num) {
		switch(num) {
		case 1:
			return "����";
		case 2: 
			return "����";
		case 3:
			return "��";
		default: 
			return "error";
		}
	}
}
