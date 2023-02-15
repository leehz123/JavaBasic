package myobj.Yacht;

import java.util.Arrays;

//1) Ǯ�Ͽ콺 (���� ���� 2 ��/ 3 ��) ex) 11133, 31313(���� �����), 66655, 65556..
//2) ���� ��Ʈ����Ʈ(1234, 2345, 3456 �ε� 42131 �̷������� ���� ��� ���� ���͵� �� 65431)
//3) ���� ��Ʈ����Ʈ(12345, 23456) ex) 53421, 12345
//4) �����̽� (���� ���� 4��) 44441, 63666, 11311, ..
//5) Yacht (���� ���� 5��) 111111, 222222

//6) �ƹ� �͵� �������� ���� ��� �ֻ��� �� ���� ������ �ȴ�. (�� �̰� if������ return 1, -1, 0 ...�ؼ� main������ switch������ �ް� �����)

public class YachtDice {
	final static int GAME_SIZE = 5;
	final static int DICE_FACES = 6;

	int life = 2; //ó�� ������ ������ ������ 2. reroll�� ������ �ϳ��� ���̴� ��  
	
	int[] dices;
	int[] count = new int[DICE_FACES];
	String made; // ����

	public YachtDice() {
		dices = new int[GAME_SIZE];
		for (int i = 0; i < dices.length; ++i) {
			roll(i);
		}
		check(); //�ֻ��� �ѹ��� ������ �� üũ
		
	}

	// ������ ������� ī��Ʈ �迭�� ���ϴ� ���ڰ� �ִ��� üũ�ϴ� �޼���
	boolean numberContains(int num) {
		return count[num - 1] > 0;
		// �̷��� �ϸ� �ش� ���ڰ� ����ִ��� �ƴ��� �� �� ����.
	}

	// ������ ������� count�迭�� ���ϴ� Ƚ����ŭ ������ ���ڰ� �ִ��� üũ�ϴ� �޼���
	boolean countContains(int cnt) {
		for (int i = 0; i < count.length; ++i) {
			if (count[i] == cnt) {
				return true;
			}
		}
		return false;
	}

		
	//"245"��� ���޹����� 2��° 4��° 5���� �ֻ����� �ٽ� ���� ���� (�ε����� �ٷ��)
	public void reroll(String idxs) {
		
		for(int i = 0; i < idxs.length(); ++i) {
			if(life < 1) {
				return;
			}
			int index = idxs.charAt(i) - '0';  //���ڿ��� ���ڸ� ������ ���� '0'�� ���ִ� ��. '3' - '0' �� ���� 3�̴ϱ�. 
			if(index < 0 || index > GAME_SIZE) {
				continue; //���ڰ� �߸� ���Ӵٴ� ���ϱ�
			}
			roll(index - 1);
			life--;
			//������ ���������� �Ͼ�� üũ�� �ؼ� ���� ��ȭ�� ������� ����
			check();
		}	
	}
	
	// ���� dices�� ������ � ���ڰ� �� �� �ִ��� count�迭�� �����ϴ� �ڸ���(��) ���� ���� �޼���
	void count() {
		// �迭�� ���ϴ� ������ �ѹ��� ���� ä��� �Լ� Arrays.fill(arr, val)
		// Arrays.fill(dices, roll()); �ٵ� �̷��� �ϸ� �� �Ȱ��� ������ ä����
		Arrays.fill(count, 0);
		// [0, 0, 0, 0, 0, 0]
		for (int i = 0; i < dices.length; ++i) {
			count[dices[i] - 1]++;
		} // �ڸ������� ������ ��� (6�� ������ �ε��� 5�� +1) �� �迭 �ȿ� 2�� 3�� ������ Ǯ�Ͽ콺 �� ��!
	}

	// ���� dices�� ���� ���� ������ �����ϴ� �޼���.
	void check() {
		count(); // ���� count�迭 ���� ������ ���������� ����� �� �հ���.
		if (countContains(5)) {
			made = "Yacht!";
		} else if (countContains(4)) {
			made = "4 dice!";
		} else if (countContains(3) && countContains(2)) {
			made = "Full House!";
		} else if (numberContains(2) && numberContains(3) && numberContains(4) && numberContains(5) 
				&& (numberContains(1) || numberContains(6))) {
			made = "Large Straight!";
		} else if (numberContains(3) && numberContains(4) 
				&& ((numberContains(1) && numberContains(2)) || (numberContains(2) && numberContains(5)) || (numberContains(5) && numberContains(6)))) {    
					made = "Small Straight!";
		} else {
			made = "" + (dices[0] + dices[1] + dices[2] + dices[3] + dices[4]);
		}
						
	} // ��Ḧ �̸� ���������ϱ� ���� © �� ���� ���� �� �ص� �� . �� �� ũ��ũ�� ������ �� �ֵ��
	

	// ���ϴ� ��°�� �ֻ����� �ٽ� ������ �޼���
	void roll(int index) {
		dices[index] = (int) (Math.random() * 6 + 1);
	}

//���������������������������������������������������������������������������� �̰� ���� ��������������������������������������������������������������������������������������������  System.out.println(yacht); ���� int�迭 yacht�� ������������� ���ڿ��� ��ȯ�ϱ� ���� �������̵�. 
//��������� ��Ʈ��+�����̽� �������� �������̵� �� �� �ִ� �޼������ ��.
//�� ���� ��� Ŭ�������� clone equals hashtag toString.. �� ���� �ִٴ� ��. 
	@Override
	public String toString() {
		// # String.format() : printf()ó�� ���ڿ��� ������ �� ����ϴ� �Լ�.
		return String.format("���� �ֻ��� : %s" + "���� ���� : %s", Arrays.toString(dices), made);
	}
//����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������

}
