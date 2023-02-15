package hangman_answer.components;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import gui.component.ImageLabel;

public class HangPicturePanel extends JPanel {

	CardLayout cardLayoutManager = new CardLayout(20, 20);
	//이벤트를 여기서 다는 게 아니라 프레임에서 달기 위해 여기서 선언해주겠음
	
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
