package com.tnsif.javaInterface;

public class CommissionAssignment {
	String Name;
	String Address;
	int phone;
	double salesAmount;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public CommissionAssignment(String name, String address, int phone, double salesAmount) {
		super();
		Name = name;
		Address = address;
		this.phone = phone;
		this.salesAmount = salesAmount;
	}
	public double calculateCommission()
	{
		if (salesAmount>=100000)
				{
			return salesAmount*0.10;
				}
		else if (salesAmount>=50000 && salesAmount<100000)
		{
			return salesAmount * 0.05;
		}
		else if (salesAmount>=30000 && salesAmount<50000)
		{
			return salesAmount * 0.03;
		}
		else if (salesAmount < 30000)
		{
			return salesAmount;
		}
		else
		{
			return 0;
		}
	}
	
	public void display()
	{
		System.out.println("Name: " + Name);
        System.out.println("Address: " + Address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission Earned: " + calculateCommission());
	}
	@Override
	public String toString() {
		return "StudentAssignment [Name=" + Name + ", Address=" + Address + ", phone=" + phone + ", salesAmount="
				+ salesAmount + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
