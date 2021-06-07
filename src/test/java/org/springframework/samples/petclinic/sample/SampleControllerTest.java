package org.springframework.samples.petclinic.sample;

import org.junit.jupiter.api.Test;

public class SampleControllerTest {

	@Test
	public void testDoSomething() {
		SampleRepository sampleRepository = new SampleRepository();

		// 1번 생성자(Default) 호출
		// SampleController의 빈 껍데기만 가져오는 것이므로,
		// 해당 메소드 안에 sampleRepository는 아무것도 없는 값이다.
		SampleController sampleController1 = new SampleController();
		sampleController1.doSomething();

		// 2번 생성자 호출
		// SampleRepository를 참조하고 있는 생성자(의존성 주입을 통해)를 만들었으므로,
		// sampleRepository의 메소드까지 정상 접근할 수 있다.
		SampleController sampleController2 = new SampleController(sampleRepository);
		sampleController2.doSomething();
	}
}
