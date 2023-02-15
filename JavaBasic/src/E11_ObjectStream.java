import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
#ObjectInputStream , ObjectOutputStream
참조형 데이터(인스턴스)들을 전송할 수 있는 스트림
java에서만 해석될 수 있다는 단점이 있다. 
Serializable(;직렬화 가능한)인터페이스가 구현되어 있는 클래스만 전송할 수 있다.
Serializable인터페이스 : 만들어져있는 클래스를 0과 1로 변환해서 전송할 수 있다 라는 증명서가 되는 인터페이스 
 */



class Cup implements Serializable{

	//데이터 인코딩 또는 디코딩 시에 체크되는 ID
	private static final long serialVersionUID = 143258934054093L; //아이디는 걍 디폴드로 만들어주셈 
	
	String color;
	int capacity;
	
	public Cup(String color, int capacity) {
		this.color = color;
		this.capacity = capacity;
	}
 	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s[%d]", color, capacity);
	}
}


public class E11_ObjectStream {
	
	
	public static void main(String[] args) {
		
		File objectFile = new File("files/object.txt");
		try (
			
			//파일아웃풋스트림 : 파일에 내보낼 거고 / 시스템아웃풋스트림 : 콘솔에 내보내겠지
			//ver. 1 시스템아웃풋스트림
			//ObjectOutputStream out = new ObjectOutputStream(System.out);//파일 말고 시스템.아웃으로 내보내보겟음 바람직한 방법은 아니지만
			 		
				
				
			//ver. 2 파일아웃풋스트림
			FileOutputStream fout = new FileOutputStream(objectFile);
			ObjectOutputStream out = new ObjectOutputStream(fout);	
				
		) {
			
			out.writeObject(new Cup("Red", 600));
			out.writeObject(new Cup("Blue", 600));
			out.writeObject(new Cup("Green", 600));
			out.writeObject(new Cup("Yellow", 600));
	
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		
		
		try(
				FileInputStream fin = new FileInputStream(objectFile);
				ObjectInputStream in = new ObjectInputStream(fin);
				
		) {
			
			Object o1 = in.readObject();
			Object o2 = in.readObject();
			Object o3 = in.readObject();
			Object o4 = in.readObject();
			
			System.out.println(o1);
			System.out.println(o2);
			System.out.println(o3);
			System.out.println(o4);
			
			//정확하게 4번 썼으니까 4번 읽어들이는 거래 
			
			
			//Object타입으로 꺼내지기 때문에 사용하려면 다운캐스팅이 필요함! ★
			Cup c1 = (Cup) o1;
			System.out.println(c1.color);
			System.out.println(c1.capacity);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		//걍 이런게 있따 정도만 알아두기
		//얘가 자바에서만 사용되기 때문에 이럴 땐 좀 더 효율적인 방법이 있기 마련이지~
		
		
		
	}
}
