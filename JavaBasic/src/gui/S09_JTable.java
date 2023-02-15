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


//���� ���� �͵��� �ܿ� �ʿ� ���� �� ������ ã�Ƽ� �ϴ°� 

public class S09_JTable extends JFrame {
	//���� ����� ���� �ʰ� ����ڿ��� �����ֱ� ���� ���̺�
	//ǥ ����� ���� Ŭ���� �ǳ�. ���±��� ������ ǥ�� ���ٰ� �� �̰� �츮�� �� �� ��������ߵ�? �ϴ� ���̺��� ���� ��. �ű�� �̺�Ʈ�� ���� ���� �� �ؾ� ��
	//(��������忡���� ���ٰ� ������ ����Ǵϱ� �� �� �������� ���ΰ�?)
	
	public S09_JTable() {
		
		String[][] rowData = {
				{"�Ƹ޸�ī��", "1500"},
				{"�Ƹ޸�ī��", "1500"},
				{"�Ƹ޸�ī��", "1500"},
				{"�Ƹ޸�ī��", "1500"}
		};
		
		
		String[] columnNames = {"Coffee Name", "Price"};
		
		
		//JTable �� ��ũ���ҿ� �ٿ��� ����� ���´�. �ڡڡڡڡ�
		JTable table = new JTable(rowData, columnNames);
		JButton south = new JButton("print console!");
		
		
		//���̺� ���� ���� (Ŭ���ص� ���� �ȵ�)
		//table.setEnabled(false);
		 
		
		
		
		//���̺� ���� �̺�Ʈ ó���ϱ� 
		
		//ListSelection Model : ���̺� ���ÿ� ���õ� ������ �� �� �ִ� ��.
		ListSelectionModel selectionModel =  table.getSelectionModel();
		
		//setSelectionMode : ���� ��带 ������ �� �ִ�. 
		selectionModel.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); //��Ʈ�ѷ� ���͹������� �����ϰ� ����� �ǰ���
		
		//setSelctionMode : �� ���� ������ �� �ֵ��� ���� 
		table.setCellSelectionEnabled(true);
		
		
		//���̺� ���� �̺�Ʈ
		selectionModel.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				if(!e.getValueIsAdjusting()) {  //�������� : �����ϴ�  
					System.out.println("selected row : " + table.getSelectedRow());
					System.out.println("selected col : " + table.getSelectedColumn());
				} else { 
					System.out.println("Adjusting ... (���콺�� �� ������ ������ ... ) "); //ù�࿡�� ���콺�� ������ ����° �࿡�� ���콺�� ���� �� �׷� �͵� �� �� �ְ���
					System.out.println("Adjusting firstIndex : " + e.getFirstIndex());
					System.out.println("Adjusting lastIndex : " + e.getLastIndex());
				}
			}
		});
		
		
		//Ư�� ������Ʈ�� ��ũ�� ������ ���·� �����ֱ� ���� ���ȴ�. 
		JScrollPane scrollPane = new JScrollPane(table); 
		
		
		add(scrollPane, "Center");
		add(south, "South");
		
		
		
		//@@@@@@@@@@@@@���̺� ������ �����͸� �ֿܼ��� ����@@@@@@@@@@@@@@@@@
		south.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//���̺� ������ ������ table.getModel()�� ������ �Ѵ�.
				TableModel model = table.getModel();
				int colCount = model.getColumnCount();
				int rowCount = model.getRowCount();
				
				System.out.println("�÷� : " + colCount);
				System.out.println("�� : " + rowCount);
				
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
