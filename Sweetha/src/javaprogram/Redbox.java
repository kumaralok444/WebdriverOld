package javaprogram;

public class Redbox {
	public static void main (String args[])
	{
		box b= new box();
		box b1= new box();
        b.length =100;
		b.width =40;
		b1.length=50;
		b1.width=50;
	     int a , c;
		 a= b.area();
		 c= b1.area();
		 System.out.println("the area of the box is "+a);
		 System.out.println("the area of the box is "+c);
		 	}

}
