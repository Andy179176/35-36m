import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main2 {

    public static void main(String[] args) {

        Path s;

        int a = 2;
        int b = 8;

        long res = 1;
        System.out.printf("%d^%d=%f%n",a,b, Math.pow(a,b));

        while (b>0) {
            res *= a;    // res=res*a     1*a*a*a*a
            b-=1;       // b=b-1
        }

        System.out.println(res);


    }
}
