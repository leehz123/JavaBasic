package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class S14_Dialog extends JFrame {

	private JDialog dl;
	private GridLayout dgl;
	private JButton closeBtn;
	private JLabel dlabel;
	

	
	public S14_Dialog() {
		dl = new JDialog(this, "다이얼로그");
		closeBtn = new JButton("닫기");
		dlabel = new JLabel("메시지");
		
		dgl = new GridLayout(2, 1);
		dl.setLayout(dgl);
		dl.add(dlabel);
		dl.add(closeBtn);
		
		
		dl.setSize(200, 200);
		dl.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //exit은 열려 있는 창 모두 닫기, dispose는 해당 창만 닫기
		dl.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new S14_Dialog();
	}
}
