package javaprogram;

public class calinterest {
	public static void main (String args[])
	{
		bank demo = new bank();
		sbi demo1 = new sbi();
		axis demo2 = new axis();
		System.out.println("Interest of sbi is "+ demo1.getname());
		System.out.println("Interest of axis is "+ demo2.getname());
		System.out.println("Interest of bank is "+ demo.getname());

	}
	

}