package hangman_answer.event;

import java.awt.event.ActionListener;

import hangman_answer.components.HangMainFrame;

//이 클래스를 상속받는 클래스들은 액션리스너 이면서 main의 제어권을 갖고 있다. 
abstract public class HangmanMainFrameEvent implements ActionListener {
	HangMainFrame main;
	
	public HangmanMainFrameEvent(HangMainFrame main) {
		this.main = main;	
		//HangmanMainFrameEvent클래스와 이 클래스의 자식들 모두 main인스턴스를 저장한 HangMainFrame main를 지니게 됨 
	}	
}
