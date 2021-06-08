package org.springframework.samples.petclinic.proxy;

import org.junit.jupiter.api.Test;

public class StoreTest {

	@Test
	public void testPay() {
		//Payment 역할을 하는 cashPerf이라는 이름을 가진 CashPerf의 객체를 만든다.
		Payment cashPerf = new CashPerf();

		//Store 생성자는 Payment주입이 꼭 필요하다.
		Store store = new Store(cashPerf);

		System.out.println("Store 객체로 들어간다!");
		store.buySomething(100);
	}

}
