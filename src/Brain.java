import java.util.Map;

public class Brain implements Thinkable {

    private Map<Thinkable, Knowledge> experience;

    public Map<Thinkable, Knowledge> getExperience() {
        return experience;
    }

    public void setExperience(Map<Thinkable, Knowledge> experience) {
        this.experience = experience;
    }

    public void addKnowledge(Thinkable topic, Knowledge knowledge) {
        experience.put(topic, knowledge);
    }

    public Knowledge getKnowledge(Thinkable topic){
        return experience.get(topic);
    }


}
