/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        //assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
        assertNotNull(classUnderTest.getGreeting());
    }

    @Test
    void isCalculatorNotNull() {
        Calculator c = new Calculator();
        assertNotNull(c);
    }

    @Test
    void canAdd() {
        Calculator c = new Calculator();
        int result = c.add(1, 1);
        assert(2 == result);
    } 
}
