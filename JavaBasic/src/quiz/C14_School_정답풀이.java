package quiz;

import myobj.student.Average;
import myobj.student.GradeCard;
import myobj.student.MachineLearningStudent;
import myobj.student.NetworkStudent;
import myobj.student.ProgrammingStudent;
/*
1. ���α׷��ֹ� �л����� ������ ����, ����, ����, ���α׷��� ���, �ڷ� ����, �ü�� ������ �ִ�. 
2. ��Ʈ��ũ�� �л����� ������ ����, ����, ������, ��Ʈ��ũ, CCNA ������ �ִ�. 
3. �ӽŷ��׹� �л����� ������ ����, ����, ����, �����, ���α׷��� ��� ������ �ִ�. 
 
100���� �л��� �������� �����Ѵ�. 
��� �л��� �Ҽ� ��, ���� ����, �̸��� �������� �����ž� �ϰ�,
�й��� �ߺ� ���� ���������� �����ž� �Ѵ�.  (A00001 �̷� ������ �ص� ��)

5. ����ǥ ��� �޼��带 ���� �� �л��� [�̸�/�� ���� ����/����/���] �� ���� �� �־�� �Ѵ�.   
*/





public class C14_School_����Ǯ�� {

	
	static void printAverage(Average[] arr) {
		for(Average obj : arr) {
			System.out.println(obj);
			System.out.println("���� :" + obj.sum());
			System.out.println("��� : " + obj.avg());
		}
	}
	 
	static void printGradeCard(GradeCard[] arr) {
		for(GradeCard obj : arr) {
			obj.printGradeCard();
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
		//Student stu = new ProgrammingStudent();
		//����1.
		//���⼭ StudentŬ������ myobj.student��Ű���� Student�ε� ctrl+shift+o �� �̿��� �ڵ� import �� �ϸ� ������ quiz.Student �� import ��
		// = Type mismatch ���� 
		//���� �߻� ���� : �ڵ�����Ʈ�� �� �� ���� ����� ��ġ�� �ִ� Ŭ�������� ã�� ����!
		//�ذ�å : ��Ű����.��Ű����.Ŭ������ �̷� ���·� ����� ǥ�⸦ ���ָ� �ȴ�. myobj.student.Student[] stu = new myobj.student.Student[100];  
		//����2.
		//�׸��� ��Ű������ �ҹ��ڷθ� �۸�ž� �ϴµ� Student��� ��� ���� ������
		// myobj.Student.Student (x) myobj.student.Student (o)
		
		
		myobj.student.Student[] students = new myobj.student.Student[100];
		// ��� ������ 
		
		for(int i = 0; i < 100; i++ ) {
			switch((int)(Math.random()*3)) {
			case 0:
				students[i] = new ProgrammingStudent();
				break;
			case 1:
				students[i] = new NetworkStudent();
				break;
			case 2:
				students[i] = new MachineLearningStudent();
				break;
			}
		}
		printGradeCard(students);
		printAverage(students); //�� �� �� �� !
	}
}
