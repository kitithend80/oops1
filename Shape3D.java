public abstract class Shape3D {
	int r=8;
	public abstract void calculateVolume();
	public abstract void calculateSurfaceArea();
}
class Sphere extends Shape3D{
	public void calculateVolume() {
		double pi=3.14;
		double vol=1.33*pi*r*r*r;
		System.out.println("volume of sphere is "+vol);
	}
	public void calculateSurfaceArea() {
		double pi=3.14;
		double A=4*pi*r*r;
		System.out.println("surface area of sphere is "+A);
	}
}
class Cube extends Shape3D{
	public void calculateVolume() {
		int a=5;
		int vol=a^3;
		System.out.println("volume of cube is "+vol);
	}
	public void calculateSurfaceArea() {
		int a=6;
		int S_A=6*(a^2);
		System.out.println("Surface area of the cube is: "+S_A);
	}
}
class q_02{
	public static void main(String[] args) {
		Shape3D obj1;
		obj1=new Sphere();
		obj1.calculateVolume();
		obj1.calculateSurfaceArea();
		Shape3D obj2;
		obj2=new Cube();
		obj2.calculateVolume();
		obj2.calculateSurfaceArea();
	}
}