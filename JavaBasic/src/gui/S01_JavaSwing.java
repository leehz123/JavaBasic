package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 
 
 # Java Swing
 javax.swing ��Ű���� Ŭ������
 GUI���α׷��� ���� �� �ִ�. 
 
 
 # Container 
 - ���� ������Ʈ���� ��ġ�� �� �ִ� ��
 - JFrame, JPanel, JDialog, ... �� �پ��� Ŭ������ �����̳� ������ �� �� �ִ�. 
 - �����̳ʿ��� ���̾ƿ��� ������ �� �ִ�.
 
 
 # Component
 - �����̳� ���� ��ġ�� �� �ִ� �پ��� �͵�
 - ��ư, ǥ, �����̴�, �޴�, ... �� �پ��� Ŭ������ ������Ʈ ������ �� �� �ִ�. 

 */



public class S01_JavaSwing {
	public static void main(String[] args) {
		
		
		//������ �ν��Ͻ� ����
		JFrame frame = new JFrame("GUI ���α׷���");
		frame.setLayout(null);//������Ʈ�� ũ�⸦ ���� �����ϱ� ���ؼ��� ���̴� ���� ���̾ƿ��� ����� �Ѵ�.
		
		
		//������ ���� �ٸ� ������Ʈ�� ���� �� �ִ�.
		JButton btn = new JButton("THIS IS A BUTTON");
		JButton btn2 = new JButton("BUTTON2");
		
		
		//��ư�� ��ġ�� ũ�� ���� ����
		btn.setLocation(50, 50);
		btn.setSize(200, 30);
		 

		btn2.setLocation(300, 50);
		btn2.setSize(95, 300);

		frame.add(btn);
		frame.add(btn2);
		

		
		//�������� x��ư�� ������ �� ������ ������ �� �ִ�.
		/*
		 ������ �� �ִ� int���� JFrame�� ����� ������ �ִ�. 
		 EXIT_ON_CLOSE : x��ư�� ������ ���α׷��� �����Ѵ�. 
		 DISPOSE_ON_CLOSE : ���� ����
		 DO_NOTHING_ONCLOSE : ���� ����
		 HIDE_ON_CLOSE : ���� ���� 
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);     
		//��Ÿ ��� .. ã�Ƽ� ��� 
	
		
				
		//������ ũ�� ����
		frame.setSize(500, 500);
		
		
		
		//������ ��ġ ����
		frame.setLocation(100, 100); //���������� ��� x�� '+ ����� ũ��' ����� ��.  (100 + 1920, 100)
		
		
		
		//�������� ���̰� ���� (�� �������� ���ִ� ���� ����. ��͵��� �߰� ��͵��� �� �ߴ� ���� ����) 
		frame.setVisible(true);
				
		
		
	}
}



/*

setDefaultCloseOperator(JFrame.EXIT_ON_CLOSE):
System�� exit�޼��带 ����� ���ø����̼� ���� 

�ٵ� �̷��� �ϸ� ���ϱ� �ѵ� JVM(Java Virtual Machine) ������ ������ ǥ�� ������ �����찡 �ı�(����)�Ǹ� 
JVM�� ���� �����
�ذ����� 
frame.addWindowsListener(new WindowAdapter() {
	@Overriding
	public void windowClosing(WindowEvent e)  {
		System.exit(0); 
	}
}); �̷��� ����ϸ� �� 






------------------------------�̷� �͵� �ֳ�... ����?---------------------------------
public class WindowAdapterInnerTest extends JFrame{


	JLabel lb = new JLabel("WindowAdapter�׽�Ʈ��");

	public WindowAdapterInnerTest() {
		add(lb);
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		AdapterInner ai = new AdapterInner();
		addWindowListener(ai);
	
	}
		
	class AdapterInner extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent we) {
			lb.setText("������ �̺�Ʈ ó����");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new WindowAdapterInnerTest();
	}
}









*/