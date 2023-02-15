package hangman_answer.components;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class HangImageLabel extends JLabel {

	static int imageSize = 460;
	
	
	public HangImageLabel(String path) {
		//이미지 크기 조절(구글링 하면 나옴
		
		
		//ImageIO.read(file) : 해당 이미지 파일을 읽어서 BufferedImage 인스턴스로 만든다. 
		//getScaledInstance(width, height, hint) : 크기 조절 된 이미지 인스턴스를 반환 
		try {
			setIcon(new ImageIcon(ImageIO.read(new File(path)).getScaledInstance(imageSize, imageSize, Image.SCALE_SMOOTH)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
