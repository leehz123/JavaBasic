

public class B16_Array2 {
/*
 �迭 �ȿ� �迭�� ���� �� �ִ�. (�迭�� �̷���� �迭�� ���� �� �ִ�.)
 
 */
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		//�ε����� ���� ��Ʈ�� ����
		int[][] numbers2 = {numbers, numbers, numbers, numbers};
		//�ε����� ���� �ε��� �迭�� ����
		
		System.out.println(numbers2[0]); //0��° ��ġ�� int[]�� ����Ŵ
		System.out.println(numbers2[0][0]); //0��° ��ġ int[]�� 0��° ��Ҹ� ����Ŵ
		
		numbers2[0][2] = 33;
		System.out.println(numbers2[0][2]); //�ٲ� 33�� ���;�
		System.out.println(numbers2[3][2]); //3? 33? >> 33�� ����
		//�ᱹ numbers�迭�� ������ ���� �ٲٴ� �Ŵϱ�!
		System.out.println(numbers2[1][2]);
		System.out.println(numbers2[2][2]);
		System.out.println();
		
		
		System.out.println(numbers2[0]);
		System.out.println(numbers2[1]);
		System.out.println(numbers2[2]);
		System.out.println(numbers2[3]);  //�� �Ȱ��� �ּҰ� ����. �迭�� ���� �ּ�!
		
/*		int[][] numbers2 = {numbers, {1, 2, 3, 4, 5}, numbers, numbers};
		�̷��� �ٲٸ�
		System.out.println(numbers2[0]);
		System.out.println(numbers2[1]); //�길 �ּҰ� �޶���
		System.out.println(numbers2[2]);
		System.out.println(numbers2[3]);
		
		System.out.println(numbers2[0][2]);
		System.out.println(numbers2[3][2]); 
		System.out.println(numbers2[1][2]); //�� ȥ�� ���� �ٸ�! ����Ű�� ��ġ�� �ٸ��ϱ� 
		System.out.println(numbers2[2][2]);
*/

/*
n���� �迭�� n�� �ݺ������� ��� Ž���� �� �ִ�.
�ٵ� n���� �迭�� �� ���� x. ���� ����� 2����.  
 */
		char[][] chs= {
			{'a', 'b', 'c', 'd'},
			"Hello, world".toCharArray(),   //�̷� �͵� ������� �� �ְ���
			"I have a dream".toCharArray(), //��� ���� ���� ������ �ٸ�
			{'x', 'y'}
		};
		
//		char[][][] today_chat_log = {
//				chs,
//				chs2,
//				chs3
//		}
//		char[][][] today_chat_log = {
//				today_chat_log,
//				yesterday_chat_log,
//				tommorow_chat_log
//		}
		
		for (int i = 0; i < chs.length; ++i) {
			char[] arr = chs[i];
			System.out.println(arr); //�迭�� �ϳ��� ����
			for (int j = 0; j < chs[i].length; ++j) {
				System.out.printf("chs[%d][%d] : %c\n", i, j, chs[i][j]);
			}
		} 
		
		
		
		
		
		
		
	}
}
