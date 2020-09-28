import org.junit.Test;

public class ATest {
   @Test
   public void test() {
      ProtoStreamContextInitializer initializer = new ProtoStreamContextInitializerImpl();

      A a = new A();
      System.out.println(a.getA());
   }
}
