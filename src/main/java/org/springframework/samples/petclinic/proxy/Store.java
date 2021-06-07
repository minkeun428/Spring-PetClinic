package org.springframework.samples.petclinic.proxy;

public class Store {
	Payment payment;

	//다른 곳에서 Store객체를 사용할 땐, 반드시 Payment주입이 필요함.
	public Store(Payment payment){
		this.payment = payment;
	}

	public void buySomething(int amount) {
		payment.pay(amount);
	}
}
