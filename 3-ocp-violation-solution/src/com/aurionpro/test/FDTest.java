package com.aurionpro.test;

import com.aurionpro.model.DiwaliInterest;

import com.aurionpro.model.FixedDeposit;

public class FDTest {

	public static void main(String[] args) {
		FixedDeposit obj = new FixedDeposit(1, "rasika", 1000, 6, new DiwaliInterest());
		System.out.println(obj);
		System.out.println("simple interest is : " + obj.calculatesimpleinterest());

	}

}
