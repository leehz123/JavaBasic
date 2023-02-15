
public class A02_ASCII {
/*
# ASCII�ڵ� 
���� 0~127 �� �����ϴ� ����
65 - 'A'
97 - 'a'
48 - '0' 
��� �����ʹ� ������ 0�� 1�� ��ȯ�Ǿ� ����ȴ�. 
���ڴ� �ٷ� 0�� 1�� ��ȯ�� �� ���� ������ ���ڿ� �ش��ϴ� ���ڰ��� �����Ѵ�. 
�� ���� �� 0~127�������� ������ ���� ǥ�� ASCII�ڵ��� �Ѵ�. 
10 ------encoding------> 1010  
0-48 
A-65 ------encoding------> 0100 0001 
a-97 ------encoding------> 0100 0010 
0100 0001 ------decoding------> A-65 
0100 0010 ------decoding------> a-97 
�̷� �� '���ڵ�'�̶�� �θ���. = ���� �ڵ�ȭ�� �ȴ�.
 */
	public static void main(String[] args) {
		
		System.out.println("ABCDEFG!!");
		System.out.println('0'); // ���� '0': �����δ� 48�̶�� ���� ���� ����
		System.out.println(0); // ���� 0: �����ε� 0
		// ����Ÿ�� ���ͷ��� ���� ��(�ڵ尪)�� ���� �ʹٸ� �տ� (int)�� ���̸� ��
		System.out.println((int) '0'); // 48
		System.out.println('A'); // 65
		System.out.println('a');
		// ����Ÿ�� ���ͷ��� ���� ���¸� ���� �ʹٸ� �տ� (char)�� ���̸� �ȴ�.
		System.out.println((char) 97);
		System.out.println((char) 122);

		// ���� Ÿ�� ���ͷ��� �����δ� ���ڰ�(�ڵ尪)�� ���� �ֱ� ������ ����� ����.
		System.out.println('A' + 100); // ����� �⺻������ ���ڴ�. 165
		System.out.println((char) ('A' + 20)); // A���� 20��° �ڿ� �ִ� ���� ã��
		System.out.println((char) ('Z' - 13)); // M Z���� 13��° �տ� �ִ� ���� ã��
		System.out.println('A' - 'a'); // �빮�ڿ� �ҹ����� �Ÿ� -32
		System.out.println((char)('k' +('A'-'a'))); // �ҹ��� k�� �빮�� K�� ��ȯ
		System.out.println('L' - 'A'); // ���° ���ĺ����� �˾Ƴ� �� �ִ�.
		System.out.println("A" + 10);
		// ���ڿ��� ���ڰ� ���� �� ����� �� �ִ� Ÿ���̱� ������ �����ڵ�� ��ȯ�� �� ����.
		// ���� ����� A10

	}
}
