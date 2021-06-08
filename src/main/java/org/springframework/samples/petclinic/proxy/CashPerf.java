package org.springframework.samples.petclinic.proxy;

import org.springframework.util.StopWatch;

public class CashPerf implements Payment {

	Payment cash = new Cash();

	@Override
	public void pay(int amount) {
		System.out.println("CashPerf 클래스로 들어옴!");

		StopWatch stopWatch = new StopWatch();
		System.out.println("stopWatch.start() 호출!");
		stopWatch.start();

		cash.pay(amount);

		stopWatch.stop();
		System.out.println("stopWatch.stop() 호출!");
		System.out.println("prettyPrint() 호출!" + stopWatch.prettyPrint());
		System.out.println("CashPerf 클래스에서 빠져나감!");
	}

}
