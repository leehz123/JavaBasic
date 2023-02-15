package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


//이렇게 상속 받아서 하도록 권장됨

public class S03_JButton extends JFrame{ //이 클래스 자체가 JFrame이 되는 것 
	
	JButton mainBtn = new JButton();
	JButton subBtn = new JButton();
	//얘네는 인변이니까 새 프레임이 생길 때 같이 따라 생기겠지
	
	
	public S03_JButton() { //S03_JButton 이 JFrame의 모든 기능과 성질을 물려받았으니까 그걸 사용하는 것도 가능하겠지 당연히 
	
		//프레임 설정용
		setTitle("JButton Practice!!");
		setLocation(50, 50);
		setSize(500, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
		//텍스트 설정
		mainBtn.setText("main");
		subBtn.setText("click!");
		
		
		//글꼴 설정
		mainBtn.setFont(new Font("Brush Script MT", Font.BOLD, 50));
		subBtn.setFont(new Font("Brush Script MT", Font.BOLD, 50));
		//c드라이브 - windows - Fonts 가면 폰트 있음 
		
		
		//색상 설정 (헥스 코드 #RRGGBB 붙이나봄) 
		mainBtn.setForeground(new Color(0xFFFFFF));
		mainBtn.setBackground(new Color(0x000000));
		subBtn.setForeground(new Color(0x000000));
		subBtn.setBackground(new Color(0xf5f5dc));
		
		
		//버튼 이벤트 설정(액션 리스너)
		subBtn.addActionListener (new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {	
				mainBtn.setText(Integer.toString((int)(Math.random() * 100)));
			}
		});
		
		
		add(mainBtn, BorderLayout.CENTER);
		add(subBtn, BorderLayout.EAST);
		

	}
	//이런 형태로 버튼은 버튼 클래스 파서 모아놓고, .. 이렇게 클래스 별로 모아놓고 생성자로 호출하는게 권장됨 
	
	
	
	
	
	public static void main(String[] args) {
		
		new S03_JButton();

	}
	
	
}
