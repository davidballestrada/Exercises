package mx.com.coderpad;

public class test {
    
        int a;
        int b;
        test(int i, int j) 
        {
            a = i;
            b = j;
        }
        void math(test o) 
        {
            o.a *= 2;
            o.b /= 2;
        } 
}
