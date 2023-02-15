package gui;

import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.component.ColorStateButton;

//그리드는 크기조절이 안 됨. 몇 칸 차지할 지는 고를 수 있음  GridBackLayout 구글링하면 나옴 
//그리드백레이아웃이 레아중에 젤 좋은 것 같대 웹 만들 때도 그백레아 쓴대 


//어렵네욜 객체지향 ^_________^....

public class S06_GridLayout extends JFrame{
	
	public S06_GridLayout() {
		
		LayoutManager manager = new GridLayout(5, 10); //row 5개 col 10개 
		
		for(int i = 0; i < 50; ++i ) { //행과 열을 5행 10열로 만들어놨는데 버튼을 일부러 42개만 넣어보자 창 늘리고 줄일 때마다 버튼배치가 달라지넹. 어쩄든 걍 젤 좋은건 버튼수 맞춰주는거
			JButton button = new ColorStateButton(i+1);
			add(button);
			
		}
		
		setLayout(manager);
		setBounds(500, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new S06_GridLayout();
	}
}
