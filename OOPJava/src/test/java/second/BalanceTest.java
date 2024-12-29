package second;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceTest {

    @Test
    void testEqualWeights() {
        Balance balance = new Balance();
        balance.addLeft(5);
        balance.addRight(5);
        assertEquals("=", balance.result());
    }

    @Test
    void testLeftHeavy() {
        Balance balance = new Balance();
        balance.addLeft(10);
        balance.addRight(5);
        assertEquals("L", balance.result());
    }

    @Test
    void testRightHeavy() {
        Balance balance = new Balance();
        balance.addLeft(5);
        balance.addRight(10);
        assertEquals("R", balance.result());
    }
}