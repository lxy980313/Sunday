package Demo.Demo_AnnotationAndReflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: lxy
 * @Date: 2020/12/21
 * @Description: Demo.Demo_AnnotationAndReflect
 * @Version: 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Check {
}
