package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


//setIcon �� ���� ��� ������Ʈ�� ����. 
//�̹��� ������ ������ ���۸��ؼ� �˾Ƽ� �Ͻʼ�
//imageResize ���α׷� ������ ��� �ϸ� ��ǻ� ���α׷����� �� ������ ��� �ϴ� �Űŵ�
//�� �������� ũ�� ���缭 �׷��ִ°� ���� (������ ����ϱ������ �׸���� ��� �����̳ʰ�)
//�ٵ� ������ �� �����̳� ���� �ִ°� �ƴ϶� �������� ���۸��� ���� 
public class S05_Image extends JFrame {
	
	public S05_Image() {
		
		//������ ����
		super("Image test frame");
		
		
		//�󺧰� ��ư ����
		JLabel label = new JLabel("WAIT FOR CLICK");
		JButton button = new JButton("SHOW CATS");
		
		
		label.setHorizontalAlignment(JLabel.CENTER);  // JLabel�� swing.SwingConstants�� ������ �ִ� ������ 
		
		
		//�������� : ��ư�� ������ ���� �׸����� ������� ��ȯ�ǵ��� ��������.______________________________________________________________
		ArrayList<ImageIcon> icons = new ArrayList<>();  
		//�� File�� Ǯ���� �١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١�
		File imageDir = new File("Image/");
		
		for(File image : imageDir.listFiles()) {
			icons.add(new ImageIcon(image.getAbsolutePath()));  //����� ���� �����η� �ޱ� 
		}

		button.addActionListener(new ActionListener() {
			//String[] cats = {"image/cat1.jpg", "image/cat2.jpg", "image/cat3.jpg", "image/cat4.jpg", "image/tiger.jpg"};
			//int index = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				//Ŭ���� �ϸ� ���� �̹����� ������ �� �ִ�. 
				//label.setIcon(new ImageIcon("image/cat1.jpg"));
				label.setText("");
				//label.setIcon(new ImageIcon(cats[index++ % cats.length]));
				
				ImageIcon icon = icons.remove(0);
				icons.add(icon); //icons�� �� ���� ��Ҹ� ���� icon�� ����ְ� �ٽ� �� icon�� ��� �� icons�� �� �ڿ� �־��ְ�... ��ȯ�Ǵ� ��� ������ 
				
				label.setIcon(icon);
				label.setText("");
			}
		});
		
		
		
		add(label, BorderLayout.CENTER);
		// = add(label, "Center");
		add(button, BorderLayout.SOUTH);
		// = add(button, "South");
		

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		setVisible(true);
	}



	public static void main(String[] args) {
		new S05_Image();
	}

}
