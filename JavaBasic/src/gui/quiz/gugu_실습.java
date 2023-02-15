package gui.quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class gugu_�ǽ� {

	public static void main(String[] args) {
	
		new GuguFrame_�ǽ�();
		
	}	
}



class GuguFrame_�ǽ� extends JFrame {
	

	int dan = 2;	
	
	JButton title = new JButton();
	JButton gugu1Btn = new JButton();
	JButton gugu2Btn = new JButton();
	JButton gugu3Btn = new JButton();
	JButton gugu4Btn = new JButton();
	JButton gugu5Btn = new JButton();
	JButton gugu6Btn = new JButton();
	JButton gugu7Btn = new JButton();
	JButton gugu8Btn = new JButton();
	JButton gugu9Btn = new JButton();
	
	
	JButton pBtn = new JButton();
	JButton mBtn = new JButton();

	
//_______________________________________________________________________________________	
	//�����ܹ�ư ���� �޼���� 
	
	void setGrClr (List<JButton> btnList) {
		for(JButton btn : btnList) {
			btn.setBackground(new Color(0x000000));
			btn.setForeground(new Color(0xFFFFFF));
		}
	}
	
	void guguArrange(List<JButton> btnList) {
		
		int height = 0; 
		for(JButton btn : btnList) {
			btn.setLocation(0, height);
			btn.setSize(700, 30);
			height += 30;
		}

		
	}
	
	void btnRefresh(List<JButton> btnList, int dan) {
		
		btnList.get(0).setText("<" + dan + "��>");
		for(int i = 1; i <= 9; ++i) {
			btnList.get(i).setText(dan + " * " + i + " = " + Integer.toString(dan*i));			
		}

	}
	
	void guguAdd(List<JButton> btnList) {
		for(JButton btn : btnList) {
			add(btn);
		}
	}
//_______________________________________________________________________________________
	
	
	GuguFrame_�ǽ�() {

		//������ ����
		setTitle("������");
		setLocation(0, 50);
		setSize(700, 367);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		//���̾ƿ� ��
		setLayout(null);
		
		
		
		//������ư ����-------------------------------------------------------------------------------------------------------------------
		List<JButton> guguList = new ArrayList<>();
		Collections.addAll(guguList, title, gugu1Btn, gugu2Btn, gugu3Btn, gugu4Btn, gugu5Btn, gugu6Btn, gugu7Btn, gugu8Btn, gugu9Btn);
		
		guguArrange(guguList);
		setGrClr(guguList);
		btnRefresh(guguList, dan);		
		
		
		
		//pBtn, mBtn ����---------------------------------------------------------------------------------------------------------------
		pBtn.setText("+");
		mBtn.setText("-");
		
		pBtn.setLocation(0, 300);
		pBtn.setSize(350, 30);
		
		mBtn.setLocation(350, 300);
		mBtn.setSize(350, 30);
		
		pBtn.setBackground(new Color(0x000000));
		pBtn.setForeground(new Color(0xFFFFFF));
		
		mBtn.setBackground(new Color(0x000000));
		mBtn.setForeground(new Color(0xFFFFFF));
		
		mBtn.setFont(new Font("�ü�ü", Font.BOLD, 30));
		pBtn.setFont(new Font("�ü�ü", Font.BOLD, 30));
		
		
		
		//add
		guguAdd(guguList);
		add(pBtn);
		add(mBtn);
		
		
		
		//�Ǽ�
		pBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	
				dan++;
				if(dan > 19) {
					dan--;	
				}
				btnRefresh(guguList, dan);		
			}
		});
		
				
		mBtn.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	
				dan--;
				if(dan < 2) {
					dan++;
				} 	
				btnRefresh(guguList, dan);		
			}
		} );	
		
	}


	
}