package org.springframework.samples.petclinic.proxy;

public interface Payment {

	void pay(int amount);

	default void pay2() {
		System.out.println("난 디폴트 메서드다!!");
	}
}
