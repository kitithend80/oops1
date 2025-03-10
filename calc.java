import java.util.Scanner;

class simple_calculator {
	void addition(float a, float b) {
		float sum;
		sum=a+b;
		System.out.println("Addition :"+sum);
	}
	
	void substraction(float a, float b) {
		float sub;
		sub=a-b;
		System.out.println("Substraction :"+sub);
	}
	
	void multiplication(float a, float b) {
		float multiply;
		multiply=a*b;
		System.out.println("Multiplication :"+multiply);
	} }

class advanced_calculator extends simple_calculator {
	void division(float a,float b) {
		if (b<0) {
			System.out.println("denominator should be greater than 0!!!!");
			} else {
				float div;
				div=a/b;
			System.out.println("Division :"+div);
                }
	}
	
	void modular_division(float a, float b) {
		if (b<0) {
			System.out.println("denominator should be greater than 0!!!!");
			} else {
				float mod;
				mod=a%b;
			System.out.println("Modular division :"+mod);
		}
	} }

class super_calculator extends Simple_calculator {
	void square(float a, float b) {
		float sq_a,sq_b;
		sq_a=a*a;
		sq_b=b*b;
		System.out.println("Square of a:"+sq_a+"Square of b:"+sq_b);
	}
	
	void cube(float a, float b) {
		float cb_a,cb_b;
		cb_a=a*a*a;
		cb_b=b*b*b;
		System.out.println("cube of a:"+cb_a+"cube of b:"+cb_b);
	}

	void square_root(float a,float b) {
		float sqrt_a,sqrt_b;
		sqrt_a=a*(1/2);
		sqrt_b=b*(1/2);
		System.out.println("Square root of a:"+sqrt_a+"Square root of b:"+sqrt_b);
	} }

class main{
	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("enter a ::");
	float a= input.nextfloat();
	System.out.println("enter b ::");
	float b= input.nextfloat();
	d.addition();
	d.substraction();
	d.multiplication();
	d.division();
	d.modular_division();
	d.square();
	d.cube();
	d.square_root();
	
}
}

	

	