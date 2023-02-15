
public class E03_CustomException {
/*
 # ���ϴ� ���� ���� ���� ����ϱ�
 Exception �� ��ӹ����� �ݵ�� ó���ؾ� �ϴ� ����
 RuntimeException�� ��ӹ����� �ݵ�� ó���� �ʿ�� ���� ���� 
 */
	public static void playCat(Cat cat) { //NotPlayableException�� �ͼ����� ��ӹ޾Ҵٸ� �ݵ�� ó���ؾ� �ϴ� ���ܶ�� �˷���� ��. throws NotPlayableException �߰�  
		
		//A instanceof B : A�� B�� �ν��Ͻ����� �˻��ϴ� �񱳿����� 
		if (cat instanceof russianBlueCat) { 
			//System.out.println("���þȺ��� ��� �� �Ⱦ��մϴ�. ");
			throw new NotPlayableCatException();
		} else {
			System.out.println("����̿� �������ϴ�. ");
		}
	}
	
	public static void main(String[] args) {
		playCat(new Cat());
		playCat(new PersianCat());
		playCat(new russianBlueCat());
	}
}


class Cat {}
class PersianCat extends Cat {}
class russianBlueCat extends Cat {}


class NotPlayableCatException extends RuntimeException { //extends Exception : �ͼ����� ��ӹ����� �ͼ����� �� 
	public NotPlayableCatException() {
		System.out.println("�� �� �𸣴� ����� �ͼ���");
	}
}
