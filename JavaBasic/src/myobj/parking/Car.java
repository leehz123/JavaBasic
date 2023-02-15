package myobj.parking;


// CarType Ŭ���� : �����, ���Ƶ���, �Ϲ�, ���� �� ���� ������ �����ϱ� ���� Ŭ���� 
// Car Ŭ���� : CarTypeŬ������ ����� ���� + carNum , state(�������ɿ���) �� ���� ������ �����ϱ� ���� Ŭ���� 

//


public class Car {
	//����� ���Ƶ��� ���� �Ϲ�					//	       val, name
	final public static CarType normal 	 = new CarType(0  , "�Ϲ�"); //CarType(int value, String name)
	final public static CarType disabled = new CarType(1  , "�����");
	final public static CarType babyRide = new CarType(2  , "���Ƶ���");
	final public static CarType lightCar = new CarType(3  , "����");
	
	private static String[] parkState = {"�Ǻ���", "��������", "���Ա���"}; 
	
	
	private String carNum;
	private CarType carType;
	private int state; //����� �Ϸ��� �굵 public static final ���·� ������ �ϴµ� �׷� �Ӹ� �����ϱ� �� ��
	
	
	public Car(String carNum, CarType carType) {
		this.carNum = carNum;
		this.carType = carType;
		
	}
	
	public void setState(int state) { //��� ���������� ����� ����Ǵ� �����ڴ�? �׷��� �����ڷ� �ʱ�ȭ �� �ϰ� �޼��带 ���� ���ص� 
		this.state = state;
	}
	
	@Override
	public String toString() {
						//    ����ȣ - carType - [�������ɿ���]
		return String.format("%s - %s - [%s]", carNum, carType.getName(), parkState[state]);
	}
	
//-----------------------------------------------------private �� public�޼���� ����-----------------------------------------------------����	
	
	//carType������ private�� �̷��� public�޼��带 ���ؼ� �ٱ� Ŭ�������� ���� ����
	public CarType getCarType() {	
		return carType;
	}
	
	
	public String getLastNum() {
		return carNum.substring(6); //String�� ��ȯ�ϰ� �����ϱ� charAt�� ������ �ϴ� substring �� beginIndex ���� ������ ������ ���ڴϱ� endIndex�� �� ���൵ ��  
		/*
		 charAt() ��ȯŸ�� : char
		 substring() ��ȯŸ�� : String 
		 */
	}
	
	public String getCarNum() {
		return carNum;
	}
}
