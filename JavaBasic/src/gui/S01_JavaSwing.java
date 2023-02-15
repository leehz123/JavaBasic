package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 
 
 # Java Swing
 javax.swing 패키지의 클래스들
 GUI프로그램을 만들 수 있다. 
 
 
 # Container 
 - 여러 컴포넌트들을 배치할 수 있는 판
 - JFrame, JPanel, JDialog, ... 등 다양한 클래스가 컨테이너 역할을 할 수 있다. 
 - 컨테이너에는 레이아웃을 설정할 수 있다.
 
 
 # Component
 - 컨테이너 위에 배치할 수 있는 다양한 것들
 - 버튼, 표, 슬라이더, 메뉴, ... 등 다양한 클래스가 컴포넌트 역할을 할 수 있다. 

 */



public class S01_JavaSwing {
	public static void main(String[] args) {
		
		
		//프레임 인스턴스 생성
		JFrame frame = new JFrame("GUI 프로그래밍");
		frame.setLayout(null);//컴포넌트의 크기를 직접 설정하기 위해서는 붙이는 곳에 레이아웃이 없어야 한다.
		
		
		//프레임 위에 다른 컴포넌트를 붙일 수 있다.
		JButton btn = new JButton("THIS IS A BUTTON");
		JButton btn2 = new JButton("BUTTON2");
		
		
		//버튼의 위치와 크기 설정 가능
		btn.setLocation(50, 50);
		btn.setSize(200, 30);
		 

		btn2.setLocation(300, 50);
		btn2.setSize(95, 300);

		frame.add(btn);
		frame.add(btn2);
		

		
		//프레임의 x버튼을 눌렀을 때 동작을 설정할 수 있다.
		/*
		 설정할 수 있는 int값은 JFrame에 상수로 설정돼 있다. 
		 EXIT_ON_CLOSE : x버튼을 누르면 프로그램을 종료한다. 
		 DISPOSE_ON_CLOSE : 문서 참조
		 DO_NOTHING_ONCLOSE : 문서 참조
		 HIDE_ON_CLOSE : 문서 참조 
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);     
		//기타 등등 .. 찾아서 써라 
	
		
				
		//프레임 크기 설정
		frame.setSize(500, 500);
		
		
		
		//프레임 위치 설정
		frame.setLocation(100, 100); //더블보니터인 경우 x에 '+ 모니터 크기' 해줘야 함.  (100 + 1920, 100)
		
		
		
		//프레임을 보이게 설정 (맨 마지막에 해주는 것이 좋음. 어떤것들은 뜨고 어떤것들은 안 뜨는 것을 방지) 
		frame.setVisible(true);
				
		
		
	}
}



/*

setDefaultCloseOperator(JFrame.EXIT_ON_CLOSE):
System의 exit메서드를 사용해 어플리케이션 종료 

근데 이렇게 하면 편하긴 한데 JVM(Java Virtual Machine) 내에서 마지막 표시 가능한 윈도우가 파기(종료)되면 
JVM도 같이 종료됨
해결방법은 
frame.addWindowsListener(new WindowAdapter() {
	@Overriding
	public void windowClosing(WindowEvent e)  {
		System.exit(0); 
	}
}); 이렇게 사용하면 됨 






------------------------------이런 것도 있네... 머지?---------------------------------
public class WindowAdapterInnerTest extends JFrame{


	JLabel lb = new JLabel("WindowAdapter테스트중");

	public WindowAdapterInnerTest() {
		add(lb);
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		AdapterInner ai = new AdapterInner();
		addWindowListener(ai);
	
	}
		
	class AdapterInner extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent we) {
			lb.setText("윈도우 이벤트 처리됨");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new WindowAdapterInnerTest();
	}
}









*/