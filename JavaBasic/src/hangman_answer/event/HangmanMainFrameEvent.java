package hangman_answer.event;

import java.awt.event.ActionListener;

import hangman_answer.components.HangMainFrame;

//�� Ŭ������ ��ӹ޴� Ŭ�������� �׼Ǹ����� �̸鼭 main�� ������� ���� �ִ�. 
abstract public class HangmanMainFrameEvent implements ActionListener {
	HangMainFrame main;
	
	public HangmanMainFrameEvent(HangMainFrame main) {
		this.main = main;	
		//HangmanMainFrameEventŬ������ �� Ŭ������ �ڽĵ� ��� main�ν��Ͻ��� ������ HangMainFrame main�� ���ϰ� �� 
	}	
}
