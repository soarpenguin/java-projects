package annotation;

@HelloAnnotation(say = "Do it!")
public class TestMain {
    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        HelloAnnotation annotation = TestMain.class.getAnnotation(HelloAnnotation.class);//获取TestMain类上的注解对象
        System.out.println(annotation.say());//调用注解对象的say方法，并打印到控制台
    }
}
