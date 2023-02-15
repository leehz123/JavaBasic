package myobj.parking;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;


//�׽�Ʈ�� ���� �� ����� Ŭ���� 
public class CarFactory {
	private static HashMap<DayOfWeek, String> limitNumMap = new HashMap<>();
	
	static {
		limitNumMap.put(DayOfWeek.MONDAY	, "16");
		limitNumMap.put(DayOfWeek.TUESDAY	, "27");
		limitNumMap.put(DayOfWeek.WEDNESDAY	, "38");
		limitNumMap.put(DayOfWeek.THURSDAY	, "49");
		limitNumMap.put(DayOfWeek.FRIDAY	, "50"); //�ٵ� �̰� �� ParkingSystem���� �ְ� CarFactory���� �ִ°�? ������� �� �˰ٴ� ���Ϻ� ���ѹ�ȣ ��Ƴ��� Map �� ���⼭�� ���̰� ���⼭�� ���̴µ� private�� ������ �� ������  �׷� �ߺ��̶� ���� �������ִ� ���ۿ� 
		
		
	}
	
	
	//�̰� �������� ���� �� Cartype�� �������� ���� ���� ����� ���� 
	static CarType[] types = {Car.babyRide, Car.disabled, Car.lightCar, Car.normal, Car.normal, Car.normal, Car.normal, Car.normal, Car.normal, Car.normal};
	
	
	
	//�Ϻη� ���ڸ� ��ġ�ϴ� �������� ���� �׽�Ʈ �ϱ� ���� �޼��� (������ �ƹ��ų� ����)
	public static Car getLimitedTestCar() { 
		String carNum = "12��123";
		DayOfWeek dow = LocalDate.now().getDayOfWeek(); //dow�� ���� ���� ����
		
		String limitNum = limitNumMap.get(dow); //�׷� ���� limitNumMap���� dow(���ÿ���)�� �ش��ϴ� ���ѹ�ȣ�� ���������� 
			
		//�ָ��� ��� 
		if(limitNum == null) {// ��, �� �� limitNumMap �� �������� �ʾƼ� ������ �ָ��� ��� limitNumMap.get(dow)���� null�� ��ȯ�� 
			System.out.println("������ ���������� ���� �� ��� ���� ������ �����մϴ�. "); 
			return getRandomTestCar();	//�׷��� ����ī �� �Ѿ�� ����		
		}
		
		//Car(String carNum, CarType carType) �����ڷ� ���� �Ѱܼ� ���� CarŬ������ �ν��Ͻ� ��ȯ
		return new Car(  
				carNum + (limitNum.charAt((int)(Math.random() * 2))), //����ȣ�� ������ ��ȣ�� ���� ��ȣ 2 �� �߿� �ϰų� 
				types[(int)(Math.random() * types.length)]); // types�� �����ص� Cartype �߿��� �������� �ϳ� �̾Ƽ� �Ű������� �Ѱ� 

	}
	
	
	//12��123 �ڿ� �� �ڸ� �������� 0~9 ��� ���� ������ȣ ���� ������ ������ �ƹ��ų� ����
	public static Car getRandomTestCar() { 
		String carNum = "12��123";
		return new Car( carNum + (int)(Math.random() * 10) , types[(int)(Math.random() * types.length)] );
				
	}	
	
}
