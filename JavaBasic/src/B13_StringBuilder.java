
public class B13_StringBuilder {
	public static void main(String[] args) {
		StringBuilder brute_password_builder_append = new StringBuilder("");
		brute_password_builder_append.append('a');
		brute_password_builder_append.append('b');
		brute_password_builder_append.append('c');
		brute_password_builder_append.append('d');
		
		System.out.println(brute_password_builder_append);
		
		//.insert(������, �� ����); �� �������� boolean, int, long, flot, double, char, string �� ��. 
		StringBuilder brute_password_builder_insert = new StringBuilder("");
		brute_password_builder_insert.insert(0 ,'a');
		brute_password_builder_insert.insert(0, 'b');
		brute_password_builder_insert.insert(0, 'c');
		brute_password_builder_insert.insert(0, 'd');
		
		System.out.println(brute_password_builder_insert);
		
		StringBuilder builder1 = new StringBuilder("abc");
		builder1.insert(1,123);
		System.out.println(builder1);
	}
}
