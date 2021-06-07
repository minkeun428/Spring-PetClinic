package org.springframework.samples.petclinic.sample;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class) // 스프링 기반의 테스트를 작성하기 위함
@SpringBootTest
public class SampleControllerTest {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	// ApplicationContext에 SampleController이 빈으로 등록되어 있는지 확인하는 테스트 코드
	public void testDI() {
		SampleController bean = applicationContext.getBean(SampleController.class);
		assertThat(bean).isNotNull();
	}


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
