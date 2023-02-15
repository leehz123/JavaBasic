

class Point {
	int x;
	int y;
	
	Point() {
		
	}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		//super();
		//super.x = x;
		//this.y = y;
		
		super(x, y);
		this.z = z;
		
	}

	void superx() {
		System.out.println(super.x);
	}


}

public class superPractice {

	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);
		
		
		System.out.println(p3.x);
		
		
		p3.superx();
		
		//Point p = new Point();
		//System.out.println(p.x);
		
		
		
		
	}
	
	
	
	
}
