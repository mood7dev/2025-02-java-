package Starcraft;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class DropShipTest {
    DropShip dropShip = new DropShip();

    @Test
    @DisplayName("한 명도 태우지 않고 unload 시키기")
    public void test3() {
        GroundUnit gu = dropShip.unload();
        assertNull(gu);

        assertEquals(0,dropShip.loadedIndex);
    }

    @Test
    @DisplayName("드랍십에 마린 2명 떨구기")
public void test2() {
        DropShip dropShip = new DropShip();
        for(int i=0; i < dropShip.units.length; i++) {
            dropShip.load(new Marine());
        }
        for(GroundUnit gu : dropShip.units) {
            assertNotNull(gu);
        }
        boolean result = dropShip.load(new Marine());
        assertEquals(false, result);

        GroundUnit gu = dropShip.unload();
        assertNotNull(gu);
        assertNull(dropShip.units[dropShip.units.length-1]);
        assertEquals(7, dropShip.loadedIndex);

        GroundUnit gu2 = dropShip.unload();
        assertNotNull(gu2);
        assertNull(dropShip.units[dropShip.units.length-2]);
        assertEquals(6, dropShip.loadedIndex);

        assertNotEquals(gu, gu2);
    }
}