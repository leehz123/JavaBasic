package gui.quiz;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.quiz.action.GugudanButtonAction;

/*
실행하면 구구단이 출력되는 GUI프로그램을 만들어보세요.  
1. 프로그램 첫 화면은 출력되어 있는 상태로 시작.(버튼에 출력) 
2. + 버튼을 누르면 단이 증가한 구구단이 출력된다. (최대 19단까지) 
3. - 버튼을 누르면 단이 감소한 구구단이 출력된다. (최소 2단까지) 	  
*/



public class S03_Gugudan {
	
	
	public static void main(String[] args) {
		JFrame gugudanFrame = new JFrame("구구단");
		
		JButton[] gugudanButton = new JButton[9];
		
		JButton plusButton = new JButton("+");
		JButton minusButton = new JButton("-");
		
		
		for(int i = 0; i < 9; ++i) {
			gugudanButton[i] = new JButton(String.format("%d * %d = %d\n", 2, i + 1, 2*(i+1))); //버튼 생성하는 동시에 버튼에 들어갈 내용 넣어주나바 
			gugudanButton[i].setBounds(0, 0 + 40 * i, 300, 40); // 높이가 40인게 계속 추가되니까 세로 위치는 40 * i 
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
		
		
		gugudanFrame.setResizable(false); //크기 변경 막기 ★
		gugudanFrame.setLayout(null); //이게 먼저 나와줘야댐 ★
		gugudanFrame.setBounds(100, 100, 370, 400); // setLoca랑 setSize 한번에 할 수 있는 setBounds ★
		gugudanFrame.setVisible(true);
		gugudanFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
}