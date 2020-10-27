package main.java;

import java.util.Map;
import java.util.Objects;

public class Brain implements Thinkable {

    private Map<Thinkable, Knowledge> experience;

    private boolean fixed;

    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    public Map<Thinkable, Knowledge> getExperience() {
        return experience;
    }

    public void setExperience(Map<Thinkable, Knowledge> experience) {
        this.experience = experience;
    }

    public void addKnowledge(Thinkable topic, Knowledge knowledge) {
        experience.put(topic, knowledge);
    }

    public Brain(Map<Thinkable, Knowledge> experience) {
        this.experience = experience;
    }

    public Knowledge getKnowledge(Thinkable topic){
        return experience.get(topic);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brain brain = (Brain) o;
        return Objects.equals(experience, brain.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(experience);
    }
}
