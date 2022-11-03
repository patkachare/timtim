package Abstractclass;

public class mainclass {
	public static void main(String[] args) {
		class1 obj = new class2();
		// referance vaaariable of parents class assigning to child class
		obj.m1();
		obj.m2();
		obj.m3();
	}

	void m1() {
	}
	
	float m2(float a) {
		 return a;
}
}	