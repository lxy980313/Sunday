package Reflect.ReflectDemo01;

/**
 * @Author: lxy
 * @Date: 2020/12/20
 * @Description: Reflect.rDemo01
 * @Version: 1.0
 */
//实体类：pojo或者entity
public class Person {

    private int age;
    private String name;

    public String a;
    protected String b;
    String c;
    private String d;

    public Person(){

    }
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    public void eat(){
        System.out.println("eat..");
    }

    public void eat(String food){
        System.out.println("eat "+food+"..");
    }

}
