package main.java;

public class Knowledge implements Thinkable {

    public Knowledge(String opinion, int strength) {
        this.opinion = opinion;
        this.strength = strength;
    }

    private String opinion;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    private int strength;

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}
