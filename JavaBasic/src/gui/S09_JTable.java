package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;


//스윙 같은 것들은 외울 필요 없고 걍 때마다 찾아서 하는겨 

public class S09_JTable extends JFrame {
	//딱히 기능이 있진 않고 사용자에게 보여주기 위한 테이블
	//표 만들고 보니 클릭도 되네. 여태까지 정제된 표만 보다가 아 이거 우리가 뭐 다 설정해줘야돼? 하는 테이블을 만난 것. 거기다 이벤트도 막고 별짓 다 해야 됨
	//(사용자입장에서만 보다가 개발자 입장되니까 할 게 많아졌단 뜻인가?)
	
	public S09_JTable() {
		
		String[][] rowData = {
				{"아메리카노", "1500"},
				{"아메리카노", "1500"},
				{"아메리카노", "1500"},
				{"아메리카노", "1500"}
		};
		
		
		String[] columnNames = {"Coffee Name", "Price"};
		
		
		//JTable 은 스크롤팬에 붙여야 제대로 나온다. ★★★★★
		JTable table = new JTable(rowData, columnNames);
		JButton south = new JButton("print console!");
		
		
		//테이블 수정 막기 (클릭해도 선택 안됨)
		//table.setEnabled(false);
		 
		
		
		
		//테이블 선택 이벤트 처리하기 
		
		//ListSelection Model : 테이블 선택에 관련된 설정을 할 수 있는 모델.
		ListSelectionModel selectionModel =  table.getSelectionModel();
		
		//setSelectionMode : 선택 모드를 설정할 수 있다. 
		selectionModel.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); //컨트롤로 인터벌셀렉션 가능하게 만드는 건가벼
		
		//setSelctionMode : 한 셀만 선택할 수 있도록 설정 
		table.setCellSelectionEnabled(true);
		
		
		//테이블 선택 이벤트
		selectionModel.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				if(!e.getValueIsAdjusting()) {  //어저스드 : 조정하다  
					System.out.println("selected row : " + table.getSelectedRow());
					System.out.println("selected col : " + table.getSelectedColumn());
				} else { 
					System.out.println("Adjusting ... (마우스를 꾹 누르고 조정중 ... ) "); //첫행에서 마우스를 누르고 세번째 행에서 마우스를 뗐을 때 그런 것도 알 수 있겠음
					System.out.println("Adjusting firstIndex : " + e.getFirstIndex());
					System.out.println("Adjusting lastIndex : " + e.getLastIndex());
				}
			}
		});
		
		
		//특정 컴포넌트를 스크롤 가능한 형태로 보여주기 위해 사용된다. 
		JScrollPane scrollPane = new JScrollPane(table); 
		
		
		add(scrollPane, "Center");
		add(south, "South");
		
		
		
		//@@@@@@@@@@@@@테이블 내부의 데이터를 콘솔에서 보기@@@@@@@@@@@@@@@@@
		south.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//테이블 데이터 정보는 table.getModel()로 꺼내야 한다.
				TableModel model = table.getModel();
				int colCount = model.getColumnCount();
				int rowCount = model.getRowCount();
				
				System.out.println("컬럼 : " + colCount);
				System.out.println("행 : " + rowCount);
				
				for(int row = 0; row < rowCount; ++row) {
					for(int col = 0; col < colCount; ++col) {
						System.out.println(model.getValueAt(row, col) + "\t");
					}
				}
				System.out.println();
			}
		});
		
		
		
		
		
		setBounds(500, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	}

	public static void main(String[] args) {
		new S09_JTable();
	}
}
