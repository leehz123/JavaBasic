package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*

 ������Ʈ�� ��ġ�� �� �ִ� �����̳ʿ��� ���̾ƿ��� ������ �� �ִ�. 
 
 # Border Layout
 �������ϰ� ����� �̷���� ���̾ƿ�
 JFrame�� �⺻��

 
 */

public class S02_BorderLayout {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("BorderLayout Test");
		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		BorderLayout manager = new BorderLayout();		
		f.setLayout(manager);

		f.add(new JButton("btn1"), BorderLayout.CENTER);
		f.add(new JButton("btn2"), BorderLayout.EAST);
		f.add(new JButton("btn3"), BorderLayout.WEST);
		f.add(new JButton("btn4"), BorderLayout.SOUTH);
		f.add(new JButton("btn5"), BorderLayout.NORTH);
		//ũ�������� �˾Ƽ� ���ڰ� �ڸ��� ��´ٴ� ���� ���̾ƿ��� ����
		
		
		//���̾ƿ��� ������Ʈ ���� �Ÿ� ���� 
		manager.setHgap(10);  // Horizontal (����) 
		manager.setVgap(30);  // Vertical (����) 
		
		
		
		
		
		

	}
	
}
