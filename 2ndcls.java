public class 2ndcls {
import java.util.*
interface MyInterface
{
    public void method() {
        class Sample implements MyInterface{
            public void method()
            {
                System.out.println("sample");    
            }
            public static void main(String arg[])
            {MyInterface obj = new demo();
            obj.method();
        }
        }
    }
}
}