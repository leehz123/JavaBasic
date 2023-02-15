package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gui.component.ImageLabel;

public class S08_CardLayout extends JFrame {
	//CardLayout : ī��ó�� ���� ������Ʈ�� �ѱ�� ����� �ִ� ���̾ƿ� (�� �����ӿ��� ���� ȭ���� ������ �� �ִ�)
	
	
	public S08_CardLayout() {
		
		setTitle("Card Layout!");
		
		JButton btn = new JButton("South Button");
		JPanel panel = new JPanel();
		CardLayout cardLayoutManager = new CardLayout();

		panel.setLayout(cardLayoutManager);
		
		//JLabel apple = new JLabel(new ImageIcon("Image/apple.jpg")); �̷��� ������ �� �� �� ���� �ٿ� ��ü�� ���������� ImageLabel Ŭ���� 
		
		panel.add("Apple", new ImageLabel("image/apple.jpg"));
		panel.add("Banana", new ImageLabel("image/banana.jpg"));
		panel.add("Mango", new ImageLabel("image/mango.jpg"));
		panel.add("Peach", new ImageLabel("image/peach.jpg"));
		
		add(btn, "South");
		add(panel, "Center");
		
		
		//Event Listeners
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//next(parent) : ī�� ���̾ƿ��� �������� �ѱ��. parent �� �� ī�� ���̾ƿ��� ��� �پ� �ִ��� �˷��ִ� ����
				cardLayoutManager.next(panel); //ī�� ���̾ƿ��� ������ ���� ��� �����̳ʸ� �����ؾ� �ϴ��� �Ű������� �˷���� �Ѵ�.
				
				//previous(parent : ī�� ���̾ƿ��� �������� �ѱ��
				//cardLayoutManager.previous(panel);
				
				//first(parent) : ù ��° ī��� �̵��ϱ�
				//cardLayoutManager.first(panel);
			
				//last(parent) : ������ ī��� �̵��ϱ� 
				//cardLayoutManager.last(panel);
				
				//show(parent, cardName) : ���ϴ� ī��� �̵��ϱ�. �����̳ʿ� �߰��� �� �ٿ��� �̸��� �ʿ��ϴ�. 
				//cardLayoutManager.show(panel, "Mango");
			}
		});
		
		
		setBounds(500, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new S08_CardLayout();
		
	}
}
