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
������ ������(�ν��Ͻ�)���� ������ �� �ִ� ��Ʈ��
java������ �ؼ��� �� �ִٴ� ������ �ִ�. 
Serializable(;����ȭ ������)�������̽��� �����Ǿ� �ִ� Ŭ������ ������ �� �ִ�.
Serializable�������̽� : ��������ִ� Ŭ������ 0�� 1�� ��ȯ�ؼ� ������ �� �ִ� ��� ������ �Ǵ� �������̽� 
 */



class Cup implements Serializable{

	//������ ���ڵ� �Ǵ� ���ڵ� �ÿ� üũ�Ǵ� ID
	private static final long serialVersionUID = 143258934054093L; //���̵�� �� ������� ������ּ� 
	
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
			
			//���Ͼƿ�ǲ��Ʈ�� : ���Ͽ� ������ �Ű� / �ý��۾ƿ�ǲ��Ʈ�� : �ֿܼ� ����������
			//ver. 1 �ý��۾ƿ�ǲ��Ʈ��
			//ObjectOutputStream out = new ObjectOutputStream(System.out);//���� ���� �ý���.�ƿ����� ������������ �ٶ����� ����� �ƴ�����
			 		
				
				
			//ver. 2 ���Ͼƿ�ǲ��Ʈ��
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
			
			//��Ȯ�ϰ� 4�� �����ϱ� 4�� �о���̴� �ŷ� 
			
			
			//ObjectŸ������ �������� ������ ����Ϸ��� �ٿ�ĳ������ �ʿ���! ��
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
				
		//�� �̷��� �ֵ� ������ �˾Ƶα�
		//�갡 �ڹٿ����� ���Ǳ� ������ �̷� �� �� �� ȿ������ ����� �ֱ� ��������~
		
		
		
	}
}
