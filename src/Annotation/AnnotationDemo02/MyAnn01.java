package Annotation.AnnotationDemo02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: lxy
 * @Date: 2020/12/21
 * @Description: Annotation.AnnotationDemo02
 * @Version: 1.0
 */

@Target(value = {ElementType.TYPE, ElementType.METHOD, ElementType.FIELD}) //规定用的位置
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnn01 {
}
