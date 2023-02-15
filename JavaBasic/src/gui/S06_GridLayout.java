package gui;

import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.component.ColorStateButton;

//�׸���� ũ�������� �� ��. �� ĭ ������ ���� �� �� ����  GridBackLayout ���۸��ϸ� ���� 
//�׸���鷹�̾ƿ��� �����߿� �� ���� �� ���� �� ���� ���� �׹鷹�� ���� 


//��Ƴ׿� ��ü���� ^_________^....

public class S06_GridLayout extends JFrame{
	
	public S06_GridLayout() {
		
		LayoutManager manager = new GridLayout(5, 10); //row 5�� col 10�� 
		
		for(int i = 0; i < 50; ++i ) { //��� ���� 5�� 10���� �������µ� ��ư�� �Ϻη� 42���� �־�� â �ø��� ���� ������ ��ư��ġ�� �޶�����. ��� �� �� ������ ��ư�� �����ִ°�
			JButton button = new ColorStateButton(i+1);
			add(button);
			
		}
		
		setLayout(manager);
		setBounds(500, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new S06_GridLayout();
	}
}
