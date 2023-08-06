package classworks.lesson30_20230703.annotation.selfMadeAnnotation2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Company {
  String name() default "ABC";
  String city() default "XYZ";
}
