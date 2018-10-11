package northwind.service;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Payload;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidCanadaPhone {

	String message() default "northwind.entity.Job.phone";
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
}