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

		
		//Ŭ������ �ʹ� ���Ƽ� key Panel�� ��üȭ �ϴ� ���� ������ �ؾߵ�
		for(char ch = 'A'; ch <= 'Z'; ++ch) {  //�Ͼ� �̷��� �� �� �ֳ�! 
			JButton btn = new HangEnglishButton("" + ch);
			keyPanel.add(btn);
			keys.add(btn);
		}
	}
}
