package com.aurionpro.model;

public class FixedDeposit {

	private int accountnumber;
	private String name;
	private double principal;
	private int duration;
	private IFestivalInterest interest;

	public FixedDeposit(int accountnumber, String name, double principal, int duration, IFestivalInterest interest) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.interest = interest;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public IFestivalInterest getInterest() {
		return interest;
	}

	public void setInterest(IFestivalInterest interest) {
		this.interest = interest;
	}

	

	@Override
	public String toString() {
		return "FixedDeposit [accountnumber=" + accountnumber + ", name=" + name + ", principal=" + principal
				+ ", duration=" + duration + ", interest=" + interest.getInterestRate() + ",festival=" + interest.getFestival() + "]";
	}

	// private double getInterestRates() {
//		if (festival==FestivalType.Newyear) {
//			return 0.08;
//		} else if (festival==FestivalType.Diwali) {
//			return 0.085;
//		} else if (festival==FestivalType.Holi) {
//			return 0.075;
//		}
//		return 0.065;
//
//	}
//
	public double calculatesimpleinterest() {
		System.out.println("accountno. : "+accountnumber);
		System.out.println("name : "+name);
		return (principal *duration*interest.getInterestRate());

	}
}
