package myobj.student;

abstract public class Student implements Average, GradeCard {
	 
	abstract public int sum();
	
	abstract public double avg();
	
	abstract public void printGradeCard();
	
	private static String[] firstName = {"����", "��ȯ", "����", "����", "����", "��ȣ", "����", 
										"ȿ��", "ȿ��", "����", "����", "����", "����", "����", "����", "����", "����", "����"};
	
	private static String[] lastName = {"��", "��", "��", "��", "��", "��", "��", "��", 
										"��", "��", "��", "ȫ", "��"};
	
	private static int currStuNum = 1000;
	
	protected String name; //��� �л��� ������ �̸��� �й��� ���� ���� __�̰ŋ��� Student�� �ν��Ͻ��� �Ǳ� �ָ���
	protected int stuNum;
	//name�� stuNum �� ���� �Ժη� ������������ ���ϰ� ��� ���� ����.
	//�ڽ�Ŭ���������� ���� �ϴϱ� protected��(private����) 
	
	protected Student() { //�л��� �ƹ��л��̳� �� ����� ������ ����. ProgrammingStudent �� .. ���� �ڽ�Ŭ�����鸸 �ǵ� �� �ֵ��� protected 
		name = getRanName();
		stuNum = currStuNum++; //�л� �ν��Ͻ� ���� ������ �л��� ������Ű��. �׸��� �װ� �����ϴ� CurrStuNum �� static�̾�� ��!
	}
	
	@Override
	public String toString() {
		return name + "[" + stuNum + "]";
	}

	public static String getRanName() {
		return lastName[(int)(Math.random() * lastName.length)]
				+ firstName[(int)(Math.random() * firstName.length)];
	}
	
	
	
	
//	public static void main(String[] args) {
//		
//		for(int i =0 ; i < 100; ++i) {
//			System.out.println(new Student());
//		}
//	
//	}
	
}
