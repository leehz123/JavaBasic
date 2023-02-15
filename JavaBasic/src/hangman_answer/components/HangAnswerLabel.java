package hangman_answer.components;

import java.awt.Font;

import javax.swing.JLabel;

public class HangAnswerLabel extends JLabel {
	//정답이 맞는지 체크 
	
	String answer;
	boolean[] check;
	
	
	public HangAnswerLabel() {
		setFont(new Font("Colsolas", Font.BOLD, 25));
		setHorizontalAlignment(CENTER);
	}
	
	
	public boolean checkAnswer(String cmd) {
	
		boolean found = false;
		int index = -1;

		String upperAnswer = answer.toUpperCase();
		
		
										//찾은 인덱스가 3이면 4부터 찾것지★
		while((index = answer.toUpperCase().indexOf(cmd, index + 1)) != -1) {
			check[index] = true;
			found = true;
		}
		setText(getBlank());			
		return found;
	}
	
	
	
	// answer 가 C Programmer 이면 answer라벨의 텍스트에 들어갈 문자열을 _   _ _ _ _ _ 이렇게 만들어주는 메서드 
	// setText는 update()메서드에서 이뤄지도록 해놓음
	private String getBlank() {
		StringBuilder blank = new StringBuilder();
		
		for(int i = 0, len = answer.length(); i < len; ++i) {
			
			char ch = answer.charAt(i);
			
			if(check[i]) {
				blank.append(ch + " ");
			} else if(answer.charAt(i) == ' ') {
				blank.append("  ");
			} else {
				blank.append("_ ");
			}
		}
		
		return blank.toString();
	}
	
	
	public void update(String answer) { 
		//답도 새로고침, 쳌불린배열도 비워주고, 앤써라벨의 텍스트도 answer글자수 맞춰서 _ _ _ _  _ _  이런 상태로 초기화해주고 
		this.answer = answer;
		this.check = new boolean[answer.length()];
		setText(getBlank());		
	}
}
