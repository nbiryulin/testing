import java.util.Objects;

public class People extends Placeable implements Alive, Thinkable {

    private final Brain brain;
    private final String name;
    private Position position;


     public People(Place currentPosition, Brain brain, String name, Position position) {
        super(currentPosition);
        this.brain = brain;
        this.name = name;
        this.position = position;
    }

    public void talk(String words) {
        System.out.println(words);
    }

    public void getToKnow(Knowledge knowledge, Thinkable topic) {
        brain.addKnowledge(topic, knowledge);
    }

    public Knowledge getOpinionAbout(Thinkable topic) {
        return brain.getKnowledge(topic);
    }

    public void talkAbout(Thinkable opinion) {
        System.out.println(brain.getKnowledge(opinion).getOpinion());
    }

    public void think(Thinkable about) {
        Knowledge knowledge = brain.getKnowledge(about);
        if (knowledge.getStrength() > 0) {
            System.out.println(name + " strongly believes that " + knowledge.getOpinion());
        } else {
            System.out.println(name + " not sure that " + knowledge.getOpinion());
        }
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void changePosition(Position position) {
        setPosition(position);
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


    //обсуждать
    //talk
    //talk about
    //лежать
    //читать
    //жить
    //думать
    //учить
}
