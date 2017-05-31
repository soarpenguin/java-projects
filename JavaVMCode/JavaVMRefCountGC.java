/**
 * VM Args: -Xss128k
 */
import java.util.*;

public class JavaVMRefCountGC {

    public Object instance = null;
    private static final int _1MB = 1024 * 1024;

    private byte[] bigSize = new byte[2 * _1MB];

    public static void testGC() {
        JavaVMRefCountGC objA = new JavaVMRefCountGC();
        JavaVMRefCountGC objB = new JavaVMRefCountGC();
        
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();
    }

    public static void main(String[] args) {
        testGC();
    }
}

//$javac JavaVMRefCountGC.java
//$java -Xss228k -Xloggc:gc.log JavaVMRefCountGC
