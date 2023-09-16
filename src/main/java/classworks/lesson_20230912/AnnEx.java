package classworks.lesson_20230912;

import lombok.Getter;

import java.io.InputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Getter
@PhoneInfo(operationSystem = "IOS", year = 2023)
public class AnnEx {
  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public static void main(String[] args) {

  }
}

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@interface FirstAnn {
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface PhoneInfo {
  String operationSystem() default "IOS";
  int year() default 2020;
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Info {
  String model();
}