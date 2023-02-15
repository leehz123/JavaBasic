import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WindowAdapterInnerTest extends JFrame{


	JLabel lb = new JLabel("WindowAdapter�׽�Ʈ��");

	public WindowAdapterInnerTest() {
		add(lb);
		
		setSize(500, 500);
		setVisible(true);
		//setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		
	}
		
	class AdapterInner extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent we) {
			lb.setText("������ �̺�Ʈ ó����");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new WindowAdapterInnerTest();
	}
}



