import java.io.IOException;
import java.util.Properties;

import org.infinispan.protostream.annotations.ProtoField;

public class A {
   private int a;

   @ProtoField(number = 1, defaultValue = "0")
   public int getA() {
      return a;
   }

   public void setA(int a) {
      this.a = a;
   }
}
