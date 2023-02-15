import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class D12_Calendar {

	
/*
#java.util.Calendar
�޷��� ������ Ŭ����
��¥ �� �ð��� ���� ����� �� �ִ� �پ��� ��ɵ��� �� �ִ�. 
������ ��� getInstance()��� static�޼��带 ����Ѵ�. 
			DateŬ������ Date now = new Date(); System.out.println("now : " + now); �̷��� �����ڷ� �ν��Ͻ� �����ؼ� ����߾���. 
Ÿ������ �����ϸ� �ٸ� ������ �ð��� �� �� �ִ�. 
 */

	
	
	public static void main(String[] args) {
		
		//Calendar now = new Calendar(); //Ķ������ �� Ķ������ �� �ȴ� �����ڷ� �ν��Ͻ� ���� �� ��.
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		//getInstance()�� ȣ���� ������ ���н�Ÿ�� time=1652671887717 �� �⺻������ �� ���� 
		
		
		
		
		
		//get(field) : �ش� �ν��Ͻ����� ���ϴ� �ʵ��� ���� ���� �� �ִ�. 
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH) + 1 + "��"); //�� ���� 0�� 1���̴�... �� �򰥷�!
		System.out.println(now.get(Calendar.DATE)); 
		//Hour�� 12�� ����, HOUR_OF_DAY�� 24�� ���� 
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		System.out.println(now.get(Calendar.MILLISECOND));
		//DAY_OF_WEEK : ����. (1~7�̰� �Ͽ����� 1) 
		System.out.println(now.get(Calendar.DAY_OF_WEEK)); //�Ͽ����� 1. 
		
		
		
		
		
		//add(field, value) : �ش� �ʵ忡 ���� ���� �� �ִ�.(���� �Է½� ����). ��ȯŸ���� void�� ���� 
		now.add(Calendar.HOUR_OF_DAY, 24); //20�ð��� ���ص� ��¥�� ������ ����. 
		System.out.println("2022/06/12�� 24�ð� ���� ��� : " + now.get(Calendar.DATE));
		
		now.add(Calendar.DATE, -300); //300���� ���� ���� ���ϰ��� 
		System.out.println("2022/06/12���� 365�� �� ��� : " + now.get(Calendar.YEAR));

		
		
		
		//set(field, value) : �ش� �ʵ尪 ����
		now.set(Calendar.MONTH, 0); //0�� 1�� 
		now.set(Calendar.MONTH, -3); //1���� ������ 1�� ���ؿ��� ���� 10���� �ǳ� 
		
		
		
		//Date�� �ִ� after, before�� ���⵵ �ֳ�
		Calendar cal = Calendar.getInstance();
		cal.set(2022, 6, 50, 13, 50, 55);
		System.out.println("now�� cal���� ���� �ð��Դϱ�? " + now.after(cal));
		System.out.println("now�� cal���� ���� �ð��Դϱ�? " + now.before(cal));
		//������� ���� now���� 2020�� 10�� 21�� 9:59:16�� �ٲ㳪�� ����� �̻��ϰ� �����°�
		
		
		
		//������ �޼���� �˾Ƽ� �� ã�ƺ��� Ȱ���ϼ��� �߳߳�
			
		
		
		
		
		
		// SimpleDateFormat ____________________________________________________
		
		
		System.out.printf("%d�� %d�� %d�� %d:%d:%d\n",
						now.get(Calendar.YEAR),
						now.get(Calendar.MONTH) + 1,
						now.get(Calendar.DATE),
						now.get(Calendar.HOUR),
						now.get(Calendar.MINUTE),
						now.get(Calendar.SECOND));
		
		//�̷� ������ printf�� ���Ĺ��ڸ� �̿��� ��¥�� ���Ŀ� �°� ����ϴ� ����� ������
		//SimpleDateFormat�̶�� Ŭ������ �̿��Ͽ� ��¥�ð������� ���������� ���ϰ� ��� ���� 
			
		
		
		
		/*
		
		SimpleDateFormat
		: Date�� ���� ����ϱ� ���� Ŭ���� 
		
		�� �����ϸ� ���� ���� �ش� ���� ǥ���� �� �ִ�. (LocaleŬ���� �̿�)
		SimpleDateFormat my DateFormat = 
			new SimpleDateFormat("yyyy�� MM�� dd�� D��° a HH:mm:ss EEEE" , Locale.CANADA);
		
		
		 SimpleDateFormat �� ���Ĺ��ڵ�
		y : ��
		M : ��
		d : �� 			 D : 365�� �� �� ��°����(ex.136��°) 
		h : 12�ð� ver 	 H : 24�ð� ver
		m : ��
		s : ��			 S : �и��� 		 
		E : ����
		a : ���� / ����

		*/
		
		
		
		SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� D��° a HH:mm:ss EEEE", Locale.US);

		//Locale.getDefault() : �츮�� ����ϴ� �ý��ۻ��� ��ġ 
		SimpleDateFormat myDateFormat1 = new SimpleDateFormat("yyyy�� MM�� dd�� D�Ϥ� a HH:mm:ss EEEE", Locale.getDefault());


		
		
		
		//�ɵ��� ����ϱ� 
		String formatResult_getTimeVer = myDateFormat.format(Calendar.getInstance().getTime());
		String formatResult_getTimeInMillisVer = myDateFormat.format(Calendar.getInstance().getTimeInMillis());
		
		System.out.println("�ɵ��� ��� (formatResult_getTimeInMillisVer) : " + formatResult_getTimeInMillisVer);
		System.out.println("�ɵ��� ��� (formatResult_getTimeVer) : " + formatResult_getTimeVer);
		
		//SimpleDateFormat�� DateŸ�� �Ǵ� ���н� Ÿ���� �����ؾ� �Ѵ�. 
		//Calendar.getTime() �Ǵ� Calendar.getTimeInMillis()�� �����ص� ��.

		 
		
		
		//TimeZoneŬ���� 
		//Ÿ������ �����ϸ� ���ϴ� ������ �ð����� ����� �� �ִ�. 
		
		
		
		myDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Dublin"));
		System.out.println("Ž�������� �ɵ��� ������ ��¥ (���� ������ ��¥�� �ð��� ��µ�) : " + myDateFormat.format(Calendar.getInstance().getTime()));
		//�̷� ������ �ɵ����� Ÿ������ �����ؼ� ����� ���� �ְ� 
		
		
		//Ķ���� �ν��Ͻ� �����ϸ鼭 �ٷ� ���� ������ ��¥�� �ð��� ������ ���� �ִ�. 
		Calendar noww = Calendar.getInstance(TimeZone.getTimeZone("Europe/Dublin"));
		System.out.println("������ ��¥ : " + noww.get(Calendar.DATE));
		System.out.println("������ �ð� : " + noww.get(Calendar.HOUR_OF_DAY));

		
		
		
		
		//TimeZone�� ���� ID ���� �̾ƺ���  
		for(String id : TimeZone.getAvailableIDs()) {
			System.out.println(id);
		}  
	
	}
}
