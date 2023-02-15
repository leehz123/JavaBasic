package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class S04_Event extends JFrame {
	
	public S04_Event() {
		super("Event!"); // == JFrame f = new JFrame("Event!");
		
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		
		//����� ����, ����� ���� ������Ʈ
		JLabel label = new JLabel("Hello!");
		
		//SwingConstants.CENTER : Swing���� ���Ǵ� ���� ������� �� ����. (�̷��� ���۸�) 
		//label.setVerticalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		//�� ���� ���콺 �� ���������� �׶��̼����� ���� �ٲ�� �� ������ �ʹ�. 
		
		
		//���콺 �� �̺�Ʈ
		//-1 �ٿø��� / 1 �ٳ����� 
		label.addMouseWheelListener(new MouseWheelListener() { //������ = ������ ��� �����ϸ� ��. �갡 ���� ������ �ϳ� ����ing �ϴ� �ָ� ��ġ�Ѵٴ� �� 
			String[] animals = {"Saza", "GoyangE", "Penguin", "Girin", "Dog"};
			int index = 0;
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				
				System.out.println(e);
				
				if(e.getWheelRotation() < 0) {
					return;
				}
				label.setText(animals[(index += e.getWheelRotation()) % animals.length]);
				
				
				
//				switch(e.getWheelRotation()) {
//				case 1: 
//					label.setText("���콺 ���� ���ȵ�. ���");
//					break;
//				case -1:
//					label.setText("��� ���콺 ���� �÷ȴ�!");
//					break;
//				}
			}
		});
		
			
		//�ڡڡ� MouseListener ó�� �ʹ� ���� �޼��带 �����ؾ� �ϴ� �������̽����� ���� AdapterŬ������ ���� 
		btn2.addMouseListener(new MouseAdapter() {
			
			//���ϴ� �޼��常 �������̵� ����
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Ŭ��!");
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("���콺 ��ư�� ����!");
			}
			//������� Ŭ���� ���� �����ؾ��ϳ� �ͱ� ��. �� �Ȱ� 
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("���콺�� ������ ����!");
				label.setForeground(Color.YELLOW);//���� ��׻��� �ٲ� �� ������. ���ڻ�(foreground)�� �ٲ���
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("���콺�� �������� ����!");
				label.setForeground(Color.RED);  
			}
			
		});
		
		
		
		btn2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			System.out.println("Ű�� ������ �ô�! " + e); // �� btn2Ŭ���� �������� Ű �ν�����? 
			//� Ű�� �������� �� �� ����
			 
			System.out.println("��� ���� ���� " + e.getKeyChar());
			//�ٵ� getKeyChar() �δ� shift�� ctrl���� Ư��Ű ������ �� ? ��� ������
			
			System.out.println("����Ʈ Ű�� ���� �ֳ���? : " + e.isShiftDown()); //����Ʈ ������ 
			// ����Ʈ ���� ���¿��� �ٸ� ���ڵ� ���� ������ true����
			
			
			}  
		});
		
			
		
		add(btn1, BorderLayout.WEST);
		add(btn2, BorderLayout.EAST);
		add(label, BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		setVisible(true);
	}
	

	
	public static void main(String[] args) {
		new S04_Event();
		
	}
	
}
