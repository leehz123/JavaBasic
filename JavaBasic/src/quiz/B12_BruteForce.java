package quiz;

public class B12_BruteForce {
	/*
	������ 4�ڸ� �ӽ� ��й�ȣ�� ���� ������ ��� ��й�ȣ�� �����ϰ� �����ϴ� ���α׷��� ����� ������. 
	 �ӽ� ��� ��, ��, Ư�� �������ڳ�
	 �׷� ����� 
	 0000
	 0001
	 0002
	 ...
	 �̷��� �ݺ����� �־ �����鼭 ������ ����.
	 */
//�״ϱ� ��� ����� ���� ����� ���ڳ�... 4*3*2*1���� ����� ����...

	public static void main(String[] args) {
		String symbols = "abcdefghijklmnopqrstuvwxyz" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "0123456789" +  "!\"#$%^&'()+,-./:;<=>@[]^_'{|}~\\";  //�� 93���� ���� _ �߰��ȵ�
				//�� 92�� 
		
		//����Ǯ��. 
		//�̰� ������ ����� �ϸ� �����ɸ��� �׳� ��� �� �ϰ� ã�⸸ �ϸ� ���� ��ٸ��� �ݹ� ����
		// �����ϳ�^^...
		//���� ��й�ȣ�� 100�ڸ��� �޼ҵ带 �̿��ؼ� ��͸� ����ϱ� ���� ���� 
		String  password = "[]a4";
		
		for(int i=0; i<symbols.length();++i) {
			String temp = "";  
			temp += symbols.charAt(i);
			//System.out.println(temp);
			for(int j = 0; j < symbols.length(); ++j) {
				String temp2 = temp + symbols.charAt(j);
				//System.out.println(temp2);
				for(int k = 0; k < symbols.length(); ++k) {
					String temp3 = temp2 + symbols.charAt(k);
					//System.out.println(temp3);
					for(int l = 0; l < symbols.length(); ++l) {
						String temp4 = temp3 + symbols.charAt(l);
						
						if (temp4.equals(password)) {	
							System.out.println("ã�� ��й�ȣ�� " + temp4 + "�Դϴ�. ");
							return;
						}
					}
				}
			}	
		}


/*	����. ��й�ȣ 100�ڸ��� �� ver.  (�̷� ����� �� �� ���µ� for�� ���� ������ ���� for������ Ǯ�)
	 	password	symbolindex	index
					(93�����ΰ�)
		aaaa		0000		0
		aaab		0001		1
		aaaj		000(9)
		aaak		000(10)
		..
		aaa}		000(90)		90
		aaa~		000(91)		91
		aaa/		000(92)		92
		aaba		0010		93		1�ΰ� ����Ϸ��� /93�ϸ� ��
		aabb		0011		94
					001(32)		125      125%93 =32 32�� �ڸ��ø��ؼ� ����° �ڸ��� �� �ִ� �� 
					
		String  password = "[]a4";
		double max_index = Math.pow(symbols.length(),4); //788074896
		String brute_password = "";
		
		//369�� �� ���ڸ� �ϳ��� �и��ϴ� ��� �̿��ϸ� ��. 
		//�� ������ ���� 1�ڸ��� 93�� �ݺ� 2�ڸ��� 93(�ٱ� for)*93�ݺ�(���� for)
		for (int i = 0; i < max_index; ++i ) {
			//i�� 0�� �� 0000 1�� �� 0001 ... 93�� �� 000(92) 0010 0011 0012 ... 001(92) 0021 ... 002(02)... 
			//ù��° �ڸ����� �Ӱ� ���ٴ� ��? 
			int brute_index = i;
			
			for(int j = 0; j <4 ; ++j) {
				brute_password += symbols.charAt(brute_index % symbols.length());
				brute_index /= symbols.length();
			
			}
			System.out.println(brute_password);
		}
			//brute_password += symbols.charAt(i/symbols.length()/symbols.length()/symbols.length() % symbols.length());
			//brute_password += symbols.charAt(i/symbols.length()/symbols.length() % symbols.length());
			//brute_password += symbols.charAt(i/symbols.length() % symbols.length());
			//brute_password += symbols.charAt(i%symbols.length());
			
			
	
		//���ڿ��� �������� +=���� ���ڿ��� �� ���ھ� �ϼ���Ű�� �� �ſ� ������ ������ �� ����. 
		 * ���ڿ��� �� ���ھ� �ϼ���Ű�� ���� ���� String Builder(���ڿ��� ����� ���� ���� Ŭ����) ��� Ŭ������ ���. 
		   (��ĳ�� ���鶧ó�� Ŭ���� ���� ���)
		 * append() : += �� ���ڸ� �� ���� �ڿ� �߰��ϴ� �Ͱ� ���� ȿ���� ���� �޼���.
		 * StringBuilder�� ������ٴ� �� ���ڿ��� ����ٴ� �Ͱ� ���� append�� �� �ڿ� ���̴� ��.
		 * �ݴ�� insert()�� �ش� ���ڿ��� �� �տ� �߰��ϴ� �޼ҵ�. 
		   
		 for(int j = 0; j <4 ; ++j) {
				StringBuilder brute_password_builder = new StringBuilder();
				brute_password.insert(0, symbols.charAt(brute_index % symbols.length()));
				brute_index /= symbols.length();
			}
			String brute_password = brute_password_builder.toString();
			Sytem.out.println(brute_password);
			
*/		
		
		
		

/*		�� Ǯ��. 
 * //for���� 4����ø���� ������ �ϳ�..?
 		for(int first = 0; first < 92; first++) {
			tmp_pwd += symbols.charAt(first);
			//System.out.println(tmp_pwd);
			for(int second = 0; second < 92; second++) {
				tmp_pwd += symbols.charAt(second);
				
				for(int thrid = 0; thrid < 92; thrid++) {
					tmp_pwd += symbols.charAt(thrid);
					
					for(int fourth = 0; fourth < 92; fourth++) {
						String result = tmp_pwd + symbols.charAt(fourth);
						System.out.println(result);	
						
					}
				}
			}
		}
*/

			
	

		
		
	}
}
