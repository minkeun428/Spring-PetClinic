package org.springframework.samples.petclinic.proxy;

public class Store {
	Payment payment;

	// Store 생성자
	// StoreTest.java에선 이 파라미터를 CashPerf로 넘겨줬음.
	public Store(Payment payment){
		// 아래 코드는
		// this.payment = cashperf; 와 동일함
		this.payment = payment;
	}

	public void buySomething(int amount) {
		System.out.println("buySomething 메서드 호출!");

		// payment == cashPerf
		// 생성자 만들 때, 이 payment에 cashPerf 객체를 넘겨줬기 때문에.
		payment.pay(amount);
	}
}
