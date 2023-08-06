package classworks.lesson30_20230703.annotation.annotation3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface HelloAnnotation {
  String value();
  String greetTo();
}