package hangman_answer.components;

import javax.swing.JButton;
import javax.swing.JFrame;

import hangman_answer.event.EnglishButtonEvent;



public class HangMainFrame extends JFrame{

	
	//picturePanel�� englishPanel�� ������� HangMainFrame���� �Ѱ��ش�.
	
	HangPicturePanel picturePanel = new HangPicturePanel();
	HangEnglishPanel englishPanel = new HangEnglishPanel();
	
	String[] words = {"Programming", "C Language", "Python", "Programmer", "Web Designer"};
	
	
	
	public boolean checkAnswer(String cmd) { //��ؽ�󺧿��� �n�ؽ�(String cmd) �޼��尡 ���� �� �޼��尡 ��ü�� �� �޼���� �Ű����� ���޿��� ���� 
		return englishPanel.answerLabel.checkAnswer(cmd);
	} //�굵 �Ʒ� �̺�Ʈ����������Ʈ ��Ʈ�� �޼��忡 ���� �ϴ� �� �ƴѰ�? 
	
	
	
//______________________________________________________________________________________________________________________________

	//�̺�Ʈ ���� ������Ʈ ��Ʈ�� �޼��� ���� (��� ������Ʈ Ŭ������� �´�� �ִ� main frame�� ������� ��)
	//�̺�Ʈ���� ���� ������~
	//�״ϱ� �� ������Ʈ�� �׼Ǹ����� �ȿ� �� ���� ������ ����ٰ� ������ �δ� �ų� 
	//�׸��� �� ���� �ڵ���� �� ������Ʈ���� extends�ϴ� �׼Ǹ����ʸ� �̾�޴� �θ�Ŭ������ ��������� HangmanMainFrame�� �ν��Ͻ��� �����صΰ� 
	//�� ��������� ����� �ν��Ͻ��� �� �޼������ �ҷ��� ���� �Ǵ� ��  
	
	
	//�������� ��� ������Ʈ���� ��Ʈ�� �� �� �ִ� �޼������ ���ο� ��Ƴ��� �� �׸��� �װ͵��� �׼Ǹ����ʷ� �����ִ°� ���Ұ�. �̺�Ʈ���� �ʿ��� ������ ���� ���� �� �ű�� �� �ڵ��ϴ� �� �ƴ϶� 
	public void nextPicture() {
		picturePanel.cardLayoutManager.next(picturePanel);
	}
	
	public void newGame() {
		englishPanel.answerLabel.update(words[(int)(Math.random() * words.length)]);
	}
	
//_______________________________________________________________________________________________________________________________
	

	
	
	public HangMainFrame() {
		
		setTitle("Hang Man");
		
		
		//�����ӿ� ������Ʈ �߰� 
		//�׸��� �ٲ�� �г� (ī�� ���̾ƿ� ����) 
		add(picturePanel, "Center");
		
		// (1) ������ �������� �� (_ _ _ A _ B B _ )
		add(englishPanel, "South");

		
		
		
		//�����ӿ� ��� �̺�Ʈ �߰� (�ϸ鼭 �ش� �������� �ν��Ͻ��� �ѱ�)  
		EnglishButtonEvent btnEvent = new EnglishButtonEvent(this);  //��üȭ�ؼ� �̸� ������ �׼Ǹ�����
		
		for(JButton btn : englishPanel.getAllKey()) { //���ĺ���ư ����Ʈ���� ��ư �ϳ��� �����鼭 addActionListener()�� �׸� ����
			btn.addActionListener(btnEvent);
		}
		

		
		//������ ���� �ʱ�ȭ ���� 
		newGame();
		

		setResizable(false);
		setBounds(500, 100, 800, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new HangMainFrame();
	}
	
}
