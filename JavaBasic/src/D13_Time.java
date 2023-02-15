import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;


/*

# java.time.* (time��Ű�� �Ʒ� ����)
Calendar�� �������� ������ ������ �ð��� �ٷ�� Ŭ���� 
Calendar�� set()�� ���� ���� �ν��Ͻ��� ����ؼ� ����������
java.time��Ű���� Ŭ�������� ������ �����ϰ� ���ο� �ν��Ͻ��� ��ȯ�Ѵ�. ��
LocalDate��¥��, LocalTime�ð�, LocalDateTime��¥�ͽð��� �� �� �ٷ� �� 

 */


public class D13_Time {	
	public static void main(String[] args) {
		
		//now : ���� �ð��� �ν��Ͻ��� ��ȯ�ϴ� �޼���
		System.out.println("�ð��� : " + LocalTime.now());
		System.out.println("��¥�� �ð� : " + LocalDateTime.now());
		System.out.println("��¥�� : " + LocalDate.now());
		
		
		//of : ���ϴ� �ش� ������ �ν��Ͻ��� ��ȯ�ϴ� �޼���
		System.out.println(LocalDate.of(2002, 5, 10)); //Calendar�� ���� 0���� �����߾��µ� �̰Ŵ� 1���� �����ؼ� ����
		System.out.println(LocalDate.of(2020, Month.FEBRUARY, 29));
		System.out.println(LocalTime.of(13, 30, 59, 999999999)); //���뼼������� ��. 
		
		//�̷� ������ ���� ���� �͵� ����
		System.out.println("����� : " + LocalDateTime.of(LocalDate.now(), LocalTime.of(12, 50)));  

		
		
		
		
		
		
		
		
		//�׸��� Time��Ű���� Ŭ��������� ������ �����ϰ� �� �ν��Ͻ��� ��ȯ�Ѵ���? 
		//�� �� �ϳ��� LocalTimeDateŬ������ ����� �� ������ ���� 		
		LocalDateTime ldt = LocalDateTime.now();
		
		ldt.of(2022, Month.JANUARY, 2, 12, 3, 50, 99999999); //�̷��� ��������µ��� 
		System.out.println(ldt); //ldt�� ������ �״���̴�! �ڡڡڡ�
		
		System.out.println(ldt.of(2022, Month.JANUARY, 2, 12, 3, 50, 99999999));
		//����� ���� �ٷ� ����Ϸ��� �̷��� �ٷ� print����� �Ѵٴ� �� !
		
		//�׸��� ����� ���� �� �ν��Ͻ��� �����ǹǷ� ���ο� ������ �ļ� �ű⿡ ������ �ȴ�. 
		LocalDateTime newLdt = ldt.of(2022, Month.JANUARY, 2, 12, 3, 50, 99999999);
		
		
		
		
		
		
		
		
		
		
		//__________________________________________________
		//�ν��Ͻ��κ��� ����� �ν��Ͻ� �����ϱ�
		LocalDate today = LocalDate.now();
		LocalDate nextYear = today.plusYears(1);
		LocalDate nextMonth = today.plusMonths(-5);
		LocalDate minusDays = today.minusDays(10);
		//LocalDate minusDays = today.minusDays(-10); //�򰥸��� �� �Ѵ� �ű� �ѵ� �����ϱ� �Ԥ� 
		
		
		
		//plusYear���� �޼��带 ����ص� ������ ������ �ʴ´�. 
		System.out.println("today: " + today);
		System.out.println("today.plus(10, ChronoUnit.MONTH)); : " + today.plus(10, ChronoUnit.MONTHS)); //���� 10���� ����� copy�� ����
		System.out.println("today: " + today);
		System.out.println("nextYear : " + nextYear);
		System.out.println("nextMonth : " + nextMonth);
		System.out.println("minusDays : " + minusDays);
		
		
		
		
		
		
		//java.time.DateTimeFormatter 
		//Calendar�� SimpleDateFormató�� DateTimeFormatter�� �ִ�. 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("��Ÿ�� : " + "yyyy��MM�� dd�� /EEEE");
		System.out.println(dtf.format(today));
		
		
		
		
		
		// .isAfter() .isBefore() .isEqual() 
		LocalDate chilrensDay = LocalDate.of(2022, 12, 25); 
		System.out.println("ũ���������� ��������?  (�������ΰ��� �� �ƴ϶� ����������!��) :" + today.isAfter(chilrensDay));
		System.out.println("ũ�������� ���� �־�����? :" + today.isBefore(chilrensDay));
		System.out.println("������ ũ����������? : " + today.isEqual(chilrensDay));
		
		
		
		//Ư�� �ʵ尪 ������
		DayOfWeek dow = today.getDayOfWeek();
		System.out.println("������ ���� : " + dow.getValue());						
		System.out.println("������ ������ �ѱ������� ǥ�� : " + dow.getDisplayName(TextStyle.FULL, Locale.KOREA));
		System.out.println("������ ������ �̱������� ǥ�� : " + dow.getDisplayName(TextStyle.FULL, Locale.US)); 
		System.out.println("������ ������ �̱������� ª�� ǥ�� : " + dow.getDisplayName(TextStyle.SHORT, Locale.US)); //Locale.US : ���
		
		
		//with()���� ��¥ ���� �����ϱ�
		// -TemporalAdjusters�� ��¥�� ������ �� �ִ� ���� Adjusters�� �� �� �ִ�. 
		System.out.println("�̹����� ù��° �� : " + today.with(TemporalAdjusters.firstDayOfMonth()));//������ �������� �̹����� ù��° ��¥�� ����
		System.out.println("�̹����� ������ ��¥ : " + today.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println("�̹����� ������ �ݿ��� : " + today.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY))); //������ ���ڷ� ����
		System.out.println("�������� ù��° �� : " + today.with(TemporalAdjusters.firstDayOfNextYear()));
		
		
		
		//�̷������� ������ ������ ���� ����ϴ� �͵� ���� 
		System.out.println("�ٴٴ����� ������ : " + today.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)) //������ �������� 
				.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)) //������ �������� 
				.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY))); //������ �������ΰ�?		
		//__________________________________________________
		
		
	}
}
