package Annotation.AnnotationDemo03;

/**
 * @Author: lxy
 * @Date: 2020/12/21
 * @Description: Annotation.AnnotationDemo03
 * @Version: 1.0
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 描述要执行的类名和方法名
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Ann03_MyAnn01 {

    String className();

    String methodName();
}
