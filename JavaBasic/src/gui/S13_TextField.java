package gui;

import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S13_TextField extends JFrame {
	private TextField tf;
	private JButton btn; 
	private GridLayout gl;
	
	
	public S13_TextField(String title) {
		super(title);
		btn = new JButton("�Է�");
		tf = new TextField("��й�ȣ�� �Է��Ͻÿ�");
		
		gl = new GridLayout(2, 1);
		setLayout(gl);
		
		add(tf);
		add(btn);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new S13_TextField("�ؽ�Ʈ�ʵ� ����");
		
	}
	
}
