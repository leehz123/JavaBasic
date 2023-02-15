package gui.quiz.hangman.component;

import java.io.File;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class HMImageLabel extends JLabel {
	
	
	static File imageDir = new File("HangManImage");
	public static ArrayList<ImageIcon> icons = new ArrayList<>();
	public static int state = 0;
	static int life = icons.size() - 1;
	
	
	static {
		for(File image : imageDir.listFiles()) {
			icons.add(new ImageIcon(image.getAbsolutePath()));
		}
	}
	
	
	public HMImageLabel() {
		super();
		setBounds(630, 5, 350, 550);
		setIcon(icons.get(state));
		state++;
	}
	
	
}
