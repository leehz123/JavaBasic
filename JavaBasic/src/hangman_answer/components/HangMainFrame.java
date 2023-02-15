package hangman_answer.components;

import javax.swing.JButton;
import javax.swing.JFrame;

import hangman_answer.event.EnglishButtonEvent;



public class HangMainFrame extends JFrame{

	
	//picturePanel과 englishPanel의 제어권을 HangMainFrame에게 넘겨준다.
	
	HangPicturePanel picturePanel = new HangPicturePanel();
	HangEnglishPanel englishPanel = new HangEnglishPanel();
	
	String[] words = {"Programming", "C Language", "Python", "Programmer", "Web Designer"};
	
	
	
	public boolean checkAnswer(String cmd) { //행앤써라벨에도 쳌앤써(String cmd) 메서드가 있음 그 메서드가 몸체고 이 메서드는 매개변수 전달용일 뿐임 
		return englishPanel.answerLabel.checkAnswer(cmd);
	} //얘도 아래 이벤트전용컴포넌트 컨트롤 메서드에 들어가야 하는 거 아닌가? 
	
	
	
//______________________________________________________________________________________________________________________________

	//이벤트 전용 컴포넌트 컨트롤 메서드 모음 (모든 컴포넌트 클래스들과 맞닿아 있는 main frame에 만들어준 것)
	//이벤트에서 갖다 쓰세요~
	//그니까 각 컴포넌트의 액션리스너 안에 들어갈 실행 내용을 여기다가 정리해 두는 거네 
	//그리고 이 실행 코드들은 각 컴포넌트들이 extends하는 액션리스너를 이어받는 부모클래스의 멤버변수에 HangmanMainFrame의 인스턴스를 저장해두고 
	//그 멤버변수에 저장된 인스턴스로 이 메서드들을 불러서 쓰면 되는 것  
	
	
	//프레임의 모든 컴포넌트들을 컨트롤 할 수 있는 메서드들을 메인에 모아놔야 함 그리고 그것들을 액션리스너로 보내주는게 편할것. 이벤트에서 필요할 떄마다 갖다 쓰는 거 거기다 막 코딩하는 게 아니라 
	public void nextPicture() {
		picturePanel.cardLayoutManager.next(picturePanel);
	}
	
	public void newGame() {
		englishPanel.answerLabel.update(words[(int)(Math.random() * words.length)]);
	}
	
//_______________________________________________________________________________________________________________________________
	

	
	
	public HangMainFrame() {
		
		setTitle("Hang Man");
		
		
		//프레임에 컴포넌트 추가 
		//그림이 바뀌는 패널 (카드 레이아웃 예정) 
		add(picturePanel, "Center");
		
		// (1) 정답이 보여지는 라벨 (_ _ _ A _ B B _ )
		add(englishPanel, "South");

		
		
		
		//프레임에 모든 이벤트 추가 (하면서 해당 프레임의 인스턴스를 넘김)  
		EnglishButtonEvent btnEvent = new EnglishButtonEvent(this);  //객체화해서 미리 만들어둔 액션리스너
		
		for(JButton btn : englishPanel.getAllKey()) { //알파벳버튼 리스트에서 버튼 하나씩 꺼내면서 addActionListener()로 액리 적용
			btn.addActionListener(btnEvent);
		}
		

		
		//프레임 관련 초기화 설정 
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
