package quiz;

import myobj.student.Average;
import myobj.student.GradeCard;
import myobj.student.MachineLearningStudent;
import myobj.student.NetworkStudent;
import myobj.student.ProgrammingStudent;
/*
1. 프로그래밍반 학생들을 각자의 국어, 영어, 수학, 프로그래밍 언어, 자료 구조, 운영체제 점수가 있다. 
2. 네트워크반 학생들은 각자의 국어, 영어, 리눅스, 네트워크, CCNA 점수가 있다. 
3. 머신러닝반 학생들은 각자의 국어, 영어, 수학, 통계학, 프로그래망 언어 점수가 있다. 
 
100명의 학생을 랜덤으로 생성한다. 
모든 학생의 소속 반, 과목별 점수, 이름은 랜덤으로 생성돼야 하고,
학번은 중복 없이 순차적으로 생성돼야 한다.  (A00001 이런 식으로 해도 됨)

5. 성적표 출력 메서드를 통해 각 학생의 [이름/각 과목 점수/총점/평균] 을 구할 수 있어야 한다.   
*/





public class C14_School_정답풀이 {

	
	static void printAverage(Average[] arr) {
		for(Average obj : arr) {
			System.out.println(obj);
			System.out.println("총합 :" + obj.sum());
			System.out.println("평균 : " + obj.avg());
		}
	}
	 
	static void printGradeCard(GradeCard[] arr) {
		for(GradeCard obj : arr) {
			obj.printGradeCard();
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
		//Student stu = new ProgrammingStudent();
		//오류1.
		//여기서 Student클래스는 myobj.student패키지의 Student인데 ctrl+shift+o 를 이용해 자동 import 를 하면 엉뚱한 quiz.Student 가 import 됨
		// = Type mismatch 오류 
		//문제 발생 원인 : 자동임포트를 할 때 가장 가까운 위치에 있는 클래스부터 찾기 때문!
		//해결책 : 패키지명.패키지명.클래스명 이런 형태로 명시적 표기를 해주면 된다. myobj.student.Student[] stu = new myobj.student.Student[100];  
		//오류2.
		//그리고 패키지명은 소문자로만 작명돼야 하는데 Student라고 지어서 오류 났었음
		// myobj.Student.Student (x) myobj.student.Student (o)
		
		
		myobj.student.Student[] students = new myobj.student.Student[100];
		// 명시 귀찮네 
		
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
		printAverage(students); //아 왜 렉 떠 !
	}
}
