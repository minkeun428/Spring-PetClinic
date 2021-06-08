package org.springframework.samples.petclinic.proxy;

public class Cash implements Payment {

	@Override
	public void pay(int amount) {
		System.out.println("난 Cash클래스!" + amount + "현금 결제");
	}



}
