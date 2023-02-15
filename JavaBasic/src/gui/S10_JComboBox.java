package gui;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class S10_JComboBox extends JFrame {
	
	public S10_JComboBox() {
		setTitle("ComboBox Example");
		
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(50, 50, 100, 20);
		combo.addItem("Apple");
		combo.addItem("Banana");
		combo.addItem("Orange");
		combo.addItem("Kiwi");
		add(combo);
		
		
		combo.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				//아이템 선택이 바귈 때마다 선택된 아이템과 선택 해제된 아이템이 이벤트로 도착한다. 
				switch(e.getStateChange()) {
				case ItemEvent.SELECTED : 
					System.out.println("SELECTED : " + e.getItem());
					break;
				case ItemEvent.DESELECTED :
					System.out.println("DESELECTED : " + e.getItem());
					break;
				}
			}
		});
		
		
		
		setLayout(null);
		setBounds(500, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S10_JComboBox();
	}
}
