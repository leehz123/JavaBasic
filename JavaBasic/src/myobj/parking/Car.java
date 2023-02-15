package myobj.parking;


// CarType 클래스 : 장애인, 유아동승, 일반, 경차 에 대한 정보를 저장하기 위한 클래스 
// Car 클래스 : CarType클래스에 저장된 정보 + carNum , state(주차가능여부) 에 대한 정보를 저장하기 위한 클래스 

//


public class Car {
	//장애인 유아동승 경차 일반					//	       val, name
	final public static CarType normal 	 = new CarType(0  , "일반"); //CarType(int value, String name)
	final public static CarType disabled = new CarType(1  , "장애인");
	final public static CarType babyRide = new CarType(2  , "유아동승");
	final public static CarType lightCar = new CarType(3  , "경차");
	
	private static String[] parkState = {"판별중", "주차가능", "진입금지"}; 
	
	
	private String carNum;
	private CarType carType;
	private int state; //제대로 하려면 얘도 public static final 형태로 만들어야 하는데 그럼 머리 터지니까 걍 함
	
	
	public Car(String carNum, CarType carType) {
		this.carNum = carNum;
		this.carType = carType;
		
	}
	
	public void setState(int state) { //얘는 최종적으로 결과가 저장되는 셈이자늠? 그래서 생성자로 초기화 안 하고 메서드를 따로 파준듯 
		this.state = state;
	}
	
	@Override
	public String toString() {
						//    차번호 - carType - [주차가능여부]
		return String.format("%s - %s - [%s]", carNum, carType.getName(), parkState[state]);
	}
	
//-----------------------------------------------------private 값 public메서드로 빼기-----------------------------------------------------ㅍㅍ	
	
	//carType변수는 private라서 이렇게 public메서드를 통해서 바깥 클래스에서 접근 가능
	public CarType getCarType() {	
		return carType;
	}
	
	
	public String getLastNum() {
		return carNum.substring(6); //String을 반환하고 싶으니까 charAt의 역할을 하는 substring 에 beginIndex 적고 어파피 마지막 글자니까 endIndex는 안 써줘도 됨  
		/*
		 charAt() 반환타입 : char
		 substring() 반환타입 : String 
		 */
	}
	
	public String getCarNum() {
		return carNum;
	}
}
