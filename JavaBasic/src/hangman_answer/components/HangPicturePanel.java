package hangman_answer.components;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import gui.component.ImageLabel;

public class HangPicturePanel extends JPanel {

	CardLayout cardLayoutManager = new CardLayout(20, 20);
	//�̺�Ʈ�� ���⼭ �ٴ� �� �ƴ϶� �����ӿ��� �ޱ� ���� ���⼭ �������ְ���
	
	JPanel jp = new JPanel();
	
	
	public HangPicturePanel() {
		
		add(new HangImageLabel("image/apple.jpg"));
		add(new HangImageLabel("image/banana.jpg"));
		add(new HangImageLabel("image/mango.jpg"));
		add(new HangImageLabel("image/peach.jpg"));
		
		
		setLayout(cardLayoutManager);
		setBackground(Color.BLACK);	
	}
}
