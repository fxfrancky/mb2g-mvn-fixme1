package guru.springframework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaHelloWorldTest {

    @Test
    public void testGetHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        System.out.println("**************Runnit Junit 4 (IV) ********************************");

        assertEquals("Hello World", javaHelloWorld.getHello());
    }
}