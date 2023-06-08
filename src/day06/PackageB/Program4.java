package day06.PackageB;

import day06.packageA.Program2;

public class Program4 extends Program2 {
	public static void main(String[] args) {
		Program2 x= new Program2();
		x.add(10,20);
		//x.div(10,2);//default methods
		//x.mul(3,20);//protected non-static method
		//x.sub(10,20);Private method
		
		Program4 y = new Program4();
		y.mul(10, 20);
		y.add(10, 20);
	}

}
