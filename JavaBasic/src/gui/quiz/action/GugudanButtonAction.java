package gui.quiz.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GugudanButtonAction implements ActionListener {  // plus��ư�� minus��ư ��θ� ��Ʈ���ϴ� Ŭ��

	int dan = 2;
	JButton[] gugudanButton;
	
	public GugudanButtonAction(JButton[] gugudanButton) {
		this.gugudanButton = gugudanButton;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//��ư�� Ŭ���� ������ (�̺�Ʈ�� �߻��� ������) �Բ� �Ѿ���� �̺�Ʈ ����
		System.out.println(e.getActionCommand());
		// cmd = +, cmd = - ���� �Ѿ���� ����. ���� � ��ư�� ���ȴ��� �ľ��� �� ����
		
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
		
		//�̺�Ʈ �߻��ø��� ������ ��ư���� �ؽ�Ʈ�� �ٲ��ִ� �׼�
		for(int i = 0; i < 9; ++i) {
			gugudanButton[i].setText(String.format("%d * %d = %d\n", dan, i + 1, dan*(i+1)));
		}
		
		
		
		
		
		
		
	}

}
