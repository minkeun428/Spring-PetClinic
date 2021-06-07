package org.springframework.samples.petclinic.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// 자바 파일로 Bean을 직접 등록하는 방법
@Configuration
public class SampleConfig {

	// SampleController라는 빈을 직접 정의함
	@Bean
	public SampleController sampleController() {
		return new SampleController();  // 이 객체가 IoC컨테이너에 등록됨
	}
}
