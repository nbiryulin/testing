import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ZafodTest {

    @Test
    public void testLyingOnBridge() {
        Zafod zafod = mock(Zafod.class);
        Bridge bridge = new Bridge();
        Palm palm = new Palm();
        zafod.goTo(bridge.getCurrentPosition());
        assertTrue("Bridge is not near Palm", zafod.countDistance(palm.getCurrentPosition()) < 1);
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
