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


//setIcon 은 거의 모든 컴포넌트에 있음. 
//이미지 사이즈 변경은 구글링해서 알아서 하십셔
//imageResize 프로그램 내에서 계산 하면 사실상 프로그램에서 쓸 데없이 계산 하는 거거든
//걍 디자인이 크기 맞춰서 그려주는게 나음 (원래는 몇곱하기몇으로 그릴까요 물어봄 디자이너가)
//근데 플젝할 땐 디자이너 끼고 있는게 아니라 리사이즈 구글링할 수도 
public class S05_Image extends JFrame {
	
	public S05_Image() {
		
		//프레임 선언
		super("Image test frame");
		
		
		//라벨과 버튼 선언
		JLabel label = new JLabel("WAIT FOR CLICK");
		JButton button = new JButton("SHOW CATS");
		
		
		label.setHorizontalAlignment(JLabel.CENTER);  // JLabel은 swing.SwingConstants가 구현돼 있는 인터페 
		
		
		//연습문제 : 버튼을 누르면 여러 그림들이 순서대로 순환되도록 만들어보세요.______________________________________________________________
		ArrayList<ImageIcon> icons = new ArrayList<>();  
		//올 File로 풀었네 ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
		File imageDir = new File("Image/");
		
		for(File image : imageDir.listFiles()) {
			icons.add(new ImageIcon(image.getAbsolutePath()));  //상대경로 말고 절대경로로 받기 
		}

		button.addActionListener(new ActionListener() {
			//String[] cats = {"image/cat1.jpg", "image/cat2.jpg", "image/cat3.jpg", "image/cat4.jpg", "image/tiger.jpg"};
			//int index = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				//클릭을 하면 라벨의 이미지를 변경할 수 있다. 
				//label.setIcon(new ImageIcon("image/cat1.jpg"));
				label.setText("");
				//label.setIcon(new ImageIcon(cats[index++ % cats.length]));
				
				ImageIcon icon = icons.remove(0);
				icons.add(icon); //icons의 맨 앞의 요소를 빼서 icon에 담아주고 다시 그 icon에 담긴 걸 icons의 맨 뒤에 넣어주고... 순환되는 모습 생각혀 
				
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
