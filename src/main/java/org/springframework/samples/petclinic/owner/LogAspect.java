package org.springframework.samples.petclinic.owner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class LogAspect {

	Logger logger = LoggerFactory.getLogger(LogAspect.class);

	//LogExecutionTime이라는 어노테이션 주변에 밑 코드들을 적용하겠다.
	@Around("@annotation(LogExecutionTime)")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint)throws Throwable {
		//joinPoint == 해당 어노테이션 타겟 메소드(대상)
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		//이 어노테이션이 붙어있던 메소드들을 실행하겠다.
		Object proceed = joinPoint.proceed();

		stopWatch.stop();
		logger.info(stopWatch.prettyPrint());

		//그 메소드 결과를 리턴하겠다.
		return proceed;
	}

}
