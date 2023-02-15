package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



/*
# Jpanel 패널
- 컨테이너 역할을 하는 컴포넌트
- 각 패널마다 다른 레이아웃을 설정해 사용할 수 있다. 

 
 */




public class S07_JPanel extends JFrame {

	public S07_JPanel() {
		
		//1. 프레임 설정
		setBounds(300, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		//2. 프레임의 레이아웃 설정
		setLayout(new GridLayout(2, 2));
		
		
		//4. 패널 선언 및 설정 (add(panel)보다 이 코드들이 위에 있어야쥐)
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(new JButton("Inner South Button"), "South");
		panel.add(new JButton("E"), "East");
		panel.add(new JButton("W"), "West");
		panel.add(new JButton("Inner North Button"), "North");
		panel.add(new JLabel("Center Message.."), "Center");
		
		
		//3. 프레임에 컴포넌트들 추가 
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(panel);
		add(new JButton("Button4"));
		
	}
	
	
	
	public static void main(String[] args) {
		new S07_JPanel();
		
	}
	
}
