package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

import myobj.rps.Shape;
//�Ƴ� �׷��� �̹� ������� Ŭ�����ϱ� �� ���� ���� �Ǵ°��ڳ� �̷�.. �� �� ÷���� �ٽ� ������� 
//�ٵ� �ٸ� ��Ű�� �ƴѰ�? �׷��� ����Ʈ �ϰ� static�̶� �ٷ� ȣ�� �����Ѱű��� 


public class E07_SaveGame {
//���Ϸ� �����Ѵٴ� �� == ��ǻ���� �ϵ��ũ�� �����͸� ����� �� 
//�����Ϳ� ������ ���ܳ��� �ʿ��ϸ� �������� ������ �� �ִ� ��!
//�ϵ�� ������ ���� �޸������� �ҷ����� ��
	
	
	public static void main(String[] args) {
		
		int win = 0, draw = 0, lose = 0;
		
		File saveFile = new File("files/save.rps");
		File logFile = new File("files/rps.log");//���࿡ �¹��� �α׸� ��� ���� ��� �α׿� ������ ���� 
		
		try {
			
			FileReader in = new FileReader(saveFile);
			char[] buffer = new char[50]; //�˳��ϰ� �� 50�� 
			int len = in.read(buffer);
			
			String data = new String(buffer, 0, len);
	
			String[] record = data.split("/");
			win = Integer.parseInt(record[0]);
			draw = Integer.parseInt(record[1]);
			lose = Integer.parseInt(record[2]);
			
			in.close();
	
		} catch (FileNotFoundException e1) {
			System.out.println("���̺������� ã�� �� ��� ó������ �����մϴ�. ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// ����� ���� �߰��ϰ� ���� ��� (append true) 
		try {
			FileWriter out = new FileWriter(logFile, true);
	
			for(int i = 0; i < 10; ++i) {
				Shape com = Shape.random();
				Shape user = Shape.random();
				
				out.write(String.format("��ǻ�� [%s] vs ����[%s]\t" ,com, user));
				
				switch(Shape.versus(com, user)) {
				case 1:
					System.out.println("��ǻ ��");
					out.write("��ǻ��!");
					lose++;
					break;
				case -1:
					System.out.println("���� ��");
					out.write("������!");
					win++;
					break;
				case 0:
					System.out.println("�����ϴ�.");
					out.write("���º�!");
					draw++;
					break;
				}
				out.write("  \t- " + LocalTime.now().toString() +"\n");
			}

			out.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
			
		
		
		//�߰� �� �ϰ� ����� �� ��� saveFile�� ���� (append�� �ƹ��͵� �� ���ְų� false)
		try {
			FileWriter out = new FileWriter(saveFile);
			//���Ͽ� �����Ѵٴ� ���� �ٽ� �ҷ��� ������ �ϸ鼭 �����ؾ� ��. ��â�ϰ� ������ ���� ���ڸ� ������ �����
			//��â�ϰ� ������ �������������� �������� �Ǳ� ��
			out.append(String.format("%d/%d/%d" , win, draw, lose));
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.printf("%d�� %d�� %d�з� 10���� �������ϴ�. ������ �����մϴ�.\n", win, draw, lose);
			
	}	
}


















/*
��ǻ�Ϳ��� ������ ���������� ������ �ϳ� �����, ���� ����� ������ ���Ͽ� �����غ�����.
������ �ٽ� �����ϸ� ���� ������ �״�� �ݿ��ǵ��� ��������.
(���ӿ� �������� �߰��ϴ� ��. ������ �����ϰ� ���� �ٽ� ���� �� ������ ���� �ְ�, ���� �� �ϰ� ���� �� ������ ���� ���󰡰�)
�׷��� ��� Ŭ������ ���Ϸ� ����� �����ϸ� �Ǵ°ǰ�? 
 */