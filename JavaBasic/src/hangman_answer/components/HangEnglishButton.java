package hangman_answer.components;

import javax.swing.JButton;

public class HangEnglishButton extends JButton {

	
	//버튼이 눌릴 때마다 checked가 바뀌어야 함 
	boolean checked = false;
	
	public HangEnglishButton(String title) {
		super(title);
	}
	
}
