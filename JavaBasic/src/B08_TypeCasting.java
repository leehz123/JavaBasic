
public class B08_TypeCasting {
/*
# 타입 캐스팅
특정 데이터의 값은 그대로 두고 타입만 변환할 때 사용하는 문법
해당 값이 손상될 우려가 있을 때는 강제로 타입을 변환시킨다. 
해당 값이 손상될 우려가 전혀 없을 때는 알아서 타입이 변한다. 

 */
	public static void main(String[] args) {
		byte _byte = 11; // 표현범위 -128 ~ 127
		int _int = 22; // 표현범위 -21억 ~ 21억
		
		//1. 자연스러운 타입캐스팅
		//4byte에 1byte값을 넣을 때는 알아서 타입이 변한다. (byte -> int)
		_int = _byte;
		System.out.println(_int);
		
		//2. 값이 손상될 수도 있는 타입 캐스팅
		//더 넓은 범위의 값을 작은 변수에 넣으려고 할 때 값이 손상될 우려가 있어 컴파일 에러 발생.  
		//개발자가 강제로 타입캐스팅 해야 컴파일이 가능해진다.
		_byte = (byte)_int; 
		//근데 11이라 손상될 우려가 없는데 뭐가 손상돼~ 이럴 땐 억지로 바꿔줄 수 있음
		 
		int _int_ = 200;
		_byte = (byte)_int_; 
		System.out.println(_byte);
		//이럴 땐 값의 손상이 발생. 
		
		//3. 해석을 다르게 하고 싶은 타입 캐스팅
		int ch = 65;
		double value = 70.123; 
		int a =3, b = 7;
		
		
		System.out.println(ch);
		System.out.println((char)ch);
		System.out.println(value);
		System.out.println((int)value); //value의 소수부 .123 날라감. 
		System.out.println(a / b);
		System.out.println(a / (double)b); //한쪽이 실수면 결과도 실수 
	} 
}
