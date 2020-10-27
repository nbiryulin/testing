package test.java;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class TrillianTest {


    @Test
    public void testSitting() {
        Trillian trillian = new Trillian(mock(Place.class), mock(Brain.class));
        assertEquals(trillian.getPosition(), Position.STANDING);
        trillian.sit();
        assertEquals(trillian.getPosition(), Position.SITTING);
    }

    @Test
    public void testDiscussingLife() {
        Brain trillianBrain = new Brain(new HashMap<Thinkable, Knowledge>());
        Brain fordbrain = new Brain(new HashMap<Thinkable, Knowledge>());

        Ford ford = new Ford(mock(Place.class), fordbrain);
        Trillian trillian = new Trillian(mock(Place.class), trillianBrain);
        Life life = mock(Life.class);

        Knowledge trillianLife = new Knowledge("Life is amazing", -1);
        trillian.getToKnow(trillianLife, life);

        Knowledge fordLife = new Knowledge("Life is disgusting", 5);
        ford.getToKnow(fordLife, life);

        assertEquals(trillianLife, trillian.getOpinionAbout(life));

        trillian.discuss(life, ford);
        assertEquals(trillian.getOpinionAbout(life).getOpinion(), trillianLife.getOpinion());
    }

    @Test
    public void testDiscussingLifeEffects() {
        Brain trillianBrain = new Brain(new HashMap<Thinkable, Knowledge>());
        Brain fordbrain = new Brain(new HashMap<Thinkable, Knowledge>());

        Ford ford = new Ford(mock(Place.class), fordbrain);
        Trillian trillian = new Trillian(mock(Place.class), trillianBrain);
        Life life = mock(Life.class);
        Effects effects = new Effects(life);

        Knowledge trillianLifeEffects = new Knowledge("After life comes another life", 0);
        trillian.getToKnow(trillianLifeEffects, effects);

        Knowledge fordLifeEffects = new Knowledge("Nothing comes after life", 0);
        ford.getToKnow(fordLifeEffects, effects);

        assertEquals(trillianLifeEffects, trillian.getOpinionAbout(effects));

        String expected = fordLifeEffects.getOpinion() + ". But maybe " + trillianLifeEffects.getOpinion();
        trillian.discuss(effects, ford);

        assertEquals(expected, trillian.getOpinionAbout(effects).getOpinion());
    }

}
