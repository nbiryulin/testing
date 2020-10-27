package test.java;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class GoldenHeartTest {

    @Test
    public void testFly() {
        GoldenHeart goldenHeart = new GoldenHeart(100, new Place(0.0, 0.0, 0.0, 1, Form.CURVE));
        HorseHead horseHead = new HorseHead();
        double distanceBefore = goldenHeart.countDistance(horseHead.getCurrentPosition());
        goldenHeart.fly(horseHead.getCurrentPosition(), 3000);
        double distanceAfter = goldenHeart.countDistance(horseHead.getCurrentPosition());
        assertTrue("Distance ", distanceBefore > distanceAfter);


        goldenHeart.fly(horseHead.getCurrentPosition(), 0);
        double distanceAfterAfter = goldenHeart.countDistance(horseHead.getCurrentPosition());
        assertEquals(distanceAfter, distanceAfterAfter);

        Place inversed = inverse(horseHead.getCurrentPosition());
        goldenHeart.fly(inversed, 2000);
        double lastDistance = goldenHeart.countDistance(horseHead.getCurrentPosition());
        assertTrue(lastDistance > distanceAfter);
        assertTrue(lastDistance < distanceBefore);
    }

    private Place inverse(Place place) {
        place.x = inverse(place.x);
        place.y = inverse(place.y);
        place.z = inverse(place.z);
        return place;
    }

    private double inverse(double a) {
        return -a;
    }
}
