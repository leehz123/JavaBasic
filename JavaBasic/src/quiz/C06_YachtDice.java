package quiz;

import myobj.Yacht.YachtDice;

/*
#YacktDice ������ ��������. 
�÷��̾�� �ټ����� �ֻ����� ������. (�ֻ��� �����迭 ������ �� ��) Dice[] dices = new Dice[diceNum];
�ֻ����� ���� 1~6 �����ֻ��� - DiceŬ������ �Ӽ� ���� �� 
�ֻ��� ���� ��� �ټ� ���� ���� ������ �����ؾ� �Ѵ�. (DiceŬ���� �ȿ� �޼���� �����)

1) Ǯ�Ͽ콺 (���� ���� 2 ��/ 3 ��) ex) 11133, 31313(���� �����), 66655, 65556..
2) ���� ��Ʈ����Ʈ(1234, 2345, 3456 �ε� 42131 �̷������� ���� ��� ���� ���͵� �� 65431)
3) ���� ��Ʈ����Ʈ(12345, 23456) ex) 53421, 12345
4) �����̽� (���� ���� 4��) 44441, 63666, 11311, ..
5) Yackt (���� ���� 5��) 111111, 222222
6) �ƹ� �͵� �������� ���� ��� �ֻ��� �� ���� ������ �ȴ�. (�� �̰� if������ return 1, -1, 0 ...�ؼ� main������ switch������ �ް� �����)

�÷��̾�� �ٽ� ������ ���� �ֻ����� ������ ��� �ٽ� ���� �� �ִ�. (2ȸ) 12545 �߿� 5�� 3 ������ �ϰ� �; �ٽ� ������ �� 

 */
public class C06_YachtDice {
	
	public static void main(String[] args) {
		YachtDice yacht = new YachtDice();  //ó���� YachtDice �� import �� ���༭ ������ �־���. Yacht can not be resolved to a type.
		System.out.println("GAME START");
		System.out.println(yacht);
		System.out.println("�� reroll(\"123\")�� ���");
		yacht.reroll("123");
		System.out.println(yacht);		
		System.out.println("(3��° �ֻ����� �������� ����)");
		System.out.println("�� reroll(\"345\")�� ���");
		yacht.reroll("345");
		System.out.println(yacht);
		System.out.println("(life<1 �̶� ���� reroll()�� �������� ����)");
		
		System.out.println("______________________________________________________"); 
		
		System.out.println("GAME START");
		//���� ������� ���� �ν��Ͻ� ���Ҵ�.
		yacht = new YachtDice();
		System.out.println(yacht);
	}
}
	
	

