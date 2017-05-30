/**
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
import java.util.*;

public class HeapOOM {
    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while(true) {
            list.add(new OOMObject());
        }
    }
}

/*
 * java.lang.OutOfMemoryError: Java heap space
 * Dumping heap to java_pid29589.hprof ...
 * Heap dump file created [27548633 bytes in 0.077 secs]
 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 * 	at java.util.Arrays.copyOf(Arrays.java:3210)
 * 	at java.util.Arrays.copyOf(Arrays.java:3181)
 * 	at java.util.ArrayList.grow(ArrayList.java:261)
 * 	at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235)
 * 	at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227)
 * 	at java.util.ArrayList.add(ArrayList.java:458)
 * 	at HeapOOM.main(HeapOOM.java:14)
 * 
 */

// Look dump file java_pid29589.hprof
// $jhat -port 9998 java_pid29589.hprof
