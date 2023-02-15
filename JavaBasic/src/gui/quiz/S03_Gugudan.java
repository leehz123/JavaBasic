package gui.quiz;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.quiz.action.GugudanButtonAction;

/*
�����ϸ� �������� ��µǴ� GUI���α׷��� ��������.  
1. ���α׷� ù ȭ���� ��µǾ� �ִ� ���·� ����.(��ư�� ���) 
2. + ��ư�� ������ ���� ������ �������� ��µȴ�. (�ִ� 19�ܱ���) 
3. - ��ư�� ������ ���� ������ �������� ��µȴ�. (�ּ� 2�ܱ���) 	  
*/



public class S03_Gugudan {
	
	
	public static void main(String[] args) {
		JFrame gugudanFrame = new JFrame("������");
		
		JButton[] gugudanButton = new JButton[9];
		
		JButton plusButton = new JButton("+");
		JButton minusButton = new JButton("-");
		
		
		for(int i = 0; i < 9; ++i) {
			gugudanButton[i] = new JButton(String.format("%d * %d = %d\n", 2, i + 1, 2*(i+1))); //��ư �����ϴ� ���ÿ� ��ư�� �� ���� �־��ֳ��� 
			gugudanButton[i].setBounds(0, 0 + 40 * i, 300, 40); // ���̰� 40�ΰ� ��� �߰��Ǵϱ� ���� ��ġ�� 40 * i 
			gugudanFrame.add(gugudanButton[i]); // 
		}
		
		
		
		//
		ActionListener gugudanAction  = new GugudanButtonAction(gugudanButton);
		
		plusButton.setBounds(300, 0, 70, 180);
		plusButton.addActionListener(gugudanAction);
		
		minusButton.setBounds(300, 180, 70, 180);
		minusButton.addActionListener(gugudanAction);
		
		
		gugudanFrame.add(plusButton);
		gugudanFrame.add(minusButton);
		
		
		gugudanFrame.setResizable(false); //ũ�� ���� ���� ��
		gugudanFrame.setLayout(null); //�̰� ���� ������ߴ� ��
		gugudanFrame.setBounds(100, 100, 370, 400); // setLoca�� setSize �ѹ��� �� �� �ִ� setBounds ��
		gugudanFrame.setVisible(true);
		gugudanFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
}