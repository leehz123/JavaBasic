package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


//�̷��� ��� �޾Ƽ� �ϵ��� �����

public class S03_JButton extends JFrame{ //�� Ŭ���� ��ü�� JFrame�� �Ǵ� �� 
	
	JButton mainBtn = new JButton();
	JButton subBtn = new JButton();
	//��״� �κ��̴ϱ� �� �������� ���� �� ���� ���� �������
	
	
	public S03_JButton() { //S03_JButton �� JFrame�� ��� ��ɰ� ������ �����޾����ϱ� �װ� ����ϴ� �͵� �����ϰ��� �翬�� 
	
		//������ ������
		setTitle("JButton Practice!!");
		setLocation(50, 50);
		setSize(500, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
		//�ؽ�Ʈ ����
		mainBtn.setText("main");
		subBtn.setText("click!");
		
		
		//�۲� ����
		mainBtn.setFont(new Font("Brush Script MT", Font.BOLD, 50));
		subBtn.setFont(new Font("Brush Script MT", Font.BOLD, 50));
		//c����̺� - windows - Fonts ���� ��Ʈ ���� 
		
		
		//���� ���� (�� �ڵ� #RRGGBB ���̳���) 
		mainBtn.setForeground(new Color(0xFFFFFF));
		mainBtn.setBackground(new Color(0x000000));
		subBtn.setForeground(new Color(0x000000));
		subBtn.setBackground(new Color(0xf5f5dc));
		
		
		//��ư �̺�Ʈ ����(�׼� ������)
		subBtn.addActionListener (new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {	
				mainBtn.setText(Integer.toString((int)(Math.random() * 100)));
			}
		});
		
		
		add(mainBtn, BorderLayout.CENTER);
		add(subBtn, BorderLayout.EAST);
		

	}
	//�̷� ���·� ��ư�� ��ư Ŭ���� �ļ� ��Ƴ���, .. �̷��� Ŭ���� ���� ��Ƴ��� �����ڷ� ȣ���ϴ°� ����� 
	
	
	
	
	
	public static void main(String[] args) {
		
		new S03_JButton();

	}
	
	
}
