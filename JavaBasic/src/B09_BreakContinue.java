
public class B09_BreakContinue {
/*
# Break
switch-case������ ����ϸ� �ش� case�� Ż���Ѵ�. 
�ݺ��� ������ ����ϸ� �ش� �ݺ����� Ż���Ѵ�. 

# Continue
�ݺ��� ���ο��� ����ϸ� �� ��� ���� �ݺ����� �Ѿ��. 
continue�� ���� ����, �Ʒ��� ���� �ڵ�� ��� �����Ѵ�. 

 
 */
	public static void main(String[] args) {
		for(int i=0; i<100; ++i) {
			System.out.println(i);
			if(i==66) {
				break;	
			}
		}
		System.out.println("�ݺ��� ��");	
		
		for (int i=0; i<1000; i++) {
			
			if(i%10==0) {
				continue;
				//i=0�� ���� �� ���� ���� 0~999���� 0, 10, 20, 30,... 990���� �� ����. 
			}	
			System.out.println(i);
		}
	
		
		
		
	}		
}
