package gui.quiz.hangman.component;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class AnswerLabel extends JLabel {
	
	private static String[] answers = {"Computer", "Phone", "Test", "Pencil", "Cookie", "Keyboard", "glasses", "Wallet", "Earphone", "hand", "alphabet"};
	public static int maxLen;
	
	private static String answer;
	
	
	static {
		maxLen = 0;
		for(String str : answers) {
			maxLen = maxLen > str.length() ? maxLen : str.length();
		}
	}

	
	public AnswerLabel(int index) {
		super();
		//answer = randomAnswer();
		setText(answer.substring(index, index+1));
		setBackground(Color.BLACK);
		setForeground(Color.BLACK);
		setBorder(new LineBorder(Color.WHITE));// 라벨 테두리 색 설정
		setOpaque(true);
		setHorizontalAlignment(JLabel.CENTER); //글자자 가운데 정렬 
	}
	
	
	public static String randomAnswer() {
		int randomIndex = (int)(Math.random() * answers.length);
		answer = answers[randomIndex];
		return answer;
	}
	
	public static String getAnswer() {
		return answer;
	}
	
	
}
