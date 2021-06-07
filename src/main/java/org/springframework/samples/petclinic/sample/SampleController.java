package org.springframework.samples.petclinic.sample;

import org.springframework.stereotype.Controller;


@Controller
public class SampleController {

	SampleRepository sampleRepository;

	// 1번 생성자
	// SampleController의 기본생성자
	// 컴파일 시, IDE에서 자동 생성해주기 때문에 선언 안해줘도 됨
	// 이건 그냥 해당 클래스의 객체를 가져다가 쓸 수 있게 만든 Default생성자일뿐
	// 이걸로 객체를 가져와 sampleRepository를 참조할 수 없다 == 빈 껍데기
	public SampleController(){}

	// 2번 생성자
	// SampleController인데 SampleRepository를 받아와서
	// doSomething 메소드를 호출할 때, save를 받아오고 있다.
	public SampleController(SampleRepository sampleRepository) {
		this.sampleRepository = sampleRepository;
	}

	public void doSomething() {
		System.out.println("doSomething 시작!!");
		sampleRepository.save();
	}

}
