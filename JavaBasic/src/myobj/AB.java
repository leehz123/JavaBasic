package myobj;

	public class AB extends BloodType {
		
		public AB() {
			bloodType = "AB";
		}
		
		@Override
		void character() {
			System.out.println("�Ǵܷ��� �پ��.");
		}
		
		@Override
		public String toString() {
			return "������ : " + bloodType;
		}
		
	}

