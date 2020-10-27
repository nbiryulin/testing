package test.java;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ZafodTest {

    @Test
    public void testLyingOnBridge() {
        Place startPoint = new Place(0.0, 0.0, 0.0, 2.0, Form.SQUARE);
        Zafod zafod = new Zafod(startPoint, mock(Brain.class));
        Bridge bridge = new Bridge();
        Palm palm = new Palm();
        assertTrue(zafod.countDistance(palm.getCurrentPosition()) > 15);
        assertEquals(zafod.getPosition(), Position.STANDING);
        zafod.lieDown();
        assertEquals(zafod.getPosition(), Position.LYING);
        System.out.println(zafod.countDistance(palm.getCurrentPosition()));
        zafod.goTo(bridge.getCurrentPosition());
        System.out.println(zafod.countDistance(palm.getCurrentPosition()));
        assertTrue("Bridge is not near Palm", zafod.countDistance(palm.getCurrentPosition()) < 15);
    }

    @Test
    public void fixingBrains() {
        Brain brain = new Brain(new HashMap<Thinkable, Knowledge>());
        Zafod zafod = new Zafod(mock(Place.class), brain);
        BulkBluster bulkBluster1 = mock(BulkBluster.class);
        when(bulkBluster1.getCount()).thenReturn(Integer.MIN_VALUE);
        zafod.tryToFixBrains(bulkBluster1);
        assertTrue("Little count of bulkBluster fixed brain", !zafod.getBrain().isFixed());
        BulkBluster bulkBluster2 = mock(BulkBluster.class);
        when(bulkBluster2.getCount()).thenReturn(Integer.MAX_VALUE);
        zafod.tryToFixBrains(bulkBluster2);
        assertTrue("Brain didn't fixed after max count of bulkBBlusters.", zafod.getBrain().isFixed());
    }
}
