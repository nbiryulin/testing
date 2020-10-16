import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.mock;

public class GoldenHeartTest {

    @Test
    public void testFly(){
        GoldenHeart goldenHeart = new GoldenHeart(100, new Place(0.0, 0.0, 0.0, 1, Form.CURVE));
        HorseHead horseHead = new HorseHead();
        double distanceBefore = goldenHeart.countDistance(horseHead.getCurrentPosition());
        goldenHeart.fly(horseHead.getCurrentPosition(), 3000);
        double distanceAfter = goldenHeart.countDistance(horseHead.getCurrentPosition());
        assertTrue("Distance ",distanceBefore > distanceAfter);
    }
}
