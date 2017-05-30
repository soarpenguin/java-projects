/**
 * VM Args: -Xss128k
 */
import java.util.*;

public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF oom = new JavaVMStackSOF();

        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}

/*
 * stack length:1518
 * Exception in thread "main" java.lang.StackOverflowError
 *      at JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:11)
 *      at JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:12)
 *      at JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:12)
 *      at JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:12)
 */

//$javac JavaVMStackSOF.java
//$java -Xss228k JavaVMStackSOF
