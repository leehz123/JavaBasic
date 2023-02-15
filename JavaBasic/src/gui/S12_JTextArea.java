package gui;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class S12_JTextArea extends JFrame {
	public S12_JTextArea() {
		setTitle("JTextArea Sample");
		
		JTextArea area = new JTextArea(10, 10);
		JLabel areaState = new JLabel();
		
		
		//LineWrap(true) : 자동줄바꿈 설정. 얘는 창 크기에 따라 줄바꿈해줌
		area.setLineWrap(true);
		area.setFont(new Font("Consolas", Font.PLAIN, 15));
		
		//탭크기 변경
		area.setTabSize(4);
		
		
		
		//setCursor() : 해당 컴포넌트 위에 마우스가 올라갔을 때 마우스 커서를 설정할 수 있는 메서드 
		area.setCursor(new Cursor(Cursor.HAND_CURSOR)); //택애에 마우스 올리니까 손가락모양으로 바뀜
		
	
		area.addKeyListener(new KeyAdapter() { //엔터키를 쳐도 줄이 바뀌는 거니까 텍스트애리어에 액션리스너가 없는듯
			@Override
			public void keyTyped(KeyEvent e) {
				String text = area.getText();
				
				areaState.setText(
						String.format("characters : %d", text.length()));			
			}
		});
		
		
		
		//키보드 커서가 움직일 때마다 발생하는 이벤트 
		area.addCaretListener(new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent e) {
				areaState.setText("" + area.getCaretPosition());
				//근데 얘조차 줄바꿈은 2글자로 치네 계산이 필요할 듯 
			}
		});
		
		
		//☆ ☆ 위 두 액션리스너의 결과가 한 레벨에 나오게 하려면 그리드레이아웃 해서 영역을 두 개로 나누면 되것지 ☆ ☆
		
		
		
		add(areaState, "North");
		add(area, "Center");
		
		
		setBounds(500, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}	
	
	
	
	public static void main(String[] args) {
		new S12_JTextArea();
	}
}
