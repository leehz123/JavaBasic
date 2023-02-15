package hangman_answer.components;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gui.quiz.hangman.component.AnswerLabel;

public class HangEnglishPanel extends JPanel {
	
	
	HangAnswerLabel answerLabel = new HangAnswerLabel();
	JPanel keyPanel = new JPanel();
	
	
	ArrayList<JButton> keys = new ArrayList<>();
	
	public ArrayList<JButton> getAllKey() {
		return keys;
	}
	
	
	
	public HangEnglishPanel() {
		setLayout(new BorderLayout());
		add(answerLabel, "North");
		add(keyPanel, "Center");
	
		keyPanel.setLayout(new GridLayout(2, 13));

		
		//클래스가 너무 많아서 key Panel을 객체화 하다 말음 원래는 해야됨
		for(char ch = 'A'; ch <= 'Z'; ++ch) {  //하씌 이렇게 쓸 수 있네! 
			JButton btn = new HangEnglishButton("" + ch);
			keyPanel.add(btn);
			keys.add(btn);
		}
	}
}
