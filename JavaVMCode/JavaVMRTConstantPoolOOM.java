/**
 * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
 */
import java.util.*;

public class JavaVMRTConstantPoolOOM {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        int i = 0;
        while(true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}

//$javac JavaVMStackOOM.java
//$java -Xss2M JavaVMStackOOM
