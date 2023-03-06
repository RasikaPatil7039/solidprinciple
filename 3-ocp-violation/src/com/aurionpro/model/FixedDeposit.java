package com.aurionpro.model;

public class FixedDeposit {

	private int accountnumber;
	private String name;
	private double principal;
	private int duration;
	private FestivalType festival;

	public FixedDeposit(int accountnumber, String name, double principal, int duration, FestivalType festival) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
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

	public FestivalType getFestival() {
		return festival;
	}

	public void setFestival(FestivalType festival) {
		this.festival = festival;
	}

	@Override
	public String toString() {
		return "FixedDeposit [accountnumber=" + accountnumber + ", name=" + name + ", principal=" + principal
				+ ", duration=" + duration + ", festival=" + festival + "]";
	}

	private double getInterestRates() {
		if (festival == FestivalType.Newyear) {
			return 0.08;
		} else if (festival == FestivalType.Diwali) {
			return 0.085;
		} else if (festival == FestivalType.Holi) {
			return 0.075;
		}
		return 0.065;

	}

	public double calculatesimpleinterest() {
		return principal * getInterestRates() * duration;

	}
}
