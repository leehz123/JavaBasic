package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gui.component.ImageLabel;

public class S08_CardLayout extends JFrame {
	//CardLayout : 카드처럼 다음 컴포넌트로 넘기는 기능이 있는 레이아웃 (한 프레임에서 여러 화면을 보여줄 수 있다)
	
	
	public S08_CardLayout() {
		
		setTitle("Card Layout!");
		
		JButton btn = new JButton("South Button");
		JPanel panel = new JPanel();
		CardLayout cardLayoutManager = new CardLayout();

		panel.setLayout(cardLayoutManager);
		
		//JLabel apple = new JLabel(new ImageIcon("Image/apple.jpg")); 이렇게 일일이 네 개 다 해줄 바에 객체로 만들어버리자 ImageLabel 클래스 
		
		panel.add("Apple", new ImageLabel("image/apple.jpg"));
		panel.add("Banana", new ImageLabel("image/banana.jpg"));
		panel.add("Mango", new ImageLabel("image/mango.jpg"));
		panel.add("Peach", new ImageLabel("image/peach.jpg"));
		
		add(btn, "South");
		add(panel, "Center");
		
		
		//Event Listeners
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//next(parent) : 카드 레이아웃을 다음으로 넘기기. parent 는 이 카드 레이아웃이 어디에 붙어 있는지 알려주는 역할
				cardLayoutManager.next(panel); //카드 레이아웃을 조작할 때는 어느 컨테이너를 조작해야 하는지 매개변수로 알려줘야 한다.
				
				//previous(parent : 카드 레이아웃을 이전으로 넘기기
				//cardLayoutManager.previous(panel);
				
				//first(parent) : 첫 번째 카드로 이동하기
				//cardLayoutManager.first(panel);
			
				//last(parent) : 마지막 카드로 이동하기 
				//cardLayoutManager.last(panel);
				
				//show(parent, cardName) : 원하는 카드로 이동하기. 컨테이너에 추가할 때 붙였던 이름이 필요하다. 
				//cardLayoutManager.show(panel, "Mango");
			}
		});
		
		
		setBounds(500, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new S08_CardLayout();
		
	}
}
