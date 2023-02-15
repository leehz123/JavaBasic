package gui.quiz.hangman;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import gui.quiz.hangman.component.AlphabetButton;
import gui.quiz.hangman.component.AnswerLabel;
import gui.quiz.hangman.component.HMImageLabel;


public class HMFrame extends JFrame {
	
	public static JLabel imageLabel = new HMImageLabel();
	public static JPanel answerPanel = new JPanel();
	public static JPanel alphPanel = new JPanel();
	JButton newBtn = new JButton("New Game");
	
	
	static public JPanel getAnswerPanel() {
		return answerPanel;
	}
	
	public HMFrame() {
		
		//프레임 선언 및 설정_________________________________________________________ 
		super("HangMan");
		setBounds(10, 10, 1000, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		
		//프레임의 레이아웃 설정
		setLayout(null);
	
		
		//알파벳 입력버튼 만들기_______________________________________________________
		//알파벳 버튼 들어갈 패널 설정
		alphPanel.setBounds(15, 260, 600 ,270);
		alphPanel.setBackground(Color.WHITE);
		alphPanel.setLayout(new GridLayout(4, 7));
		
		//패널에 알파벳 버튼 넣기 (AlphabetButton클래스 이용) 
		for(int i = 0 ; i < 26; i++) {
			JButton button = new AlphabetButton(i);	
			alphPanel.add(button);
		}
		
				
		//정답라벨 들어갈 패널 설정_____________________________________________________
		answerPanel.setBounds(15, 150, 600, 70);
		answerPanel.setBackground(Color.WHITE);
		
		//Answer 문자들의 글자수 중 최대 글자수로 그리드 공간 만들어놓기 
		int gridNum = AnswerLabel.maxLen;
		answerPanel.setLayout(new GridLayout(1, gridNum));
		
		//정답 패널에 정답라벨 넣기(AnswerLabel이용)
		AnswerLabel.randomAnswer();
		for(int i = 0; i < AnswerLabel.getAnswer().length(); ++i) {
			JLabel answerlb = new AnswerLabel(i);
			answerPanel.add(answerlb);
		}
		
		
		//new Game 버튼 설정________________________________________________________
		newBtn.setBounds(20, 20, 100, 50);
		newBtn.setBackground(Color.black);
		newBtn.setForeground(Color.WHITE);
		newBtn.setBorder(new LineBorder(Color.WHITE));
		
		//뉴게임 눌렀을 때 게임 초기화
		newBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				//정답패널 초기화
				AnswerLabel.randomAnswer();
				answerPanel.removeAll();
				for(int i = 0; i < AnswerLabel.getAnswer().length(); ++i) {
					JLabel answerlb = new AnswerLabel(i);
					answerPanel.add(answerlb);
				}
				setVisible(false);
				setVisible(true);
				
				//알파벳버튼 초기화  
				for(Component cmp : alphPanel.getComponents()) {
					cmp.setVisible(true);
					cmp.setBackground(Color.BLACK);
					cmp.setForeground(Color.WHITE);
				}

				//alph패널 visible true
				alphPanel.setVisible(true);
				
			
				//이미지라벨 초기화
				HMImageLabel.state = 1;
				HMFrame.imageLabel.setIcon(HMImageLabel.icons.get(0));
				
				//알파벳버튼으로 정답맞춘 개수 세는 correctCnt 초기화
				AlphabetButton.correctCnt = 0;
			}
		});
	
		
		//컴포넌트들 추가_____________________________________________________________
		add(imageLabel);
		add(alphPanel);
		add(answerPanel);
		add(newBtn);	
		
		
		// 프레임 setVisible 맨 밑에 놔야 창 켰을 떄 컴포넌트들이 바로 뜸★★★★★★★★★
		setVisible(true); 
	}
}
