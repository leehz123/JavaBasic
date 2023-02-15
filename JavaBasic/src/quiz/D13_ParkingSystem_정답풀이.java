package quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

import myobj.parking.CarFactory;
import myobj.parking.CarType;
import myobj.parking.Car;

public class D13_ParkingSystem_����Ǯ�� {
	
	private static HashMap<DayOfWeek, String> limitNumMap = new HashMap<>(); //�� ���Ϻ� ���ѹ�ȣ�� ��� �ؽø�
	private static HashSet<CarType> allowedCarType = new HashSet<>(); //������ ����� �� ����� ��� �ؽü�
	

	static { //static������ static{}�ʱ�ȭ ���� ����. ���ѹ�ȣ��ϸʰ� �����Ǵ�����(���Ƶ���, �����, ����)��ϼ��� �ʱ�ȭ ���ش� 
		limitNumMap.put(DayOfWeek.MONDAY	, "16");
		limitNumMap.put(DayOfWeek.TUESDAY	, "27");
		limitNumMap.put(DayOfWeek.WEDNESDAY	, "38");
		limitNumMap.put(DayOfWeek.THURSDAY	, "49");
		limitNumMap.put(DayOfWeek.FRIDAY	, "50");
		
		allowedCarType.add(Car.babyRide);
		allowedCarType.add(Car.disabled);
		allowedCarType.add(Car.lightCar);
		
	}
	
	//�Ű������� ���� ���� ����5������ �ɸ����� �ƴ��� �˻��ϴ� �޼��� 
					//�ƴ� quiz���丮�� CarŬ�� ��򰡿� �� �ֳ��� �� ������ ��Ŵٰ� ���� ���� 
	public void check(myobj.parking.Car car) {
		DayOfWeek todaysDow = LocalDate.now().getDayOfWeek(); //���� ���� todaysdow�� �����ϰ� 
		
		String limitNum = limitNumMap.get(todaysDow); //todaysdow�� key���� value ������ȣ�� ��ȯ. 
		
		// ������ �ָ��̶� limitNum�� ���� ���ѹ�ȣ String�� ���� �� (null) 
		if(limitNum == null) { 
			System.out.println("������ �ָ��̹Ƿ� ���� 5������ �������� �ʽ��ϴ�. ");
			return;
		}
		
		
		System.out.printf("������ %s�̹Ƿ� ����ȣ %c��, %c���� ������ ���ѵ˴ϴ�. ", 
							todaysDow.getDisplayName(TextStyle.FULL, Locale.KOREA) //�̷��̷��ϰ� �ٸ缭 ������ ǥ���϶� (��ȯ�� String) 
							, limitNum.charAt(0), limitNum.charAt(1));

		
		//�Ź�߼��� �Ѱܹ��� car�� allowedCarType�¿� ���Ե� ���� ���  
		if(allowedCarType.contains(car.getCarType())) {
			System.out.println("�����, ����, ���Ƶ��� ������ ���� 5������ ����� �ƴմϴ�. ");
			car.setState(1); //��������
		} else if (limitNum.contains(car.getLastNum())) {
			car.setState(2); //���Ա���
			System.out.println("���� 5������ ����̹Ƿ� ������ ���ѵ˴ϴ�. ");
		} else {
			System.out.println("���� 5������ ����� �ƴմϴ�. ");
			car.setState(1); //��������
		}
		
		
//		if(limitNum.contains(car.getLastNum())) {  //������ȣ�� ����ȣ�� ������ȣ�߿� �ش��ϸ�
//			car.setState(2);
//		} else {
//			car.setState(1);
//		}
	
	}
	
	
	
	public static void main(String[] args) {
		
		D13_ParkingSystem_����Ǯ�� sys = new D13_ParkingSystem_����Ǯ��();
		
		for(int i = 0; i < 100; i++) {
			//myobj.parking.Car car = CarFactory.getLimitedTestCar(); //�̷��� �ϸ� ���� ����ȣ�� ������ȣ 2�� �߿����� �������� �ٲ�� ������ ���� 
			myobj.parking.Car car = CarFactory.getRandomTestCar(); //�̷��� �ϸ� ���� ����ȣ�� 0~9���� �����̰� ������ ����
			System.out.println(car);
			sys.check(car);
			System.out.println(car);
			System.out.println("______________________________________");
		}

	}
}
