package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/*
� ���Կ��� ���� ��縦 Ȧ����° ����Ͽ��� �����Ѵٰ� �Ѵ�. ù°��, ��°�� �����?
1) �⵵�� ���� �Է��ϸ� �ش� ���� ��� ���� ��¥�� ������ִ� �޼��� 
2) �⵵�� �Է��ϸ� �ش� ���� ��� ���� ��¥�� ������ִ� �޼��� 
*/


public class D12_DiscountDay {
	
	public static void printYearEventDays(int year) {  //�׳� �������� ������ ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E", Locale.US);
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, 0, 1, 0, 0, 0); //�ʱ�ȭ
		
		int thurCnt = 1;
		while(cal.get(Calendar.YEAR) == year) { //���� �Է��� year�� ���� ����. 
			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) { //Calendar.THURSDAY��� ��� ���� . 5�� �ǹ�
				if(thurCnt % 2 == 1) {
					System.out.println(
							sdf.format(cal.getTime()) + ": " + thurCnt + "���� ������̹Ƿ� �̺�Ʈ���̴�.");
				}
				thurCnt++;
			}
			int month = cal.get(Calendar.MONTH);
			cal.add(Calendar.DATE, 1); //����Ʈ�� 1�� ������Ű��
			if (month != cal.get(Calendar.MONTH)) {
				thurCnt = 1; //���� �ٲ� ������ 1�� �ʱ�ȭ 
			}
		}
	}
	
	public static void printMonthEventDays(int year, int month) { //�޼��� ã�ƺ��� �ϴ� ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		//1. ����� ���� 
		cal.set(year, month-1, 1); //����Ʈ���� ������ �����ؾ� ��
		//2. ���� ����
		cal.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		//3. ���° �������� ���� //Calendar.DAY_OF_WEEK_IN_MONTH : �갡 ���° �����̳�
							//getActualMaximum() : ���� ���¿��� �ش� �ʵ��� �ִ밪�� �����ش�. 
		int maxDowim = cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		for(int dowim = 1; dowim <= maxDowim; dowim += 2) {
			cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, dowim);
			System.out.println(sdf.format(cal.getTime()) + "�� �̺�Ʈ���Դϴ�. ");
		}
	}
	
	
	public static void main(String[] args) {
		//printYearEventDays(2022);
		printMonthEventDays(2022, 7);
	}
	
	

	/*
	 ��Ǯ��.
	static Calendar now = Calendar.getInstance();
	static SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy�� MM�� dd��");
	
	static void setYnM(int year, int month) {
		//now.set(Calendar.YEAR, year);
		//now.set(Calendar.MONTH, month - 1);
		now.set(year, month - 1, 0, 0, 0, 0); //�̷��� ���� �� �ְڳ� 
		
		for(int i = 1, cnt = 0; i <= now.getActualMaximum(Calendar.DAY_OF_MONTH); ++i, ++cnt) {
			now.set(Calendar.DATE, i);	
			if(now.get(Calendar.DAY_OF_WEEK) == 5 && cnt % 2 == 1) {
				printAll(now);
			}	
		}
	}

	static void setY(int year) {
		now.set(Calendar.YEAR, year);
		//Ȥ�� now.set(year, 0, 0, 0, 0, 0);
		for(int i = 0; i < 12; ++i) {
			now.set(Calendar.MONTH, i);	
			for(int j = 1, cnt = 0; j <= now.getActualMaximum(Calendar.DAY_OF_MONTH); ++j, ++cnt) {
				now.set(Calendar.DATE, j);	
				if(now.get(Calendar.DAY_OF_WEEK) == 5 && cnt % 2 == 1) {
					printAll(now);	
				}	
			}
		}
	}
	
	public static void printAll(Calendar now) {
		String formatResult = myDateFormat.format(now.getTime());
		System.out.println(formatResult);	
	}
	
	public static void main(String[] args) {
		System.out.println("2022�� 6���� ������ : ");
		setYnM(2022, 6);
		
		System.out.println();
		
		System.out.println("2023���� ������ : ");
		setY(2023);

		
		
		
		
		//�����Ѱ� �ڡڡ�
		//System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
		//������ ���� ���� �� �׳� Calendar.DAY_OF_WEEK �ϸ� �� �ǰ� get(Calendar.DAY_OF_WEEK) ��� �ؾ� ��
	}
	 */
}
