package main.java;

import java.util.Objects;

public class People extends Placeable implements Alive, Thinkable {

    private final String name;
    private Brain brain;
    private Position position;


    public People(Place currentPosition, Brain brain, String name, Position position) {
        super(currentPosition);
        this.brain = brain;
        this.name = name;
        this.position = position;
    }

    public void getToKnow(Knowledge knowledge, Thinkable topic) {
        brain.addKnowledge(topic, knowledge);
    }

    public Knowledge getOpinionAbout(Thinkable topic) {
        return brain.getKnowledge(topic);
    }


    public void think(Thinkable about) {
        Knowledge knowledge = brain.getKnowledge(about);
        if (knowledge.getStrength() > 0) {
            System.out.println(name + " strongly believes that " + knowledge.getOpinion());
            knowledge.setStrength(knowledge.getStrength() + 1);
        } else {
            System.out.println(name + " not sure that " + knowledge.getOpinion());
            knowledge.setStrength(knowledge.getStrength() - 1);
        }
    }

    public void discuss(Thinkable topic, People with) {
        Knowledge first = brain.getKnowledge(topic);
        Knowledge second = with.brain.getKnowledge(topic);

        if (first.getStrength() > second.getStrength()) {
            second.setOpinion(first.getOpinion());
        } else if (first.getStrength() < second.getStrength()) {
            first.setOpinion(second.getOpinion());
        } else {
            String result = second.getOpinion() + ". But maybe " + first.getOpinion();
            first.setOpinion(result);
            second.setOpinion(result);
        }
        getToKnow(first, topic);
        with.getToKnow(second, topic);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void sit() {
        setPosition(Position.SITTING);
    }

    public void lieDown() {
        setPosition(Position.LYING);
    }

    public void standUp() {
        setPosition(Position.STANDING);
    }

    public void tryToFixBrains(BulkBluster bulkBluster) {
        if (bulkBluster.getCount() > Integer.MAX_VALUE / 2) {
            brain.setFixed(true);
            System.out.println("Success");
        } else {
            System.out.println("Unsuccessful");
        }
    }

    public void leaf(Book book) {
        book.setCurrentPage(book.getCurrentPage() + 1);
    }

    public void goTo(Place place) {
        setCurrentPosition(place);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof People)) return false;
        People people = (People) o;
        return brain.equals(people.brain) &&
                name.equals(people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brain, name);
    }

    public Brain getBrain() {
        return brain;
    }

}
