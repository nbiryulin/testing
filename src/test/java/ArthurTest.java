import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class ArthurTest {


    @Test
    public void lying() {
        Arthur arthur = new Arthur(mock(Place.class), mock(Brain.class));
        arthur.lieDown();
        assertEquals(arthur.getPosition(), Position.LYING);
    }

    @Test
    public void testPlace() {
        Place place = new Place(0.0, 0.0, 0.0, 12, Form.SQUARE);
        Cabin cabin = new Cabin(place, 3);
        Arthur arthur = new Arthur(mock(Place.class), mock(Brain.class));
        arthur.goTo(cabin.getCurrentPosition());
        assertEquals("Arthur is not in cabin", 0.0, arthur.countDistance(cabin.getCurrentPosition()), 0);
    }

    @Test
    public void testReading() {
        Arthur arthur = new Arthur(mock(Place.class), mock(Brain.class));
        HitchhikerGuideToGalaxy hitchhikerGuideToGalaxy = new HitchhikerGuideToGalaxy();

        arthur.leaf(hitchhikerGuideToGalaxy);

        assertEquals(hitchhikerGuideToGalaxy.getCurrentPage(), 1);
    }

    @Test
    public void thinkAboutLife() {
        Brain brain = new Brain(new HashMap<>());
        Arthur arthur = new Arthur(mock(Place.class), brain);
        Life life = mock(Life.class);

        Knowledge knowledge = new Knowledge("Life there is boring.", 10);
        arthur.getToKnow(knowledge, life);

        assertEquals(arthur.getOpinionAbout(life), knowledge);

        arthur.think(life);
        assertTrue(arthur.getOpinionAbout(life).getStrength() > 10);
    }

    @Test
    public void testGetToKnowLocalManners() {
        Brain brain = new Brain(new HashMap<>());
        Arthur arthur = new Arthur(mock(Place.class), brain);
        LocalManners localManners = mock(LocalManners.class);

        Knowledge knowledge = new Knowledge(" ", 0);
        arthur.getToKnow(knowledge, localManners);

        assertEquals(arthur.getOpinionAbout(localManners), knowledge);
    }
}
