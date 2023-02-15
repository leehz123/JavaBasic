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
		//�̹��� ũ�� ����(���۸� �ϸ� ����
		
		
		//ImageIO.read(file) : �ش� �̹��� ������ �о BufferedImage �ν��Ͻ��� �����. 
		//getScaledInstance(width, height, hint) : ũ�� ���� �� �̹��� �ν��Ͻ��� ��ȯ 
		try {
			setIcon(new ImageIcon(ImageIO.read(new File(path)).getScaledInstance(imageSize, imageSize, Image.SCALE_SMOOTH)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
