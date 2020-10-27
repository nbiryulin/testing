package test.java;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class FordAndTrillianTest {


    @Test
    public void testSitting() {
        Ford ford = new Ford(mock(Place.class), mock(Brain.class));
        Trillian trillian = new Trillian(mock(Place.class), mock(Brain.class));
        ford.sit();
        trillian.sit();

        assertEquals(ford.getPosition(), Position.SITTING);
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

        assertEquals(fordLife, ford.getOpinionAbout(life));
        assertEquals(trillianLife, trillian.getOpinionAbout(life));

        ford.discuss(life, trillian);
        assertEquals(ford.getOpinionAbout(life).getOpinion(), fordLife.getOpinion());
        assertEquals(trillian.getOpinionAbout(life).getOpinion(), fordLife.getOpinion());
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

        assertEquals(fordLifeEffects, ford.getOpinionAbout(effects));
        assertEquals(trillianLifeEffects, trillian.getOpinionAbout(effects));

        String expected = fordLifeEffects.getOpinion() + ". But maybe " + trillianLifeEffects.getOpinion();
        trillian.discuss(effects, ford);

        assertEquals(expected, ford.getOpinionAbout(effects).getOpinion());
        assertEquals(expected, trillian.getOpinionAbout(effects).getOpinion());
    }

}
