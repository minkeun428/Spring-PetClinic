package org.springframework.samples.petclinic.owner;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)  //이 어노테이션을 메소드에서 쓰겠다.
@Retention(RetentionPolicy.RUNTIME)
public @interface LogExecutionTime {

}
