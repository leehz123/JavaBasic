package gui.quiz.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GugudanButtonAction implements ActionListener {  // plus버튼과 minus버튼 모두를 컨트롤하는 클라쓰

	int dan = 2;
	JButton[] gugudanButton;
	
	public GugudanButtonAction(JButton[] gugudanButton) {
		this.gugudanButton = gugudanButton;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//버튼을 클릭할 때마다 (이벤트가 발생할 때마다) 함께 넘어오는 이벤트 정보
		System.out.println(e.getActionCommand());
		// cmd = +, cmd = - 값이 넘어오고 있음. 따라서 어떤 버튼이 눌렸는지 파악할 수 있음
		
		switch(e.getActionCommand()) {
		case "+":
			if(dan < 19) {
				dan++;
				break;
			} else {
				return;
			}
		case "-" :
			if(dan>2) {
				dan--;
				break;
			} else { 
				return;
			}
		}
		
		//이벤트 발생시마다 구구단 버튼들의 텍스트를 바꿔주는 액션
		for(int i = 0; i < 9; ++i) {
			gugudanButton[i].setText(String.format("%d * %d = %d\n", dan, i + 1, dan*(i+1)));
		}
		
		
		
		
		
		
		
	}

}
