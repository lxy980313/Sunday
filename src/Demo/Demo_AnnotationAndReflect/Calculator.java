package Demo.Demo_AnnotationAndReflect;

/**
 * @Author: lxy
 * @Date: 2020/12/21
 * @Description: Demo.Demo_AnnotationAndReflect
 * @Version: 1.0
 */
public class Calculator {
    @Check
    public void add(){
        System.out.println("1+0="+(1+0));
    }
    @Check
    public void sub(){
        System.out.println("1-0="+(1-0));
    }
    @Check
    public void mul(){
        System.out.println("1*0="+(1*0));
    }
    @Check
    public void div(){
        System.out.println("1/0="+(1/0));
    }
}
