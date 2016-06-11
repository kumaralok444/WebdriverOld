package java1;

public class mainBank {
	public static void main(String args[])
	{
		bank b=new bank();
		sbi s=new sbi();
		pnb p=new pnb();
		int i;
		i=b.getIntrest();
		System.out.println("Intrest of bank:"+i);
		i=s.getIntrest();
		System.out.println("Intrest of SBI:"+i);
		i=p.getIntrest();
		System.out.println("Intrest of PNB:"+i);
	}

}
