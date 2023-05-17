package day06.PackageB;

import day06.packageA.Program8;

public class Program10 extends Program8 {
	public static void main(String[] args) {
		Program8 x= new Program8();
		x.add(10,20);
		//x.div(10,2);//default methods
		//x.mul(3,20);//protected non-static method
		//x.sub(10,20);Private method
		
		Program10 y = new Program10();
		y.mul(10, 20);
		y.add(10, 20);
	}

}
