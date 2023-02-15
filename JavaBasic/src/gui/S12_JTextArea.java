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
		
		
		//LineWrap(true) : �ڵ��ٹٲ� ����. ��� â ũ�⿡ ���� �ٹٲ�����
		area.setLineWrap(true);
		area.setFont(new Font("Consolas", Font.PLAIN, 15));
		
		//��ũ�� ����
		area.setTabSize(4);
		
		
		
		//setCursor() : �ش� ������Ʈ ���� ���콺�� �ö��� �� ���콺 Ŀ���� ������ �� �ִ� �޼��� 
		area.setCursor(new Cursor(Cursor.HAND_CURSOR)); //�þֿ� ���콺 �ø��ϱ� �հ���������� �ٲ�
		
	
		area.addKeyListener(new KeyAdapter() { //����Ű�� �ĵ� ���� �ٲ�� �Ŵϱ� �ؽ�Ʈ�ָ�� �׼Ǹ����ʰ� ���µ�
			@Override
			public void keyTyped(KeyEvent e) {
				String text = area.getText();
				
				areaState.setText(
						String.format("characters : %d", text.length()));			
			}
		});
		
		
		
		//Ű���� Ŀ���� ������ ������ �߻��ϴ� �̺�Ʈ 
		area.addCaretListener(new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent e) {
				areaState.setText("" + area.getCaretPosition());
				//�ٵ� ������ �ٹٲ��� 2���ڷ� ġ�� ����� �ʿ��� �� 
			}
		});
		
		
		//�� �� �� �� �׼Ǹ������� ����� �� ������ ������ �Ϸ��� �׸��巹�̾ƿ� �ؼ� ������ �� ���� ������ �ǰ��� �� ��
		
		
		
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
