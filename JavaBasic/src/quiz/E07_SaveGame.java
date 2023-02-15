package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

import myobj.rps.Shape;
//아놔 그러네 이미 만들어진 클래스니까 걍 갖다 쓰면 되는거자나 이런.. 나 왜 첨부터 다시 만들었음 
//근데 다른 패키지 아닌가? 그래서 임포트 하고 static이라 바로 호출 가능한거구나 


public class E07_SaveGame {
//파일로 저장한다는 것 == 컴퓨터의 하드디스크에 데이터를 새기는 것 
//데이터에 내용을 새겨놓고 필요하면 언제든지 꺼내올 수 있는 것!
//하드디에 새겨진 것을 메모장으로 불러오는 것
	
	
	public static void main(String[] args) {
		
		int win = 0, draw = 0, lose = 0;
		
		File saveFile = new File("files/save.rps");
		File logFile = new File("files/rps.log");//만약에 승무패 로그를 찍고 싶을 경우 로그용 파일을 만들어서 
		
		try {
			
			FileReader in = new FileReader(saveFile);
			char[] buffer = new char[50]; //넉넉하게 한 50개 
			int len = in.read(buffer);
			
			String data = new String(buffer, 0, len);
	
			String[] record = data.split("/");
			win = Integer.parseInt(record[0]);
			draw = Integer.parseInt(record[1]);
			lose = Integer.parseInt(record[2]);
			
			in.close();
	
		} catch (FileNotFoundException e1) {
			System.out.println("세이브파일을 찾을 수 없어서 처음부터 시작합니다. ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// 덮어쓰기 말고 추가하고 싶을 경우 (append true) 
		try {
			FileWriter out = new FileWriter(logFile, true);
	
			for(int i = 0; i < 10; ++i) {
				Shape com = Shape.random();
				Shape user = Shape.random();
				
				out.write(String.format("컴퓨터 [%s] vs 유저[%s]\t" ,com, user));
				
				switch(Shape.versus(com, user)) {
				case 1:
					System.out.println("컴퓨 승");
					out.write("컴퓨승!");
					lose++;
					break;
				case -1:
					System.out.println("유저 승");
					out.write("유저승!");
					win++;
					break;
				case 0:
					System.out.println("비겼습니다.");
					out.write("무승부!");
					draw++;
					break;
				}
				out.write("  \t- " + LocalTime.now().toString() +"\n");
			}

			out.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
			
		
		
		//추가 안 하고 덮어쓰기 할 경우 saveFile에 저장 (append에 아무것도 안 써주거나 false)
		try {
			FileWriter out = new FileWriter(saveFile);
			//파일에 저장한다는 것은 다시 불러올 생각을 하면서 저장해야 됨. 거창하게 저장할 수록 숫자만 빼오기 힘들다
			//거창하게 넣으면 정규포현식으로 꺼내오면 되긴 함
			out.append(String.format("%d/%d/%d" , win, draw, lose));
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.printf("%d승 %d무 %d패로 10판이 끝났습니다. 전적을 저장합니다.\n", win, draw, lose);
			
	}	
}


















/*
컴퓨터와의 간단한 가위바위보 게임을 하나 만들고, 게임 종료시 전적을 파일에 저장해보세요.
게임을 다시 실행하면 예전 전적이 그대로 반영되도록 만들어보세요.
(게임에 저장기능을 추가하는 것. 게임을 저장하고 끄면 다시 켰을 때 전적이 남아 있고, 저장 안 하고 끄면 그 게임의 승패 날라가고)
그러면 기록 클래스를 파일로 만든다 생각하면 되는건가? 
 */