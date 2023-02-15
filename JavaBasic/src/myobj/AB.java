package myobj;

	public class AB extends BloodType {
		
		public AB() {
			bloodType = "AB";
		}
		
		@Override
		void character() {
			System.out.println("판단력이 뛰어나다.");
		}
		
		@Override
		public String toString() {
			return "혈액형 : " + bloodType;
		}
		
	}

