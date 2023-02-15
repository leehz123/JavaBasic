package hangman_answer.components;

import java.awt.Font;

import javax.swing.JLabel;

public class HangAnswerLabel extends JLabel {
	//������ �´��� üũ 
	
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
		
		
										//ã�� �ε����� 3�̸� 4���� ã������
		while((index = answer.toUpperCase().indexOf(cmd, index + 1)) != -1) {
			check[index] = true;
			found = true;
		}
		setText(getBlank());			
		return found;
	}
	
	
	
	// answer �� C Programmer �̸� answer���� �ؽ�Ʈ�� �� ���ڿ��� _   _ _ _ _ _ �̷��� ������ִ� �޼��� 
	// setText�� update()�޼��忡�� �̷������� �س���
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
		//�䵵 ���ΰ�ħ, �n�Ҹ��迭�� ����ְ�, �ؽ���� �ؽ�Ʈ�� answer���ڼ� ���缭 _ _ _ _  _ _  �̷� ���·� �ʱ�ȭ���ְ� 
		this.answer = answer;
		this.check = new boolean[answer.length()];
		setText(getBlank());		
	}
}
