
public class B07_CharAt {
	/*
	 # "���ڿ�".characterAt(index); 
	 �ش� ���ڿ����� ���ϴ� �ε����� ���ڸ� charŸ������ ������ �Լ�
	 
	 # "���ڿ�".length; 
	 �ش� ���ڿ��� �� ���� ���ڷ� �̷�������� intŸ������ ��ȯ�ϴ� �Լ� ���ڿ��� ������ �ε�����
	 '����-1'�̴�.
	 */

	public static void main(String[] args) {
		String msg = "My name is sausage";
		System.out.println(msg.charAt(5)); // ���� �����ؼ� ���ڼ��� ��. ����� m

		System.out.println("msg�� ����:" + msg.length());
		for (int i = 0; i < msg.length(); i++) {
			System.out.println(msg.charAt(i));
		}
	}
}
