package guru.springframework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Created by jt on 2018-12-15.
 */
public class Junit5Test {

   @Disabled
    @Test
   public  void testFakeTest() {
    JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        System.out.println("**************Runnit Junit 5 (V) ********************************");
       assertEquals("Hello World", javaHelloWorld.getHello());
    }
}
