package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: lxy
 * @Date: 2020/12/20
 * @Description: annotation
 * @Version: 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})//可用在什么地方
public @interface MyAnnotation {
    /*
        注解中的方法就是参数，参数就是方法
        注解没有默认参数时一定要设置值，否则报错
        标准格式：类型 参数名() default "";
     */
    String name() default "";
}
