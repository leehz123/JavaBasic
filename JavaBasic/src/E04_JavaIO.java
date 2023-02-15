import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
# Java I/O (Input/Output)
자바는 스트림이라는 개념을 이용해 프로그램의 입출력을 다룬다. 
프로그램으로 들어오는 모든 데이터들을 입력이라고 부른다. 
프로그램에서 계산되어 나가는 모든 데이터들을 출력(Output)이라고 부른다. 

# Stream
데이터들이 오고가는 통로
데이터들이 프로그램으로 들어오는 통로를 InputStream 이라고 부른다. 
데이터들이 프로그램에세 목적지로 나가는 통로를 OutputStream이라고 부른다. 
데이터가 스트림으로 지나가기 위해선 해당 데이터를 바이트타입으로 변환시켜야 한다. 
(데이터를 자동으로 byte타입으로 분해 해주는 클래스들도 있다. )
 */


public class E04_JavaIO {
	public static void main(String[] args) {
		
		try {
			
			//우리는 콘솔대신 파일을 쓰고 있는 셈
			FileOutputStream out = new FileOutputStream("files/abc.txt"); //같은 폴더? 프로젝트 내에서 해야 됨 
			out.write(65);  // A
			out.write(66); // B
			out.write(67); // C
			//빨간줄이 뜨는데 기본적으로 해결해야 할 오류가 잇다는 것
			//빨간줄을 없애려면 나를 감싸고 있는 트캐문에 캐치를 추가해라(Add catch clause to surrounding try) 클릭 
			//클릭하면 catch (IOException e) {e.printStackTrace();} 추가됨
			out.write('\n');
			
			//str.getBytes() : 해당 문자열을 전송용 바이트 배열로 변환하는 메서드 
			out.write("안녕하세요 반갑습니다~~~~~~".getBytes());
			//다쓴 통로는 반드시 닫아줘야 한다. 
			out.close(); //스트림은 프로그램 스스로 언제 닫아줘야 할지 결정하지 못하기 때문에 우리가 수동으로 직접 닫아줘야 한다. 
			//사실 자바의 모든 변수들은 메모리 해제를 직접 해줘야 함. 정말 끔찍한 일.  원래는 Integer i;  free(i);해줘야 하는데 자바는 이걸 알아서 해줌.  
		
		} catch (FileNotFoundException e) { 
			//new FileOutputStream("files/abc.txt"); 처음에 파일 생성 안 해놓고 대뜸 텍파생성부터 해서 에러 떴었음. 
			e.printStackTrace();
		} catch (IOException e) { //out.write()...에 빨간줄 뜨는 거 해결하는 법(빨간줄 뜨는 곳에 마우스 갖다대거나 f2누르면 
			e.printStackTrace();
		}
		System.out.println("쓰기 완료");
	}
	
}



// files는 직접 만들어야 하고 텍스트파일은 저절로 생기는데 
//★실행★하고 files에 마우스 오른쪽-refresh하든가 f5 눌러야 파일 생김 