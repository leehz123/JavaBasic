package hangman_answer.event;

import java.awt.event.ActionEvent;

import hangman_answer.components.HangMainFrame;

public class EnglishButtonEvent extends HangmanMainFrameEvent {
	
	//extends �׸��������ϴº�Ŭ �� �ϸ� �����ڸ� �����϶�� �������� �߳�
	public EnglishButtonEvent(HangMainFrame main) {
		super(main);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		//�� �����ڷ� mainframe Ŭ������ ���޹޾Ƽ� mainŬ�� �̸� �������� �޼���(checkAnswer(), nextPicture())�� ����� �� �ֱ��� 
		if (!main.checkAnswer(cmd)) { //���� ã�� ���ϸ� ���� �̹����� �̵��ϵ���. 
			main.nextPicture();
		}
	}


}
