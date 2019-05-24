package inheritancePractice;

class square {
	double x , y;
	
	square(){
		this.x = 0.5;
		this.y = 0.5;
	}
	
	square(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void area(){
		System.out.println("Area of Square is "+x*y);
	}
}

class volume extends square {
	double z;
	
	public volume() {
		super();
		this.z = 0.5;
	}

	public volume(double x, double y, double z) {
		super(x,y);
		this.z = z;
	}
	
	public void area(){
		System.out.println("Volume of Cube is "+x*y*z);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		square s1 = new square();
		s1.area();
		
		square s2 = new square(2.5, 3.5);
		s2.area();
		
		volume v1 = new volume();
		v1.area();
		
		volume v2 = new volume(3.5, 4.5, 5.5);
		v2.area();

	}

}
