package com.cg.framework;

public abstract class BankAcc {
	//fields
	private int accNo;
	private String accNm;
	private float accBal;
	
	//constructor
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}

	//setters and getters method
	public int getAccNo() {
		return accNo;
	}
	
	//methods
	abstract public void Withdraw(float Bal);
	public void Deposite(float Bal)
	{
		System.out.println(Bal);
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	
	

}
