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
		dl = new JDialog(this, "���̾�α�");
		closeBtn = new JButton("�ݱ�");
		dlabel = new JLabel("�޽���");
		
		dgl = new GridLayout(2, 1);
		dl.setLayout(dgl);
		dl.add(dlabel);
		dl.add(closeBtn);
		
		
		dl.setSize(200, 200);
		dl.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //exit�� ���� �ִ� â ��� �ݱ�, dispose�� �ش� â�� �ݱ�
		dl.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new S14_Dialog();
	}
}
