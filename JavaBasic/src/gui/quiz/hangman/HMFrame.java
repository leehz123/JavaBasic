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
		
		//������ ���� �� ����_________________________________________________________ 
		super("HangMan");
		setBounds(10, 10, 1000, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		
		//�������� ���̾ƿ� ����
		setLayout(null);
	
		
		//���ĺ� �Է¹�ư �����_______________________________________________________
		//���ĺ� ��ư �� �г� ����
		alphPanel.setBounds(15, 260, 600 ,270);
		alphPanel.setBackground(Color.WHITE);
		alphPanel.setLayout(new GridLayout(4, 7));
		
		//�гο� ���ĺ� ��ư �ֱ� (AlphabetButtonŬ���� �̿�) 
		for(int i = 0 ; i < 26; i++) {
			JButton button = new AlphabetButton(i);	
			alphPanel.add(button);
		}
		
				
		//����� �� �г� ����_____________________________________________________
		answerPanel.setBounds(15, 150, 600, 70);
		answerPanel.setBackground(Color.WHITE);
		
		//Answer ���ڵ��� ���ڼ� �� �ִ� ���ڼ��� �׸��� ���� �������� 
		int gridNum = AnswerLabel.maxLen;
		answerPanel.setLayout(new GridLayout(1, gridNum));
		
		//���� �гο� ����� �ֱ�(AnswerLabel�̿�)
		AnswerLabel.randomAnswer();
		for(int i = 0; i < AnswerLabel.getAnswer().length(); ++i) {
			JLabel answerlb = new AnswerLabel(i);
			answerPanel.add(answerlb);
		}
		
		
		//new Game ��ư ����________________________________________________________
		newBtn.setBounds(20, 20, 100, 50);
		newBtn.setBackground(Color.black);
		newBtn.setForeground(Color.WHITE);
		newBtn.setBorder(new LineBorder(Color.WHITE));
		
		//������ ������ �� ���� �ʱ�ȭ
		newBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				//�����г� �ʱ�ȭ
				AnswerLabel.randomAnswer();
				answerPanel.removeAll();
				for(int i = 0; i < AnswerLabel.getAnswer().length(); ++i) {
					JLabel answerlb = new AnswerLabel(i);
					answerPanel.add(answerlb);
				}
				setVisible(false);
				setVisible(true);
				
				//���ĺ���ư �ʱ�ȭ  
				for(Component cmp : alphPanel.getComponents()) {
					cmp.setVisible(true);
					cmp.setBackground(Color.BLACK);
					cmp.setForeground(Color.WHITE);
				}

				//alph�г� visible true
				alphPanel.setVisible(true);
				
			
				//�̹����� �ʱ�ȭ
				HMImageLabel.state = 1;
				HMFrame.imageLabel.setIcon(HMImageLabel.icons.get(0));
				
				//���ĺ���ư���� ������� ���� ���� correctCnt �ʱ�ȭ
				AlphabetButton.correctCnt = 0;
			}
		});
	
		
		//������Ʈ�� �߰�_____________________________________________________________
		add(imageLabel);
		add(alphPanel);
		add(answerPanel);
		add(newBtn);	
		
		
		// ������ setVisible �� �ؿ� ���� â ���� �� ������Ʈ���� �ٷ� ��ڡڡڡڡڡڡڡڡ�
		setVisible(true); 
	}
}
