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
	
	//���ĺ���ư ����
	public AlphabetButton(int index) {
		super(alphs.substring(index, index+1));
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		setBorder(new LineBorder(Color.WHITE));
		addActionListener(eventListener);
	}
	
	//�׼Ǹ�����
	static ActionListener eventListener = new ActionListener() {	
		@Override
		public void actionPerformed(ActionEvent e) {
			
			AlphabetButton performedButton = (AlphabetButton)e.getSource();
			
			String alph = performedButton.getText();
			String answer = AnswerLabel.getAnswer();
			
			
			//������ڸ� ���ߵ� �� ���ߵ� ���� ��ư�� ������� ����� 
			performedButton.setVisible(false);
			
			//���� ��ư�� ������ ���
			if(answer.toUpperCase().contains(alph)) {
	
				
				// ���� ��ư�� ���ĺ��� ������ ���ڸ� ���� ���� �����гο��� �� ��° �󺧿� ��ġ�ϴ���(index) �˾Ƴ��� �ش� ������Ʈ�� ���ڻ��� ������� �ٲ۴�. (���ڰ� ���̵���) 
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
				
				//������� �� ���߸� ���� Ƚ�� ���� ���� �ʱ�ȭ & ���ĺ� �г� ���߱� 
				if(correctCnt == AnswerLabel.getAnswer().length()) {
					HMFrame.imageLabel.setIcon(HMImageLabel.icons.get(HMImageLabel.icons.size()-1));
					correctCnt = 0;
					HMFrame.alphPanel.setVisible(false);
				}
				
				
			//���� ���ĺ� ��ư�� ������ �ƴ� ��� 	
			} else {
				if(HMImageLabel.state < HMImageLabel.icons.size()) {
					HMFrame.imageLabel.setIcon(HMImageLabel.icons.get(HMImageLabel.state++));
				} 
				
				//�ٵ� ��� �� else�� �ϸ� �� �Ǵ� ����..? �׷��� �ϸ� ��� �� �Ŵ޸����� �ʾҴµ� ���ĺ� �г��� ���������
				if (HMImageLabel.state == HMImageLabel.icons.size()-1) {			
					HMFrame.alphPanel.setVisible(false);
				}
			}
		}
	};

		
	
}


