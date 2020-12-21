package Annotation.AnnotationDemo01;

/**
 * @Author: lxy
 * @Date: 2020/12/21
 * @Description: Annotation.AnnotationDemo01
 * @Version: 1.0
 */
public @interface MyAnn01 {
    /*
        接口里能定义的，注解里也能
        注解属性：接口中的抽象方法
            要求：
                1.属性的返回值类型
                    基本数据类型
                    String
                    枚举类
                    注解
                    数组
                2.定义了属性，在使用时必须要给赋值，可以用default关键字默认初始化，如果只有一个属性值，
                    并且属性名字是value，则value可直接省略，直接定义即可
     */
    public int age();

    public String name();

    MyAnn02 myann02();

    String[] str();

    public abstract String ab() default "";
}
