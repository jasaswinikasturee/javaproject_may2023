package day07;

public class Program3 extends Program2 {

	int u=1000;
	int v=2000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3 x= new Program3();
		x.add(10, 20);

	}

	@Override
	public void add(int a, int b)
	{
		System.out.println((a*a)+(b*b));
		super.displayResult(x+super.y);
		this.mul(this.u, this.v);
	}
	
	public void mul(int x1, int y1)
	{
		System.out.println(x1*y1);
	}
}
