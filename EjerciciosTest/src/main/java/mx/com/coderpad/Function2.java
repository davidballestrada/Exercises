package mx.com.coderpad;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@FunctionalInterface
public interface Function2<T, U, V> {
    public V apply(T t, U u);
 
    default void count() {
        // increment counter
    	Map a = new HashMap();
    	List b = new ArrayList();
    }
    

}