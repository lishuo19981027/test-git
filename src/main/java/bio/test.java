package bio;

import java.lang.annotation.*;


@Target({ ElementType.FIELD, ElementType.METHOD ,ElementType.TYPE})  //可以在字段、枚举的常量、方法
@Retention(RetentionPolicy.RUNTIME)
public @interface test {
    String value() default "";
}

