
public class B05_Operator3 {
	/*
	 # ���� ������ 
	 = : ������ ������ �������� ���� �����Ѵ�.
	  
	 # ���� ���� ������ 
	 += : �ش� ������ ���� ������Ű�� ���� +=, -=, *=, /= , ...
	 
	 #���� ������ 
	 �ش� ������ ���� 1�� ������Ű�� ���� 
	 ++, --�� ��ġ�� ���� ����� �޶�����. 
	 ���������� �ش� ���� ��� ����� ������ �Ŀ� ���� ���Ѵ�. 
	 ���������� �ش� ���� ����� �����ϱ� ���� ���� ���Ѵ�.
	 */
	public static void main(String[] args) {
		int num = 100;

		num += 5;
		// num = num + 5;
		num /= 5; // num = num + 5;
		num *= 5; // num = num * 5;
		num %= 5; // num = num % 5;

		System.out.println(num); // 105

		num = 10;
		num++; // �� num = num + 1;�� ����.
		System.out.println(num);
		++num;
		System.out.println(num);

		num--; // �� num = num - 1;�� ����.
		System.out.println(num);
		--num;
		System.out.println(num);

		num = 20;
		num++;
		System.out.println(num);
		// 20���� ��µ� ��(�� ���� ��ɾ �� ������ ��)�� 1�����ؼ� num=21;�� ��.
		// ���׿������� ��ġ�� ���� ����� �޶�����.

		num = 20;
		System.out.println(num--); // 20
		num = 20;
		System.out.println(--num); // 19
	}
}
