package gui.quiz.hangman.component;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

import gui.quiz.hangman.HMFrame;

public class AlphabetButton extends JButton {
	
	static String alphs = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static int correctCnt = 0;
	
	//알파벳버튼 생성
	public AlphabetButton(int index) {
		super(alphs.substring(index, index+1));
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		setBorder(new LineBorder(Color.WHITE));
		addActionListener(eventListener);
	}
	
	//액션리스너
	static ActionListener eventListener = new ActionListener() {	
		@Override
		public void actionPerformed(ActionEvent e) {
			
			AlphabetButton performedButton = (AlphabetButton)e.getSource();
			
			String alph = performedButton.getText();
			String answer = AnswerLabel.getAnswer();
			
			
			//정답글자를 맞추든 안 맞추든 눌린 버튼은 사라지게 만들기 
			performedButton.setVisible(false);
			
			//누른 버튼이 정답일 경우
			if(answer.toUpperCase().contains(alph)) {
	
				
				// 누른 버튼의 알파벳과 동일한 글자를 가진 라벨이 정답패널에서 몇 번째 라벨에 위치하는지(index) 알아내서 해당 컴포넌트의 글자색을 흰색으로 바꾼다. (글자가 보이도록) 
				int index = 0;	
				int fromIndex = 0;
				while(true) {
					index = AnswerLabel.getAnswer().toUpperCase().indexOf(alph, fromIndex);
					if(index == -1) {
						break;
					}			
					fromIndex = index + 1;
					HMFrame.answerPanel.getComponent(index).setForeground(Color.WHITE);
					correctCnt++;
				}
				
				//정답글자 다 맞추면 맞춘 횟수 세는 변수 초기화 & 알파벳 패널 감추기 
				if(correctCnt == AnswerLabel.getAnswer().length()) {
					HMFrame.imageLabel.setIcon(HMImageLabel.icons.get(HMImageLabel.icons.size()-1));
					correctCnt = 0;
					HMFrame.alphPanel.setVisible(false);
				}
				
				
			//누른 알파벳 버튼이 정답이 아닐 경우 	
			} else {
				if(HMImageLabel.state < HMImageLabel.icons.size()) {
					HMFrame.imageLabel.setIcon(HMImageLabel.icons.get(HMImageLabel.state++));
				} 
				
				//근데 얘는 왜 else로 하면 안 되는 거임..? 그렇게 하면 행맨 다 매달리지도 않았는데 알파벳 패널이 사라져버림
				if (HMImageLabel.state == HMImageLabel.icons.size()-1) {			
					HMFrame.alphPanel.setVisible(false);
				}
			}
		}
	};

		
	
}


