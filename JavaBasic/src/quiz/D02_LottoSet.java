package quiz;

import java.util.HashSet;

public class D02_LottoSet {
//�ؽü��� �̿��� 1���� 45�� �ߺ� ���� 7 ���� ���� ���ڸ� �����غ�����
	
	public static void main(String[] args) {
		
		HashSet<Integer> lotto = new HashSet<>();
		
		while(lotto.size() != 7) {
			int ran = (int)(Math.random() * 45 + 1);
			lotto.add(ran);
			System.out.println("�̹��� �߰��� ���� : " + ran);
			System.out.println(lotto);
			//���� �߰��� ���ڰ� �ƹ� �ڸ����� ���� �� ���� ���� ���� ���� HashSet
		}
	
		System.out.println();
		System.out.println("��� : " + lotto);
	}
		
}
