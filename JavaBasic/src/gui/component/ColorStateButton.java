package gui.component;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ColorStateButton extends JButton {
	
	private static Color[] bg_colors = 
		{Color.WHITE, Color.GREEN, Color.YELLOW, Color.RED, Color.BLACK};
	private int state = 0;
	private int num; 
	
	
	
	private static ActionListener eventListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			ColorStateButton performedButton = (ColorStateButton)e.getSource();
			performedButton.change();
		}
	};
	
	
	
	public ColorStateButton(int num) {
		super("button" + num); // = setText("button" + num);
		this.num = num;
		
		addActionListener(eventListener); //각 버튼이 결국 다 같은 동작을 할 건데 액션리스너는 따로 만들어서 하나만 두는게 낫겠지 
		
		setBackground(bg_colors[state]);
	}
	
	
	
	public void change() {
		if(state < bg_colors.length - 1) {
			setBackground(bg_colors[++state]);
		}
		
		
	}
}
