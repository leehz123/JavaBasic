package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class S04_Event extends JFrame {
	
	public S04_Event() {
		super("Event!"); // == JFrame f = new JFrame("Event!");
		
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		
		//기능이 없는, 출력을 위한 컴포넌트
		JLabel label = new JLabel("Hello!");
		
		//SwingConstants.CENTER : Swing에서 사용되는 여러 상수들이 모여 있음. (이런건 구글링) 
		//label.setVerticalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		//와 나는 마우스 휠 오르내리면 그라데이션으로 배경색 바뀌는 거 만들어보고 싶다. 
		
		
		//마우스 휠 이벤트
		//-1 휠올리기 / 1 휠내리기 
		label.addMouseWheelListener(new MouseWheelListener() { //리스너 = 감시자 라고 생각하면 됨. 얘가 무슨 행위를 하나 감시ing 하는 애를 설치한다는 거 
			String[] animals = {"Saza", "GoyangE", "Penguin", "Girin", "Dog"};
			int index = 0;
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				
				System.out.println(e);
				
				if(e.getWheelRotation() < 0) {
					return;
				}
				label.setText(animals[(index += e.getWheelRotation()) % animals.length]);
				
				
				
//				switch(e.getWheelRotation()) {
//				case 1: 
//					label.setText("마우스 휠을 내렸따. 방금");
//					break;
//				case -1:
//					label.setText("방금 마우스 휠을 올렸다!");
//					break;
//				}
			}
		});
		
			
		//★★★ MouseListener 처럼 너무 많은 메서드를 구현해야 하는 인터페이스들을 위해 Adapter클래스가 존재 
		btn2.addMouseListener(new MouseAdapter() {
			
			//원하는 메서드만 오버라이드 가능
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("클릭!");
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("마우스 버튼을 놓음!");
			}
			//릴리즈와 클릭은 굳이 구분해야하나 싶긴 함. 걍 똑같 
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("마우스가 범위에 들어옴!");
				label.setForeground(Color.YELLOW);//라벨의 백그색은 바꿀 수 없나봄. 글자색(foreground)를 바꾸쟈
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("마우스가 범위에서 나감!");
				label.setForeground(Color.RED);  
			}
			
		});
		
		
		
		btn2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			System.out.println("키를 눌렀다 뗐다! " + e); // 왜 btn2클릭한 다음에야 키 인식하지? 
			//어떤 키를 눌렀는지 알 수 있음
			 
			System.out.println("방금 누른 문자 " + e.getKeyChar());
			//근데 getKeyChar() 로는 shift나 ctrl같이 특수키 눌렀을 때 ? 라고 나오네
			
			System.out.println("쉬프트 키가 눌려 있나요? : " + e.isShiftDown()); //쉬프트 눌렀냐 
			// 쉬프트 누른 상태에서 다른 문자도 같이 눌려야 true나옴
			
			
			}  
		});
		
			
		
		add(btn1, BorderLayout.WEST);
		add(btn2, BorderLayout.EAST);
		add(label, BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		setVisible(true);
	}
	

	
	public static void main(String[] args) {
		new S04_Event();
		
	}
	
}
