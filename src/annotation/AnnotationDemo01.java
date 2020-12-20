package annotation;

/**
 * @Author: lxy
 * @Date: 2020/12/20
 * @Description: annotation
 * @Version: 1.0
 */
public class AnnotationDemo01 {
    static String name;

    @MyAnnotation(name = "123")
    public static void test(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        test();
    }
}
