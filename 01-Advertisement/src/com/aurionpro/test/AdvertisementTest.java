package com.aurionpro.test;

import com.aurionpro.model.Advertisement;
import com.aurionpro.model.Billboard;
import com.aurionpro.model.Projector;

public class AdvertisementTest {

	public static void main(String[] args) {
		Advertisement obj = new Advertisement("sell house", new Billboard());
		obj.showAdvertisement();
		
		Advertisement obj2 = new Advertisement("sell car", new Projector());
		obj2.showAdvertisement();
		

	}

}
