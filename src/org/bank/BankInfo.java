package org.bank;

public class BankInfo extends AxisBank {
	
	public void saving() {
		System.out.println("Savings in Axis");
	
	}
	public void fixed() {
		System.out.println("Fixed in Axis");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		BankInfo b = new BankInfo();
		b.fixed();
		b.saving();
		b.deposit();

	}

}
