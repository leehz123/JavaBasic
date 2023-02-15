package hangman_answer.event;

import java.awt.event.ActionEvent;

import hangman_answer.components.HangMainFrame;

public class EnglishButtonEvent extends HangmanMainFrameEvent {
	
	//extends 액리를구현하는부클 을 하면 생성자를 생성하라고 빨간줄이 뜨네
	public EnglishButtonEvent(HangMainFrame main) {
		super(main);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		//아 생성자로 mainframe 클래스를 전달받아서 main클에 미리 만들어놓은 메서드(checkAnswer(), nextPicture())를 사용할 수 있구나 
		if (!main.checkAnswer(cmd)) { //답을 찾지 못하면 다음 이미지로 이동하도록. 
			main.nextPicture();
		}
	}


}
