package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



/*
# Jpanel �г�
- �����̳� ������ �ϴ� ������Ʈ
- �� �гθ��� �ٸ� ���̾ƿ��� ������ ����� �� �ִ�. 

 
 */




public class S07_JPanel extends JFrame {

	public S07_JPanel() {
		
		//1. ������ ����
		setBounds(300, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		//2. �������� ���̾ƿ� ����
		setLayout(new GridLayout(2, 2));
		
		
		//4. �г� ���� �� ���� (add(panel)���� �� �ڵ���� ���� �־����)
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(new JButton("Inner South Button"), "South");
		panel.add(new JButton("E"), "East");
		panel.add(new JButton("W"), "West");
		panel.add(new JButton("Inner North Button"), "North");
		panel.add(new JLabel("Center Message.."), "Center");
		
		
		//3. �����ӿ� ������Ʈ�� �߰� 
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(panel);
		add(new JButton("Button4"));
		
	}
	
	
	
	public static void main(String[] args) {
		new S07_JPanel();
		
	}
	
}
